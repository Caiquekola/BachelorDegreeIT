/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package marcioquestoesvetor;

import java.util.Random;


public class Vetor3 {

    
    public static void main(String[] args) {
        /*Leia um vetor de 16 posições e troque os 8 primeiros valores pelos 8 últimos e vice-e-versa. Escreva ao final o vetor obtido*/
        int vetor[] = new int[16];
        int vetorAux[] = new int[16];
        Random random = new Random();
        for (int i = 0; i < 16; i++) {
            vetor[i] = random.nextInt(40);
            System.out.print(vetor[i]+" ");
            if(i<8){
                vetorAux[i+8] = vetor[i];
                
            }else{
                vetorAux[i-8] = vetor[i];
            }
            
        }
        System.out.println("");
        for (int i = 0; i < 16; i++) {
            System.out.print(vetorAux[i]+" ");
        }
    }

}
