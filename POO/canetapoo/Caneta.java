/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canetapoo;

public class Caneta {
    String marca;
    float ponta;
    String cor;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("A marca e : "+this.marca);
        System.out.println("A ponta e : "+this.ponta);
        System.out.println("A cor da e : "+this.cor);
        System.out.println("A carga esta em : "+this.carga+"%");
        System.out.println("Esta tampada? "+this.tampada);
        
    }
    void tampar(){
        this.tampada=true;
    }
    void destampar(){
        this.tampada=false;
    }
    void rabiscar(){
        if(this.tampada==true){
            System.out.println("ERRO! Nao posso rabiscar pois estou tampada");
        }else
        {   
            System.out.println("Estou rabiscando!");
        }
        
    }
}
