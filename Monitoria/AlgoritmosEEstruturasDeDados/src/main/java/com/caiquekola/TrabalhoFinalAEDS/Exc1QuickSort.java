package com.caiquekola.TrabalhoFinalAEDS;

public class Exc1QuickSort {
    //Dividir para conquistar
    public static void quick(int vetor[], int inicio, int fim){
        if (inicio < fim){
            int posicaoPivo = particao(vetor, inicio, fim);
            quick(vetor, inicio, posicaoPivo-1);
            quick(vetor, posicaoPivo+1, fim);
        }
    }

    public static long[] quickSort(int vetor[]){

        long inicio = System.nanoTime();
        quick(vetor, 0, vetor.length-1);
        long fim = System.nanoTime();
        long[] resultado = {(fim-inicio),0L};
        return resultado;
    }

    //Divide o vetor em duas partes e retorna a posição do pivo
    public static int particao(int vetor[], int inicio, int fim){
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f){
            if (vetor[i] <= pivo){
                i++;
            } else if (pivo < vetor[f]){
                f--;
            } else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }


    public static void main(String[] args) {
        int tamanhoVetor = 500000;
        int tamanho = 500000;
        int vetor[] = new int[tamanhoVetor];
        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = tamanho;
            tamanho--;
        }
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]+" ");
        }
        long inicio = System.currentTimeMillis();
        quick(vetor, 0, vetor.length-1);
        long fim = System.currentTimeMillis();
        System.out.print("Vetor ordenado: ");
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]+" ");
        }
        System.out.println("\nTempo de execução: "+(fim-inicio)+"ms");
    }
}
