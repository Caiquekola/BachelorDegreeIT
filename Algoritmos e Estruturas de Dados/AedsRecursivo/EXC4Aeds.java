/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package AedsRecursivo;


public class EXC4Aeds {
    private static void ParEImpar(int Min, int Max){
        int Fim = Min;
        if(Fim>Max){
            return;
        }else{
            if(Min%2==0){
                System.out.println("Numeros pares: "+Min);
            }else{
                System.out.println("Numeros impares "+Min);
            }
            ParEImpar(Min+1,Max);
        }
    }
    
    public static void main(String[] args) {
//          Escreva uma função recursiva que recebe dois números 
//          min e max que definem o intervalo. Imprima todos os número 
//          pares e ímpares da seguinte forma, por exemplo:
//              min = 1 e max = 6
//              Números pares: 2 4 6
//              Números ímpares: 1 3 5  
            int min = 15;
           int max = 20;
           ParEImpar(min,max);
    }
           
}
