/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aeds;

/**
 *
 * @author 0056837
 */
public class EXC5Aeds {
    private static int potenciacao(int numero, int potencia){
  
        if(potencia==0){
            return 1;
        }
        return numero * potenciacao(numero,potencia-1);
    }
    
    public static void main(String[] args) {
        //Escrever uma função recursiva da potência E de um número N
        int numero = 2;
        int potencia = 5;
        System.out.print(potenciacao(numero,potencia));
    }
    
}
