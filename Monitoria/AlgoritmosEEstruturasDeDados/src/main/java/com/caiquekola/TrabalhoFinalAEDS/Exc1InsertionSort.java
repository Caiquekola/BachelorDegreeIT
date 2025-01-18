package com.caiquekola.TrabalhoFinalAEDS;

import java.util.Scanner;

public class Exc1InsertionSort {
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
    
    public static void insertionSort(int[] vetor){
        //Exercicio 4
        int numeroComparacoes = 0;
        for (int i = 1; i < vetor.length; i++) {
            int j = i-1;
            int auxiliar = vetor[i];
            numeroComparacoes++;
            while (j >= 0 && vetor[j]>auxiliar) {
                vetor[j+1] = vetor[j];
                j--;
                numeroComparacoes++;
            }
            vetor[j+1] = auxiliar;
        }
        System.out.println("Numero de comparacoes: "+numeroComparacoes);

    }
}
