/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabanco;

/**
 *
 * @author 0056837
 */
public class Conta {
    Cliente titular;
    private int numero;
    private float saldo;
    public Conta(){
        numero = 0000;
        saldo = 0.0f;
    }
    public void transfere(Conta destino, float Valor){
        if(Valor<this.saldo){
            this.saldo -= Valor;
            destino.saldo += Valor;
            System.out.println("O R$"+Valor+" foi transferido de "+this.titular.getNome()+" para "+destino.titular.getNome());
        }else{
            System.out.println("Saldo insuficiente para transferencia");
        }
        
    }
    public void consultarSaldo(){
        System.out.println(String.format("Saldo da conta %d = R$%,.2f",this.numero,this.saldo));
    }
    public void conta(){
        System.out.println("Conta: "+this.numero);
        System.out.println("Nome de usuario: "+this.titular.getNome());
        System.out.println("Seu CPF: "+titular.getCpf());
        System.out.println("Seu telefone: "+titular.getFone());
        System.out.println("Seu endereco: "+titular.getEndereco());
        System.out.println(String.format("Seu saldo eh: R$%,.2f",this.saldo));
    }
    
    public void sacar(float valor){
        if(valor <= this.saldo&valor>0){
            this.saldo = this.saldo - valor;
            System.out.println(String.format("\nSaque de R$%,.2f efetuado!",valor));
            System.out.printf("Saldo atual R$%,.2f",this.getSaldo());
        }else{
            System.out.println("Saldo insuficiente para saque!");
        }
    }
    public void depositar(double valor){
        
        if(valor<0){
            this.saldo += 0;
            System.out.println("Impossivel depositar");
        }else{
            
            this.saldo += valor;
            System.out.printf("Saldo atual R$%,.2f\n",this.getSaldo());
        }
    }
    
    public void setNumero(int Numero){
        this.numero = Numero;
    }
    public int getNumero(){
        return this.numero;
    }
    
    private void setSaldo(float Saldo){
        this.saldo = Saldo;
    }
    public float getSaldo(){
        return saldo;
    }
    
    public Cliente getTitular(){
        return titular;
    }
    public void setTitular(Cliente x){
        this.titular = x;
    }
}
