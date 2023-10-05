/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio;

/**
 *
 * @author 0056837
 */
class Contador{
    private int contador;
    public Contador(){
        this.contador = 0;
    }
    public void zerar(){
        this.contador=0;
    }
    public void incrementar(){
        this.contador++;
    }
    public int status(){
        return this.contador;
    }
}
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contador c1 = new Contador();
        c1.incrementar();
        c1.incrementar();
        System.out.println(c1.status());
        c1.zerar();
        System.out.println(c1.status());
        
    }
    
}
