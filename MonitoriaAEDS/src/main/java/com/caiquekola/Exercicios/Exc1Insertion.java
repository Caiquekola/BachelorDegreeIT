package com.caiquekola.Exercicios;

public class Exc1Insertion {
    /*Exercício 1: Ordenação por Inserção
Escreva um programa que implemente o algoritmo de ordenação por inserção (Insertion Sort). O
programa deve:
1. Ler um vetor de números inteiros de tamanho n fornecido pelo usuário.
2. Ordenar o vetor utilizando o algoritmo de Inserção.
3. Exibir o vetor antes e depois da ordenação.
4. Conte o número de comparações realizadas durante a ordenação e exiba esse valor ao final.
*/
    public static void main(String[] args) {
        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;

            // Comparar e mover os elementos
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

}
