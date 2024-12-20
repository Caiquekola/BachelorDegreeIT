package testeabrirfilepassword;

import java.io.*;
import java.nio.file.Files;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.FileHeader;

import static testeabrirfilepassword.Main.tempoI;

public class TesteAbrirFilePassword extends Thread{
    public static Object trava = new Object();
    public static AtomicBoolean senhaDescoberta = new AtomicBoolean(false);
    //Nome do arquivo TODO alterar para forma iterativa
    public static String numeroArquivo = "1";
    public static String getNumeroArquivo() {
        synchronized (trava){
            return numeroArquivo;
        }
    }
    public static void setNumeroArquivo(String numeroArquivo) {
        synchronized (trava){
            TesteAbrirFilePassword.numeroArquivo = numeroArquivo;
        }
    }
    public static String nomeArquivo = "doc"+getNumeroArquivo();
    //Caminho absoluto da pasta
    public static final String caminho = "D:\\Projetos\\BachelorDegreeIT\\Arquitetura e Organização de Computadores\\projeto e arquivos para o problema da senha\\senha\\arquivosTP";
    private final int min;
    private final int max;

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
                ps.println(System.currentTimeMillis()- tempoI);
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
        int tamanho = 3;
        char[] senha = new char[tamanho];
        for(int ascii2 = min-1; ascii2 <= max; ascii2++){
            System.out.println(ascii2);
            for(int ascii1 = 31; ascii1 <= 126; ascii1++){
                for (int ascii0 = 32; ascii0 <= 126; ascii0++) {

                    senha[posicao0] = (char)ascii0;
                    if(testaSenha(String.valueOf(senha,0,posicao0+1))){
                        senhaDescoberta.set(true);
                        Main.tempoF = System.currentTimeMillis();
                        System.out.println(Main.tempoF- tempoI);
                        return;
                    }else{
                        if(getSenhaDescoberta()){
                            ascii2= max+1;
                            ascii1 = 128;
                            ascii0 = 127;
                        }
                        if(ascii2==111){
                            System.out.print("["+String.valueOf((senha),0,(posicao0+1))+"] ");
                        }
                    }
                }
                senha[posicao1] = (char)ascii1;
                posicao0 = posicao1 + 1;
            }
            posicao1 = 1;
            senha[posicao2] = (char)ascii2;
        }
    }

    @Override
    public void run() {
        forcaBruta(min,max);
    }


    public TesteAbrirFilePassword() {
        min = 32;
        max = 126;
    }
    public TesteAbrirFilePassword(String numeroArquivo, int min, int max) {
        setNumeroArquivo(numeroArquivo);
        this.nomeArquivo = "doc"+getNumeroArquivo();
        this.min = min;
        if(max>126){
            this.max = 126;
        }else{
            this.max = max;
        }

    }
    public boolean getSenhaDescoberta() {
        synchronized (trava){
            return senhaDescoberta.get();
        }
    }


}

class Main{

    public static long tempoF = 0L;
    public static long tempoI = 0L;


    public static void main(String[] args) {


        int numCpu = Runtime.getRuntime().availableProcessors();
        //Número de Caracteres totais, de espaço até ~
        float numCaracteres = 94.0f;
        int qntCaracteresNucleo = (int) Math.ceil(numCaracteres/numCpu);

        int minValue = 32;
        int maxValue = 31+qntCaracteresNucleo;
        TesteAbrirFilePassword[] testadores = new TesteAbrirFilePassword[numCpu];


        File caminho = new File(TesteAbrirFilePassword.caminho);
        File arquivos[] = caminho.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().startsWith("doc") & name.toLowerCase().endsWith(".zip");
            }
        });

        int contadorZips = 0;

        for(File todosArquivos: arquivos){
            contadorZips++;
            minValue = 32;
            maxValue = 31+qntCaracteresNucleo;
            tempoI = System.currentTimeMillis();
            for (int i = 0; i < numCpu; i++) {
                //Se o testador for o último passe a quantidade restante de caracteres
                testadores[i] = new TesteAbrirFilePassword(String.valueOf(contadorZips),minValue, maxValue);
                minValue = maxValue+1;
                maxValue += qntCaracteresNucleo;
            }
            for(TesteAbrirFilePassword t : testadores){
                t.start();
            }
            for(TesteAbrirFilePassword t : testadores){
                try {
                    t.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            TesteAbrirFilePassword.senhaDescoberta.set(false);
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
                    MainSequencial.tempoF = System.currentTimeMillis();
                    ps.println(MainSequencial.tempoF-MainSequencial.tempoI);
                    ps.close();
                }
            }
        } catch (ZipException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}