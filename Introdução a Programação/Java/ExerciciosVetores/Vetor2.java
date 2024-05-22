/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package marcioquestoesvetor;

import java.util.Random;


public class Vetor2 {

    
    public static void main(String[] args) {
        /*Elabore um programa que leia 5 valores para um vetor A. 
        Leia mais 5 valores para o vetor B. Calcula a soma de cada elemento de A com cada elemento de B 
        e armazene no vetor C(também de tamanho 5). Imprima na tela os 3 arrays.*/
        Random random = new Random();
        int A[] = new int[5];
        int B[] = new int[5];
        int C[] = new int[5];
        for (int i = 0; i < 5; i++) {
            A[i] = random.nextInt(30);
            System.out.print(A[i]+" ");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            B[i] = random.nextInt(30);
            System.out.print(B[i]+" ");
            C[i] = A[i] + B[i];
        }
        System.out.println("");    
        for (int i = 0; i < 5; i++) {
            System.out.print(C[i]+" ");
        }
        
    }

}
