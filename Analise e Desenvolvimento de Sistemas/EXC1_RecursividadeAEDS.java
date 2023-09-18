
package aeds;

import java.util.Random;
public class EXC1_RecursividadeAEDS {
    static void vetorizacao(int x[]){
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+" ");
        }

    }
    public static void writeVetor(int x[], int i){
        int tamanhoV = x.length;
        if(i<tamanhoV){
            System.out.print(x[i]+" ");
            i++;
            writeVetor(x,i);
        }
    }
    
    public static void main(String[] args) {
        Random random = new Random();
        int vetor[] = new int[10];
        for (int i = 0; i < 10; i++) {
            vetor[i] = random.nextInt(10);
            System.out.print(vetor[i]+" ");
        }
        int tamanhoVetor = vetor.length;
        int x = 0;
        System.out.println("");
        vetorizacao(vetor);
        System.out.println("");
        writeVetor(vetor,x);
        
        
    }
    
}
