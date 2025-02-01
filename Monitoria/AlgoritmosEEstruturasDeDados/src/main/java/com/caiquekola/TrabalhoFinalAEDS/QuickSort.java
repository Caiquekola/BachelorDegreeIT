package com.caiquekola.TrabalhoFinalAEDS;

import java.util.Stack;

public class QuickSort {


    public static long quickSort(int vetor[]){
        long inicioTempo = System.nanoTime();
        quick(vetor,0,vetor.length-1);
        long fimTempo = System.nanoTime();
        return fimTempo - inicioTempo;
    }

    public static void quick(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            int pivoIndex = particionar(vetor, esquerda, direita);
            if (pivoIndex - esquerda < direita - pivoIndex) {
                quick(vetor, esquerda, pivoIndex - 1);
                quick(vetor, pivoIndex + 1, direita);
            } else {
                quick(vetor, pivoIndex + 1, direita);
                quick(vetor, esquerda, pivoIndex - 1);
            }
        }
    }

    public static int particionar(int[] vetor, int esquerda, int direita) {
        int meio = (esquerda + direita) / 2;
        int pivoIndex = medianaDeTres(vetor, esquerda, meio, direita);
        int pivo = vetor[pivoIndex];

        trocar(vetor, pivoIndex, direita);
        int i = esquerda - 1;

        for (int j = esquerda; j < direita; j++) {
            if (vetor[j] <= pivo) {
                i++;
                trocar(vetor, i, j);
            }
        }

        trocar(vetor, i + 1, direita);
        return i + 1;
    }

    public static int medianaDeTres(int[] vetor, int a, int b, int c) {
        if ((vetor[a] > vetor[b]) != (vetor[a] > vetor[c])) return a;
        if ((vetor[b] > vetor[a]) != (vetor[b] > vetor[c])) return b;
        return c;
    }

    public static void trocar(int[] vetor, int i, int j) {
        if (i != j) {
            int temp = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = temp;
        }
    }
}





