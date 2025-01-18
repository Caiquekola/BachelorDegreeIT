package com.caiquekola.TrabalhoFinalAEDS;

import java.util.Scanner;

public class Exc1SelectionSort {
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
    public static void selectionSort(int[] vetor){
        int numeroComparacoes = 0;
        for (int i = 0; i < vetor.length; i++){
            int menor = i;
            for (int j = i+1; j < vetor.length; j++){
                numeroComparacoes ++;
                if(vetor[j] < vetor[menor]){
                    menor = j;
                }
            }
            int aux = vetor[menor];
            vetor[menor] = vetor[i];
            vetor[i] = aux;
        }
        System.out.println("Numero de comparacoes: "+numeroComparacoes);
    }
}
