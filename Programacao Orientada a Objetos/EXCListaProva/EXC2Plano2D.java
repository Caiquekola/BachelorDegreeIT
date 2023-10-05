/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ExerciciosPOO;
import java.lang.Math;
import java.util.ArrayList;

class Ponto2D{

    private double eixoX,eixoY;
    
    //ai
    public Ponto2D(){
        this.eixoX = 0.0;
        this.eixoY = 0.0;
    }
    //aii
    public Ponto2D(double x, double y){
        this.eixoX = x;
        this.eixoY = y;
    }
    //aiii
    public Ponto2D(Ponto2D pontos){
         this.eixoX = pontos.getEixoX();
         this.eixoY = pontos.getEixoY();
    }
    //b
    public void setEixoX(double x){
        this.eixoX = x;
    }
    public double getEixoX(){
        return this.eixoX;
    }
    public void setEixoY(double y){
        this.eixoY = y;
    }
    public double getEixoY(){
        return this.eixoY;
    }
    
    //c
    public void mudarPonto(double x, double y){
        this.eixoX = x;
        this.eixoY = y;
    }
    public void mudarPonto(){
        this.eixoX += 2.5;
        this.eixoY += 1.0;
    }
    public void mudarPonto(Ponto2D ponto){
        this.eixoX = ponto.getEixoX();
        this.eixoY = ponto.getEixoY();
    }
    //d
    public boolean equals(Ponto2D p2){
        if(this.getEixoX()==p2.getEixoX()&this.getEixoY()==p2.getEixoY()){
            return true;    
        }else{
            return false;
        }
    }
    //e
    public String toString(){
        return "X: "+this.getEixoX()+", Y: "+this.getEixoY();
    }
    //f (método que calcule a distância do ponto para outro ponto
    public double distanciaObjetos(Ponto2D p2){
        double solucao = Math.sqrt(Math.pow((this.getEixoX()-p2.getEixoX()),2)+Math.pow((this.getEixoY()-p2.getEixoY()), 2));
        
 
        return solucao;
    }
    //f (método que calcule a distância do ponto para outro ponto)
    public double distancia(double x, double y){
        double solucao = Math.sqrt(Math.pow((this.getEixoX()-x),2)+Math.pow((this.getEixoY()-y), 2));
        
 
        return solucao;
    }
    //g?
}

public class EXC2Plano2D {

    
    public static void main(String[] args) {
        Ponto2D primeiro = new Ponto2D(2.0,2.0);
        Ponto2D segundo = new Ponto2D();
        System.out.println(primeiro.getEixoX());
        System.out.println(segundo.getEixoX());
        System.out.println(primeiro.equals(segundo));
        System.out.println(primeiro.toString());
        System.out.println(primeiro.distanciaObjetos(segundo));
        System.out.println(primeiro.distancia(2, 3));
    }

}
