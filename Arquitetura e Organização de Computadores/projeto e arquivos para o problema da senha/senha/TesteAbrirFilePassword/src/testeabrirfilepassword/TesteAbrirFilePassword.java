package testeabrirfilepassword;

import java.io.File;
import java.util.List;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.FileHeader;

public class TesteAbrirFilePassword {

    //caminho absoluto da pasta
    public static final String caminho = "C:\\Users\\Caique\\Desktop\\Projetos\\BachelorDegreeIT" +
            "\\Arquitetura e Organização de Computadores\\projeto e arquivos para o problema da senha\\senha\\arquivosTP";

    public static boolean testaSenha(String senha){
        
        //necessário trocar o nome do arquivo de maneira iterativa
        //sugiro add um parâmetro para tal...
        ZipFile zipFile = new ZipFile(new File(caminho + "\\seloco.zip"));
        try {
            
            //encriptado?
            if (zipFile.isEncrypted()) {
                zipFile.setPassword(senha.toCharArray());
            }
            List fileHeaderList = zipFile.getFileHeaders();

            for (int i = 0; i < fileHeaderList.size(); i++) {
                FileHeader fileHeader = (FileHeader) fileHeaderList.get(i);
                //onde você deseja extrair (neste caso no mesmo caminho)
                zipFile.extractFile(fileHeader, caminho);
                System.out.println("Senha descoberta! ("+senha+")");
                return true;
            }

        } catch (net.lingala.zip4j.exception.ZipException ex) {
            //erro na extração do arquivo
            return false;
        }
        
        return false;
    }

    public static void forcaBruta(){
        int ascii = 97;
        String senha = "VaiDar";
        for (; ascii <= 122; ascii++) {
            senha = String.valueOf((char)ascii);
            if(testaSenha(senha)){
                break;
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
