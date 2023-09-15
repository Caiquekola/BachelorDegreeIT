/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retangulo;

/**
 *
 * @author 0056837
 */
public class Retangulo {
    private int base=1;
    private int altura=1;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        if(base<=20&altura>=1){
        this.base = base;}else{
            this.base=1;
        }
    }
    
    public void setAltura(int altura) {
        if(altura<=20&altura>=1){this.altura = altura;}
        else{this.altura=20;}
        
    }
    
    
    public int getAltura() {
        return altura;
    }

    public int Perimetro(){
        return (base*2+altura*2);
    }
    public int Area(){
        return (base*altura);
    }
}
