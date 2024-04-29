/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package aeds;


public class EXC4Aeds {
    private static void Par(int Min, int Max){
        if(Min>Max) {return;}   
        if(Min%2==0){
            System.out.print(Min+" ");
        }
        Par(Min+1,Max);   
    }
    private static void Impar(int Min, int Max){
        if(Min>Max) {return;}   
        if(Min%2!=0){
            System.out.print(Min+" ");
        }
        Impar(Min+1,Max); 
    }
    private static void ParEImpar(int Min, int Max){
        System.out.print("Numeros pares: ");
        Par(Min,Max);
        System.out.print("\nNumeros impares: ");
        Impar(Min,Max);
    }
    public static void main(String[] args) {
           int min = 1;
           int max = 6;
  
           ParEImpar(min,max);  
    }
           
}