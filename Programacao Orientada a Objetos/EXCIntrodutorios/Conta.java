
package poo;

public class Conta {
    int numero;
    String titular;
    float saldo;
    public void consultarSaldo(){
        System.out.println("Seu saldo = R$"+this.saldo);
    }
    public void conta(){
        System.out.println("Nome de usuario: "+this.titular);
        System.out.println("Conta: "+this.numero);
        System.out.println("Seu saldo eh: R$"+this.saldo);
    }
    
    boolean sacar(float valor){
        if(valor <= this.saldo){
            this.saldo = this.saldo - valor;
            return true;
        }else{
            return false;
        }
    }
    public void depositar(double valor){
        this.saldo += + valor;
    }
    
}

class Principal{
    public static void main(String[] args){
        Conta a1;
        a1 = new Conta();
        a1.titular = "Maria";
        a1.saldo = 500.0f;
        a1.numero = 1234;
        a1.conta();
        boolean consegui;
        consegui = a1.sacar(100);
        if(consegui){
            System.out.println("*** Saldo suficiente. Por isso conseguiu sacar!");
        }else{
            System.out.println("*** Saldo Insuficiente. Você não consegue sacar");
            
        }
        a1.consultarSaldo();
    }
}
