/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author 0056837
 */
public class Conta {
    Cliente titular;
    int numero;
    float saldo;
    
    void transfere(Conta destino, float Valor){
        if(Valor<this.saldo){
            this.saldo -= Valor;
            destino.saldo += Valor;
        }else{
            System.out.println("Saldo insuficiente para transferencia");
        }
        
    }
    public void consultarSaldo(){
        System.out.println(String.format("Seu saldo = R$%,.2f",this.saldo));
    }
    public void conta(){
        System.out.println("Nome de usuario: "+this.titular.nome);
        System.out.println("Conta: "+this.numero);
        System.out.println(String.format("Seu saldo eh: R$%,.2f",this.saldo));
    }
    
    public void sacar(float valor){
        if(valor <= this.saldo){
            this.saldo = this.saldo - valor;
            System.out.println(String.format("Saque de R$%,.2f efetuado!",valor));
        }else{
            System.out.println("Saldo insuficiente para saque!");
        }
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
}
