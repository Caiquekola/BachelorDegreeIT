package testeabrirfilepassword;

import java.io.*;
import java.nio.file.Files;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.FileHeader;

public class TAFPSequencial{
    //Nome do arquivo TODO alterar para forma iterativa
    public static String numeroArquivo;
    public static String nomeArquivo;
    //Caminho absoluto da pasta
    public static final String caminho = "C:\\Users\\Caique\\Documents\\BachelorDegreeIT\\Arquitetura e Organização de Computadores" +
            "\\projeto e arquivos para o problema da senha\\senha\\arquivosTP";

    private final int min;
    private final int max;

    public TAFPSequencial(String numeroArquivo, int min, int max) {
        this.numeroArquivo = numeroArquivo;
        this.nomeArquivo = "doc"+numeroArquivo;
        this.min = min;
        if(max>126){
            this.max = 126;
        }else{
            this.max = max;
        }

    }



    public static boolean testaSenha(String senha){
        //Criar o ZipFile
        ZipFile zipFile = new ZipFile(new File(caminho+"\\"+nomeArquivo+".zip"));

        try {

            //encriptado?
            if (zipFile.isEncrypted()) {
                zipFile.setPassword(senha.toCharArray());
            }
            List fileHeaderList = zipFile.getFileHeaders();

            for (int i = 0; i < fileHeaderList.size(); i++) {
                FileHeader fileHeader = (FileHeader) fileHeaderList.get(i);
//                Onde desejo extrair! Neste caso, desejo extrair em uma pasta com o mesmo
//                Nome do arquivo
                zipFile.extractFile(fileHeader, caminho+"\\"+nomeArquivo);
                //Exibo a senha no Console
                System.out.println("\nSenha descoberta! ("+senha+")");
                //Criação de um arquivo chamda 'SENHA' com a senha do ZIP encontrada
                File file = new File(caminho+"\\"+nomeArquivo+"\\"+nomeArquivo+"Senha.txt");
                PrintStream ps = new PrintStream(file);
                ps.println(senha);
                ps.close();
                return true;
            }

        } catch (net.lingala.zip4j.exception.ZipException ex) {
            //erro na extração do arquivo
            return false;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return false;
    }


    public void forcaBruta(int min, int max){
        //126 - Space até ~ (Tabela ASCII)
        //3 Senhas
        int posicao0 =  0;
        int posicao1 = 0;
        int posicao2 = 0;
        //Tamanho da senha (neste caso três caracteres)
        int tamanho = 3;


        char[] senha = new char[tamanho];
        for(int ascii2 = min; ascii2 <= max; ascii2++){
            for(int ascii1 = 32; ascii1 <= 127; ascii1++){
                for (int ascii0 = 32; ascii0 <= 126; ascii0++) {
                    senha[posicao0] = (char)ascii0;
                    if(testaSenha(String.valueOf(senha,0,posicao0+1))){
                        MainSequencial.tempoF = System.currentTimeMillis();
                        System.out.println(MainSequencial.tempoF-MainSequencial.tempoI);
                        return;
                    }else{
                        System.out.print("["+String.valueOf((senha),0,(posicao0+1))+"] ");
                    }

                }
                senha[posicao1] = (char)ascii1;
                //Quando acaba o primeiro for eu garanto que o primeiro caracter vai ser testado todas as possibiliddades
                //E o for de dentro pula para a segunda posição
                posicao0 = posicao1 + 1;
            }
            posicao1 = 1;
            senha[posicao2] = (char)ascii2;
        }
    }





}

class MainSequencial{

    public static long tempoF = 0L;
    public static long tempoI = 0L;


    public static void main(String[] args) {


        int numCpu = Runtime.getRuntime().availableProcessors();
        //Número de Caracteres totais, de espaço até ~
        int minValue = 32;
        int maxValue = 126;

        File caminho = new File(TAFPSequencial.caminho);
        //Adiciono todos os zips dentro de um vetor de file
        File arquivos[] = caminho.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().startsWith("doc") & name.toLowerCase().endsWith(".zip");
            }
        });

        int contadorZips = 1;
        TAFPSequencial quebradorDeSenha;
        for(File todosArquivos: arquivos){
            quebradorDeSenha = new TAFPSequencial(String.valueOf(contadorZips), minValue, maxValue);
            contadorZips++;
            tempoI = System.currentTimeMillis();
            quebradorDeSenha.forcaBruta(minValue,maxValue);
        }
        //TODO Abrir, gerenciar a pasta final e mostrar a senha

        arquivos = new File[contadorZips];
        for(int i = 0; i < arquivos.length; i++){
            int j = i+1;
            arquivos[i] = new File(caminho+"\\doc"+j+"\\doc"+j+"Senha.txt");
        }
        String ultimaSenha = "";
        if(arquivos.length!=0){
            for(File arquivo: arquivos){
                try {
                    ultimaSenha += new String(Files.readAllBytes(arquivo.toPath())).replaceAll("\r", "").replaceAll("\n", "");
                    System.out.println(ultimaSenha);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }else{
            throw new RuntimeException("Erro, não é possível descriptografar a senha do arquivo final");
        }
        ZipFile zipFinal = new ZipFile(new File(caminho+"\\final.zip"));

        //encriptado?
        try {
            if (zipFinal.isEncrypted()) {
                zipFinal.setPassword(ultimaSenha.toCharArray());
                List fileHeaderList = zipFinal.getFileHeaders();

                for (int i = 0; i < fileHeaderList.size(); i++) {
                    FileHeader fileHeader = (FileHeader) fileHeaderList.get(i);
//                Onde desejo extrair! Neste caso, desejo extrair em uma pasta com o mesmo
//                Nome do arquivo
                    zipFinal.extractFile(fileHeader, caminho+"\\final");
                    //Exibo a senha no Console
                    System.out.println("\nSenha descoberta! ("+ultimaSenha+")");
                    //Criação de um arquivo chamda 'SENHA' com a senha do ZIP encontrada
                    File file = new File(caminho+"\\Final\\FinalSenha.txt");
                    PrintStream ps = new PrintStream(file);
                    ps.println(ultimaSenha);
                    ps.close();
                }
            }
        } catch (ZipException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}