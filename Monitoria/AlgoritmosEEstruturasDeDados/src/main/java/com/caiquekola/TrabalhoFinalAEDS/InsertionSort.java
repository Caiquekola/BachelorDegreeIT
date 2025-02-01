package com.caiquekola.TrabalhoFinalAEDS;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o tamanho do vetor: ");
        int tamanhoVetor = scan.nextInt();
        // Exercicio 1
        System.out.print("Insira os elementos do vetor: ");
        int[] vetor = new int[tamanhoVetor];
        for (int i = 0; i < tamanhoVetor; i++){
            vetor[i] = scan.nextInt();
        }
        scan.close();
        // Exercicio 2 e 3
        insertionSort(vetor);
        System.out.print("Vetor ordenado: ");
        for (int i = 0; i < tamanhoVetor; i++){
            System.out.print(vetor[i]+" ");
        }
        
    }
    
    public static long insertionSort(int[] vetor){
        long inicioTempo = System.nanoTime();
        //1 2 3 4 5

        for (int i = 1; i < vetor.length; i++) {
            int j = i-1;
            int auxiliar = vetor[i];
            while (j >= 0 && vetor[j]>auxiliar) {
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = auxiliar;
        }
        long fimTempo = System.nanoTime();
        return (fimTempo - inicioTempo);
    }
}
