/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Random;
import java.util.Scanner;
public class Vetor6 {

    
    public static void main(String[] args) {
     /*Leia um vetor de 50 posições e o compacte, ou seja, 
        elimine as posições comvalor zeroavançando uma posição, 
        com os com os valores subseqüentes do vetor. Dessa forma todos 
        zeros” devem ficar para as posições finais do vetor.*/
        
        
        /*Scanner scan = new Scanner(System.in);
        int vetor[] = new int[5];
        int aux=0,j=1, cont=0;     
        for (int i = 0; i < 5; i++) {
            vetor[i] = scan.nextInt();
            
        }   
        for (int i = 0; i < 5; i++) {
            if(vetor[i]!=0){
                vetor[cont]=vetor[i];
                cont++;
            }
        }
        for (int i = cont; i < 5; i++) {
            vetor[i] = 0;
        }
        for (int i = 0; i < 5; i++) 
        {  
            
        
            
            System.out.print(vetor[i]+" ");
        }*/
        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[5];
        int cont=0;
        for (int i = 0; i < 5; i++) 
        {
            vetor[i] = scan.nextInt();
        }  
        for (int i = 0; i < 5; i++) {
            if(vetor[i]!=0){
                vetor[cont]=vetor[i];
                cont++;
            }
        }
        
        
        
        
        
    }

}
