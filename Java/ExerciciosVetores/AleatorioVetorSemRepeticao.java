/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Random;
public class AleatorioVetorSemRepeticao {

    
    public static void main(String[] args) {
        Random random = new Random();
        int vetor[] = new int[50];
        int vetor2[] = new int[50];
        int aux=0;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(0,51);
            
            System.out.print(vetor[i]+" ");
            
        }
        System.out.println("");
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                
                if(vetor[j]==vetor[i]& i!=j){
                    vetor[j] = random.nextInt(0,51);
                    j=0;i=0;
                }
                
            }
            
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+" ");
        }
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if(vetor[j]>vetor[i]){
                    aux=vetor[i];
                    vetor[i]=vetor[j];
                    vetor[j]=aux;
                }
                
            }
            
        }
        System.out.println("");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+" ");
        }
        
    }

}
