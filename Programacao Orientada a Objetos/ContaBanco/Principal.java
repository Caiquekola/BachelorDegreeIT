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
import java.util.ArrayList;
public class Principal {

    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList<Conta>();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        int opcao=1,contador=0,numContas=0,transferido=0;
        while(opcao>=1&opcao<=5){
            System.out.println("(1) Criar uma conta");
            System.out.println("(2) Saldo de uma conta");
            System.out.println("(3) Sacar");
            System.out.println("(4) Depositar");
            System.out.println("(5) Transferir");
            System.out.println("(6) Finalizar operacao");
            System.out.print(">> ");
            
            opcao = scan.nextInt();
            scan.nextLine();
            System.out.println("");
            switch(opcao){
                case 1: 
                    contas.add(new Conta());
                    clientes.add(new Cliente());
                    contas.get(numContas).titular = clientes.get(numContas);
                    System.out.print("Informe o nome do titular: ");
                    contas.get(numContas).titular.setNome(scan.nextLine());
                    System.out.print("Saldo Inicial R$");
                    contas.get(numContas).depositar(scan.nextFloat());
                    contas.get(numContas).setNumero(numContas);
                    System.out.println("O numero de sua conta eh "+numContas);
                    numContas++;
                    break;
                case 2:
                    if(numContas==0){
                        System.out.println("ERRO!\nCrie uma conta primeiro!");
                        opcao=1;
                        break;
                    }
                    System.out.println("Contas criadas ("+numContas+")");
                    System.out.print("Informe o numero da conta: ");
                    contador = scan.nextInt();
                    contas.get(contador).consultarSaldo();
                    break;
                case 3:
                    System.out.print("Informe o numero da conta: ");
                    contador = scan.nextInt();
                    System.out.print("Informe o valor a ser sacado: ");
                    contas.get(contador).sacar(scan.nextFloat());
                    
                    break;
                case 4:
                    System.out.println("Informe o numero da conta: ");
                    contador = scan.nextInt();
                    System.out.print("Informe o valor a ser depositado: ");
                    contas.get(contador).depositar(scan.nextFloat());
                    break;
                case 5: 
                    System.out.print("Informe a conta que realizara a transferencia: ");
                    contador = scan.nextInt();
                    System.out.print("Informe a conta que recebera: ");
                    transferido = scan.nextInt();
                    System.out.print("Informe o valor: R$");
                    contas.get(contador).transfere(contas.get(transferido), scan.nextFloat());
                    break;
            }
            System.out.println("");
        }
//        Conta conta1 = new Conta();
//        Cliente cli1 = new Cliente();
//        conta1.titular = cli1;
//        System.out.print("Informe o numero da conta\n>> ");
//        conta1.setNumero(Integer.parseInt(scan.nextLine()));
//        System.out.print("Informe seu nome\n>> ");
//        conta1.titular.setNome(scan.nextLine());
//        System.out.print("Informe seu CPF\n>> ");
//        conta1.titular.setCpf(scan.nextLine());
//        System.out.print("Informe seu telefone\n>> ");
//        conta1.titular.setFone(scan.nextLine());
//        System.out.print("Informe seu endereco\n>> ");
//        conta1.titular.setEndereco(scan.nextLine());
//        conta1.conta();

    }
    
}
