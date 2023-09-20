/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabanco;

/**
 *
 * @author 0056837
 */
import java.util.Scanner;
public class Principal {

    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conta conta1 = new Conta();
        Cliente cli1 = new Cliente();
        conta1.titular = cli1;
        System.out.print("Informe o numero da conta\n>> ");
        conta1.setNumero(Integer.parseInt(scan.nextLine()));
        System.out.print("Informe seu nome\n>> ");
        conta1.titular.setNome(scan.nextLine());
        System.out.print("Informe seu CPF\n>> ");
        conta1.titular.setCpf(scan.nextLine());
        System.out.print("Informe seu telefone\n>> ");
        conta1.titular.setFone(scan.nextLine());
        System.out.print("Informe seu endereco\n>> ");
        conta1.titular.setEndereco(scan.nextLine());
        conta1.conta();
        int opcao = scan.nextInt();
        while(opcao!=2|opcao!=1){
            
        }
        
        
    }
    
}
