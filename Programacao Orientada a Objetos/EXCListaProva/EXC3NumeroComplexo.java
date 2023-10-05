/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ExerciciosPOO;

class NumeroComplexo{
    double real;
    double imaginario;
    //A (construct default)
    public NumeroComplexo(){
        real=0.0;
        imaginario=0.0;
    }
    //A (construct sobrecarregado)
    public NumeroComplexo(double real, double imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }
    
    //B (get;set)
    public double getReal(){
        return this.real;
    }
    public double getImaginario(){
        return this.imaginario;
    }
    public void setReal(double real){
        this.real = real;
    }
    public void setImaginario(double imaginario){
        this.imaginario = imaginario;
    }
    
    //C (somar)(sobrecarregado)
    public void somar(double real, double imaginario){
        this.real += real;
        this.imaginario +=imaginario;
    }
    //C (somar)(objeto)
    public void somar(NumeroComplexo numeroComplexo){
        this.real += numeroComplexo.getReal();
        this.imaginario += numeroComplexo.getImaginario();
    }
    
    //D (subtrair)
    public void subtrair(double real, double imaginario){
        this.real -= real;
        this.imaginario -= imaginario;
    }
    //D (subtair)(objeto)
    public void subtrair(NumeroComplexo numeroComplexo){
        this.real -= numeroComplexo.getReal();
        this.imaginario -= numeroComplexo.getImaginario();
    }
    //E (multiplicar)(sobrecarregado)
    //(a+bi) * (c+di) = (ac−bd)+(ad+bc)i;
    public void multiplicar(double real, double imaginario){
        this.real = (this.real*real-this.imaginario*imaginario);
        this.imaginario = (this.real*imaginario)+(this.imaginario*real);
    }
    //E (multiplicar)(objeto)
    public void multiplicar(NumeroComplexo numeroComplexo){
        this.real = (this.real*numeroComplexo.real-this.imaginario*numeroComplexo.imaginario);
        this.imaginario = ((this.real*numeroComplexo.imaginario)+(this.imaginario*numeroComplexo.real));
    }
    //F (divisão)(sobrecarregado)
    // (a+bi) / (c+di) = (ac+bd)/(c2 +d2) + (bc-ad)/(c2 + d2)i;
    public void divisao(double real, double imaginario){
        this.real = (((this.real*real)+(this.imaginario*imaginario))/(real*real+imaginario*imaginario));
        this.imaginario = (((this.imaginario*real)-(this.real*imaginario))/(real*real+imaginario*imaginario));
    }   
    
    //F (divisão)(objeto)
    public void divisao(NumeroComplexo nC){
        this.real = (((this.real*nC.real)+(this.imaginario*nC.imaginario))/(nC.real*nC.real+nC.imaginario*nC.imaginario));
        this.imaginario = (((this.imaginario*nC.real)-(this.real*nC.imaginario))/(nC.real*nC.real+nC.imaginario*nC.imaginario));
    }
    //G (comparação semântica)
    public boolean equals(NumeroComplexo nC){
        if(this.real==nC.real&nC.imaginario==this.imaginario){
            return true;
        }else{
            return false;
        }
    }
    //H toString
    public String toString(){
        if(this.imaginario>0){
        return this.real+" + "+this.imaginario+"i";
        }
        else{
            return this.real+" - "+this.imaginario*-1+"i";
        }
        
    }
    //I Módulo 
    public double modulo(){
        double solucao = Math.sqrt((this.real*this.real+this.imaginario*this.imaginario));
        return solucao;
    }
    
}
public class EXC3NumeroComplexo {

    
    public static void main(String[] args) {
        NumeroComplexo ex1 = new NumeroComplexo(1,1);
        System.out.println(ex1.toString());
        ex1.somar(1,2);
        System.out.println(ex1.toString());
    } 

}
