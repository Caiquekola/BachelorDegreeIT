/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ExerciciosPOO;

class Ponto2D{
    private double eixoX,eixoY;
    public void Ponto2D(){
        this.eixoX = 0.0;
        this.eixoY = 0.0;
    }
    public void Ponto2D(double x, double y){
        this.eixoX = x;
        this.eixoY = y;
    }
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
    public void mudarPonto(double x, double y){
        this.eixoX = x;
        this.eixoY = y;
    }
}

public class EXC2Plano2D {

    
    public static void main(String[] args) {
        Ponto2D primeiro = new Ponto2D();
        
    }

}
