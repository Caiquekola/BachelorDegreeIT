/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package AedsRecursivo;


public class EXC3Aeds {
    private static boolean primo(int Numero, int Inicio){
        boolean verdade=true;
        if(Inicio>=Numero) return verdade;
        if(Numero%Inicio==0){
            verdade=false;
        }
        primo(Numero,Inicio+1);
    }
    
    public static void main(String[] args) {
        //Escreva uma função recursiva que recebe um número e 
        //verifica se este é um primo ou não. 
        int numero = 7;
        int inicio = 2;
        System.out.println(primo(numero,inicio));
        
        
    }

}