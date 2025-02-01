package com.caiquekola.TrabalhoFinalAEDS;

import java.util.Arrays;
import java.util.Random;

import static com.caiquekola.TrabalhoFinalAEDS.BubbleSort.bubbleSort;
import static com.caiquekola.TrabalhoFinalAEDS.InsertionSort.insertionSort;
import static com.caiquekola.TrabalhoFinalAEDS.MergeSort.mergeSort;
import static com.caiquekola.TrabalhoFinalAEDS.QuickSort.quickSort;
import static com.caiquekola.TrabalhoFinalAEDS.SelectionSort.selectionSort;

public class Principal {



    private static final int[] tamanhos = { 100, 500, 1000, 5000, 20000, 50000, 100000, 500000};
    private static final long seed = 2304l;
    private static final Random random = new Random(seed);

    public static void main(String[] args) {

        int quantidadeValores = tamanhos.length; // 8 valores
        // percorre tamanhos 100 - 500 - 100 ...
        for (int i = 0; i < quantidadeValores; i++) {
            int[] vetorAleatorio = geraVetorAleatorio(tamanhos[i]);
            int[] vetorCrescente = vetorAleatorio.clone(); // cópia do vetor aleatorio
            Arrays.sort(vetorCrescente); // ordena o vetor crescente
            int[] vetorDecrescente = geraVetorDecrescente(vetorCrescente);
            exibirTemposOrdenacaoAlgoritmos(vetorAleatorio.clone(),vetorCrescente.clone(), vetorDecrescente.clone());
            //exibirVetor(vetorAleatorio.clone(), vetorCrescente.clone(), vetorDecrescente.clone());
        }

    }

    public static void exibirTemposOrdenacaoAlgoritmos(int[] vetorAleatorio, int[] vetorCrescente, int[] vetorDecrescente) {
        System.out.println("\n\nTamanho do vetor: " + vetorAleatorio.length);

        //SelectionSort
        System.out.println("\nTempo de execução do SelectionSort Aleatorio: " + selectionSort(vetorAleatorio.clone())/1000000.0);
        System.out.println("Tempo de execução do SelectionSort Crescente: " + selectionSort(vetorCrescente.clone())/1000000.0);
        System.out.println("Tempo de execução do SelectionSort Decrescente: " + selectionSort(vetorDecrescente.clone())/1000000.0);
        //InsertionSort
        System.out.println("\nTempo de execução do InsertionSort Aleatorio: " + insertionSort(vetorAleatorio.clone())/1000000.0);
        System.out.println("Tempo de execução do InsertionSort Crescente: " + insertionSort(vetorCrescente.clone())/1000000.0);
        System.out.println("Tempo de execução do InsertionSort Decrescente: " + insertionSort(vetorDecrescente.clone())/1000000.0);
        //QuickSort
        System.out.println("\nTempo de execução do QuickSort Aleatorio: " + quickSort(vetorAleatorio.clone())/1000000.0);
        System.out.println("Tempo de execução do QuickSort Crescente: " + quickSort(vetorCrescente.clone())/1000000.0);
        System.out.println("Tempo de execução do QuickSort Decrescente: " + quickSort(vetorDecrescente.clone())/1000000.0);
        //MergeSort
        System.out.println("\nTempo de execução do MergeSort Aleatorio: " + mergeSort(vetorAleatorio.clone())/1000000.0);
        System.out.println("Tempo de execução do MergeSort Crescente: " + mergeSort(vetorCrescente.clone())/1000000.0);
        System.out.println("Tempo de execução do MergeSort Decrescente: " + mergeSort(vetorDecrescente.clone())/1000000.0);
        //BubbleSort
        System.out.println("\nTempo de execução do BubbleSort Aleatorio: " + bubbleSort(vetorAleatorio.clone())/1000000.0);
        System.out.println("Tempo de execução do BubbleSort Crescente: " + bubbleSort(vetorCrescente.clone())/1000000.0);
        System.out.println("Tempo de execução do BubbleSort Decrescente: " + bubbleSort(vetorDecrescente.clone())/1000000.0);
    }
    //gera vetor aleatorio
    public static int[] geraVetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        int limiteNumero = (int) (tamanho * 1.5);
        for (int i = 0; i < tamanho; ++i) {
            vetor[i] = random.nextInt(limiteNumero);
        }

        return vetor;
    }

     // O vetor recebido como parametro ja esta ordenado de forma crescente
    public static int[] geraVetorDecrescente(int[] vetor) {
        int[] vetorDecrescente = vetor.clone();
        for (int i = 0; i < vetorDecrescente.length / 2; i++) {
            int temp = vetorDecrescente[i];
            vetorDecrescente[i] = vetorDecrescente[vetorDecrescente.length - 1 - i];
            vetorDecrescente[vetorDecrescente.length - 1 - i] = temp;
        }
        return vetorDecrescente;
    }
    //exibir vetores
    public static void exibirVetor(int[] vetorAleatorio, int[] vetorCrescente, int[] vetorDecrescente) {
        System.out.println("Tamanho do vetor: " + vetorAleatorio.length);
        System.out.println("Vetor Aleatorio: ");
        for (int j = 0; j < vetorAleatorio.length; j++) {
            System.out.print(vetorAleatorio[j] + " ");
        }
        System.out.println("\nVetor Crescente: ");
        for (int j = 0; j < vetorCrescente.length; j++) {
            System.out.print(vetorCrescente[j] + " ");
        }
        System.out.println("\nVetor Decrescente: ");
        for (int j = 0; j < vetorDecrescente.length; j++) {
            System.out.print(vetorDecrescente[j] + " ");
        }
        System.out.println();
    }
}
