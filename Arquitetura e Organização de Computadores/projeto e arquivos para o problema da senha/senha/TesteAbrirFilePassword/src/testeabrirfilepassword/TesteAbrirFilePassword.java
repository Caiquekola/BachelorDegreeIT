package testeabrirfilepassword;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.FileHeader;

public class TesteAbrirFilePassword {

    //Nome do arquivo TODO alterar para forma iterativa
    public static final String nomeArquivo = "seloco";
    //Caminho absoluto da pasta
    public static final String caminho = "C:\\Users\\Caique\\Documents\\BachelorDegreeIT" +
            "\\Arquitetura e Organização de Computadores\\projeto e arquivos para o " +
            "problema da senha\\senha\\arquivosTP\\";


    public static boolean testaSenha(String senha){
        //Criar o ZipFile
        ZipFile zipFile = new ZipFile(new File(caminho+nomeArquivo+".zip"));
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

    public static void forcaBruta(){
        int ascii = 97;
        String senha = "VaiDar";
        for (; ascii <= 122; ascii++) {
            senha = String.valueOf((char)ascii);
            if(testaSenha(senha)){
                return;
            }else{
                System.out.print(senha+" ");
            }

        }
        System.out.println(senha);
        System.out.print(" "+testaSenha(String.valueOf((char)ascii)));
        //Posso criar um arquivo com todas as senhas testas ...


    }
    public static void main(String[] args) {
        //Força bruta
//        System.out.println();
        forcaBruta();
        //1° teste: Testar apenas as letras minúsculas

    }
}
