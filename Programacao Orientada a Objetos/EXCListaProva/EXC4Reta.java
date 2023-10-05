/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio;

/**
 *
 * @author 0056837
 */
class Reta{
    double a, b;
    //A I) A reta y=ax+b a partir do coeficiente angular e linear.
    public Reta(double cAngular, double cLinear){
        this.a = cAngular;
        this.b = cLinear;
    }
    //A II) A reta y=ax+b a partir de dois pontos
    public Reta(double x1, double y1, double x2, double y2){
        this.a = (y2-y1)/(x2-x1);
        this.b = (y1*x2)-(y2*x1);
    }
    //B
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public void setA(double newA){
        this.a = newA;
    }
    public void setB(double newB){
        this.b = newB;
    }
    //C
    public boolean pertence(double x,double y){
        if(x*this.a+this.b==y){
            return true;
        }else{
            return false;
        }
    }
    //D
    public String toString(){
        String string;
        if(b>0){
            string = ("y = "+this.a+"x + "+this.b);
        }else{
            string = ("y = "+this.a+"x - "+-1*this.b);
        }
        return string;
        
    }
    //E
}
public class EXC4Reta {

    
    public static void main(String[] args) {
        
    }
    
}
