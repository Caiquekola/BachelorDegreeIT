package com.caiquekola.TrabalhoFinalAEDS;

import java.util.Scanner;

public class SelectionSort {
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
        selectionSort(vetor);
        System.out.print("Vetor ordenado: ");
        for (int i = 0; i < tamanhoVetor; i++){
            System.out.print(vetor[i]+" ");
        }

    }
    public static long selectionSort(int[] vetor){
        long inicioTempo = System.nanoTime();
        for (int i = 0; i < vetor.length; i++){
            int menor = i;
            for (int j = i+1; j < vetor.length; j++){
                if(vetor[j] < vetor[menor]){
                    menor = j;
                }
            }
            int aux = vetor[menor];
            vetor[menor] = vetor[i];
            vetor[i] = aux;
        }
        long fimTempo = System.nanoTime();
        return (fimTempo - inicioTempo);
    }
}
