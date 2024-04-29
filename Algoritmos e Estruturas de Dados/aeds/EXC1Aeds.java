
package aeds;

import java.util.Random;
public class EXC1Aeds {
    public static void ExibirArray(int v[], int inicio){
     int tamanhoVetor = v.length;
     if(inicio>=tamanhoVetor) return;
     else{
         System.out.print(v[inicio]+" ");
         ExibirArray(v,inicio+1);
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
        int ini = 0;
        System.out.println("");  
        ExibirArray(vetor,ini);
        
    }

}
