package com.caiquekola.TrabalhoFinalAEDS;
import com.caiquekola.TrabalhoFinalAEDS.Exc1QuickSort;
import java.util.Random;

public class Main {
    //100, 500, 1.000, 5.000, 20.000, 50.000, 100.000, 500.000
   
    public static int seed = 23042024;
    public static Random random = new Random(seed);

    public static void main(String[] args) {
        int[] tamanhos = {100, 500, 
            //1000, 5000, 20000, 50000, 100000, 500000
            };

        for (int i = 0; i < tamanhos.length; i++){
            int tamanhoVetor = tamanhos[i];
            int vetor[] = gerarVetor(tamanhoVetor);
            
            long[] tempoComparacaoQuickSort = Exc1QuickSort.quickSort(vetor);
            System.out.println("Tamanho do vetor: "+tamanhoVetor);
            System.out.println("Tempo de execução do QuickSort "+(tempoComparacaoQuickSort[0]/1000000.0)+"ms");
            System.out.println("Numero de comparações do QuickSort: "+tempoComparacaoQuickSort[1]);
        }
    }


    public static int[] gerarVetor(int tamanho){
        int vetor[] = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt((int)(tamanho*1.5));
        }
        return vetor;
    }
}
