package testeabrirfilepassword;

import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.FileHeader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;

public class TAFPSequencial{

    //Nome do arquivo TODO alterar para forma iterativa
    public static String numeroArquivo ="1";
    //"doc"+numeroArquivo
    public static final String nomeArquivo = "seloco";
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

        } catch (ZipException ex) {
            //erro na extração do arquivo
            return false;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return false;
    }


    public static void forcaBruta(){
        //126 - Space até ~ (Tabela ASCII)
        //3 Senhas
        int posicao0 =  0;
        int posicao1 = 0;
        int posicao2 = 0;
        int tamanho = 3;


        char[] senha = new char[tamanho];

        for(int ascii2 = 32; ascii2 <= 127; ascii2++){

            for(int ascii1 = 32; ascii1 <= 127; ascii1++){

                for (int ascii0 = 32; ascii0 <= 126; ascii0++) {
                    senha[posicao0] = (char)ascii0;
                    if(testaSenha(String.valueOf(senha,0,posicao0+1))){
                        return;
                    }else{
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

    public static void main(String[] args) {
        forcaBruta();
    }
}


