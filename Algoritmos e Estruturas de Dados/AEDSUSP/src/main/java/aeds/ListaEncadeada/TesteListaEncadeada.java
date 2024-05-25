package aeds.ListaEncadeada;

import java.util.Scanner;

public class TesteListaEncadeada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String cpf;
        //Ler cpf e verificar se tem 10 digitos
        while(true){
            try{
                cpf = scan.nextLine();
                validarCpf(cpf);
                    System.out.println("Cpf valido");
            break;


            }catch(IllegalArgumentException e){
                System.out.println("ERRO: "+e.getMessage());
            }
            {

            }
        }

    }

    private static boolean validarCpf(String cpf){
        if(cpf.length()!=8){
            throw new IllegalArgumentException("não possui 11 digitos");
        }
        return true;
    }

}

