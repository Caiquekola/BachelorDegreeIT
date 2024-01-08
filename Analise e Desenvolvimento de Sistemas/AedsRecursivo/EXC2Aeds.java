/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package AedsRecursivo;

import java.util.Random;
public class EXC2Aeds {
    public static int MaiorNumero(int v[], int inicio, int Maior){
     if(inicio>=v.length){
         return Maior;
     }else{
         if(v[inicio]>Maior) Maior=v[inicio];
         return MaiorNumero(v,inicio+1,Maior);
     }
     
    }
    
    public static void main(String[] args) {
        //Crie uma função que retorne um vetor
        Random random = new Random();
        int qntNumVetor = 15;
        int vetor[] = new int[qntNumVetor];
        for (int i = 0; i < qntNumVetor; i++) {
            vetor[i] = random.nextInt(100);
            System.out.print(vetor[i]+" ");
        }
        int ini = 0, maior=0;
        System.out.println("");  
        System.out.println("O maior valor e "+MaiorNumero(vetor,ini,maior));
        
    }

}
