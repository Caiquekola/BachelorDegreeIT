package com.caiquekola.ListaExercicios;

public class Exc5OddElements {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5,6,7,8,9};
        oddRecursive(vetor,vetor.length-1);
    }

    public static void oddRecursive(int[] vetor, int tamanho){
        if(tamanho<0){
            return;
        }
        if(vetor[vetor.length-1-tamanho]%2!=0){
            System.out.print(vetor[vetor.length-1-tamanho]+" ");
        }
        oddRecursive(vetor,tamanho-1);
    }
}
