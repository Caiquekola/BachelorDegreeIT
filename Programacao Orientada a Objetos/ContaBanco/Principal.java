/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author 0056837
 */
import java.util.Scanner;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta c1, c2;
        c1 = new Conta();
        c2 = new Conta();
        
        Cliente cli1 = new Cliente();
        Cliente cli2 = new Cliente();
        
        Scanner scan = new Scanner(System.in);
        
        c1.titular = cli1;
        c1.numero = 1234;
        c1.saldo = 1200.0f;
        c1.titular.nome = "Caique";
        cli1.cpf = "17173932688";
        c1.titular.endereco = "Sao Paulo, SP";
        cli1.fone = "987654321";
        System.out.println(c1.titular.nome);
        c1.sacar(100);
        
        
        c2.saldo = 1200.0f;
        c2.titular = cli2;
        c2.titular.nome = "Alexya";
        c1.conta();
        c2.conta();
        c1.transfere(c2, 1000);
        c1.consultarSaldo();
        c2.consultarSaldo();
        
    }
    
}
