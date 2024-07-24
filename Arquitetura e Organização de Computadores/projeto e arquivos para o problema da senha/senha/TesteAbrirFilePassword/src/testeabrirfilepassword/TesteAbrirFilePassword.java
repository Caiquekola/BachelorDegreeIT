package testeabrirfilepassword;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.PrintStream;
import java.util.List;

import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.model.FileHeader;

public class TesteAbrirFilePassword extends Thread{

    //Nome do arquivo TODO alterar para forma iterativa
    public static String numeroArquivo ="1";
    public static String nomeArquivo = "doc"+numeroArquivo;
    //Caminho absoluto da pasta
    public static final String caminho = "C:\\Users\\Caique\\Documents\\BachelorDegreeIT" +
            "\\Arquitetura e Organização de Computadores\\projeto e arquivos para o problema da senha\\senha\\arquivosTP";


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
                File file = new File(caminho+"\\"+nomeArquivo+"\\Senha.txt");
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
        int tamanho = 3;


        char[] senha = new char[tamanho];
        for(int ascii2 = min; ascii2 <= max; ascii2++){
            for(int ascii1 = 32; ascii1 <= 127; ascii1++){
                for (int ascii0 = 32; ascii0 <= 126; ascii0++) {
                    senha[posicao0] = (char)ascii0;
                    if(testaSenha(String.valueOf(senha,0,posicao0+1))){
                        senhaDescoberta = true;
                        Main.tempoF = System.currentTimeMillis();
                        System.out.println(Main.tempoF-Main.tempoI);
                        return;
                    }else{
                        if(getSenhaDescoberta()){
                            ascii2= max+1;
                            ascii1 = 128;
                            ascii0 = 127;
                        }
                        System.out.print("["+String.valueOf((senha),0,(posicao0+1))+"] ");
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
    private final int min;
    private final int max;

    public TesteAbrirFilePassword() {
        min = 32;
        max = 126;
    }
    public TesteAbrirFilePassword(int min, int max) {
        this.min = min;
        this.max = max;
    }
    public boolean getSenhaDescoberta() {
        synchronized (trava){
            return senhaDescoberta;
        }
    }

    public Object trava = new Object();
    public static boolean senhaDescoberta = false;
}

class Main{

    public static long tempoF = 0l;
    public static long tempoI = 0l;


    public static void main(String[] args) {
        //Força bruta
        int numCpu = Runtime.getRuntime().availableProcessors();
        float numCaracteres = 94.0f;
        int qntCaracteresNucleo = (int) Math.ceil(numCaracteres/numCpu);
        int minValue = 32;
        int maxValue = 32+qntCaracteresNucleo;

        System.out.println(qntCaracteresNucleo);

        TesteAbrirFilePassword[] testadores = new TesteAbrirFilePassword[numCpu];

        tempoI = System.currentTimeMillis();
        //TODO Criar metodo para abrir todos os docs
        //File imagesFile[] = directory.listFiles();
        File caminho = new File(TesteAbrirFilePassword.caminho);
        File arquivos[] = caminho.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().startsWith("doc");
            }
        });
        int contadorZips = 2;
        for(File todosArquivos: arquivos){
            minValue = 32;
            maxValue = 32+qntCaracteresNucleo;

            for (int i = 0; i < numCpu; i++) {
                //Se o testador for o último passe a quantidade restante de caracteres
                if(i==numCpu-1){
                    testadores[i] = new TesteAbrirFilePassword(minValue, 126-maxValue);
                }
                testadores[i] = new TesteAbrirFilePassword(minValue, maxValue);
                minValue = maxValue+1;
                maxValue += qntCaracteresNucleo;
            }

            for(TesteAbrirFilePassword t : testadores){
                t.start();
            }


            TesteAbrirFilePassword.senhaDescoberta = false;
            TesteAbrirFilePassword.numeroArquivo = String.valueOf(contadorZips);
            contadorZips++;

        }
        //TODO Abrir, gerenciar a pasta final e mostrar a senha




    }
}
