package com.caiquekola.TrabalhoFinalAEDS;

public class BubbleSort {
    public static long bubbleSort(int[] vetor) {
        long inicioTempo = System.nanoTime();
        bubble(vetor);
        long fimTempo = System.nanoTime();
        return fimTempo - inicioTempo;
    }

    private static void bubble(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    trocar(vetor, j, j + 1);
                }
            }

        }
    }

    private static void trocar(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }
}
