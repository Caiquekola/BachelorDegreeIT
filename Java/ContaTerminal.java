package org.example;

import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {
        int numero;
        String agencia, nomeCliente;
        Double saldo;

        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, digite o " +
                "número da Agência!");
        agencia = scan.nextLine();
        System.out.println("Digite o número da conta!");
        numero = scan.nextInt();
        scan.nextLine();
        System.out.println("Digite o seu nome!");
        nomeCliente = scan.nextLine();
        System.out.println("Digite o saldo!");
        saldo = scan.nextDouble();
        String resultado = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é " +
                "%s, conta %d seu saldo %.2f já está disponível para saque.",nomeCliente,agencia,numero,saldo);
        System.out.println(resultado);
    }

}
