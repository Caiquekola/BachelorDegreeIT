/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package aeds;


public class EXC3Aeds {
    private static boolean primo(int Numero){
        if(Numero<=1) return false;
        for (int i = 2; i < Numero; i++) {
            if(Numero%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        //Escreva uma função recursiva que recebe um número e 
        //verifica se este é um primo ou não. 
        int numero = 7;
        System.out.println(primo(numero));
        
        
    }

}
