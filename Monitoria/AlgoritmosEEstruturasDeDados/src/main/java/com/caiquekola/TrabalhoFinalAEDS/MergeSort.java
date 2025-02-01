package com.caiquekola.TrabalhoFinalAEDS;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Array informado eh: ");
        printArray(arr);

        sort(arr, 0, arr.length - 1);

        System.out.println("\nArray ordenado eh: ");
        printArray(arr);
    }
    //Função principal que ordena um array[esquerda,...,direita] usando o métudo merge.
    public static void sort(int[] array, int esquerda, int direita){
        if(esquerda<direita){
            //Achar o meio
            // 5 4 3 2 1
            int meio = esquerda + (direita-esquerda)/2;
            //Chamada recursiva para achar a primeira e segunda metades
            sort(array, esquerda, meio);
            sort(array, meio+1, direita);
            //Merge (junção) das duas metades
            merge(array,esquerda,meio,direita);
        }
    }
    public static long mergeSort(int[] vetor){
        long inicioTempo = System.nanoTime();
        sort(vetor, 0, vetor.length - 1);
        long fimTempo = System.nanoTime();
        return (fimTempo-inicioTempo);
    }
    //Juncao "merge"
    //Primeira metade do array até o meio e meio até o fim
    public static void merge(int[] array, int esquerda, int meio, int direita) {
        //Tamanho dos subarrays
        int tamanho1 = meio-esquerda+1;
        int tamanho2 = direita-meio;

        //Arrays temporarios
        int esq[] = new int[tamanho1];
        int dir[] = new int[tamanho2];

        //Copiar os elementos para os vetores temporarios
        for (int i = 0; i < tamanho1; ++i)
            esq[i] = array[esquerda + i];
        for (int j = 0; j < tamanho2; ++j)
            dir[j] = array[meio + 1 + j];


        //Junção dos dois arrays temporarios

        //indices do comeco dos dois arrays temporarios
        int i = 0, j = 0;
        //indice do
        int k = esquerda;

        //Juncao do array no array principal
        while(i<tamanho1 && j<tamanho2){
            if(esq[i]<=dir[j]){
                array[k] = esq[i];
                i++;
            }else{
                array[k] = dir[j];
                j++;
            }
            k++;
        }
        // Copia dos elementos restantes do vetor da esquerda
        while(i<tamanho1){
            array[k] = esq[i];
            i++;
            k++;
        }
        // Copia dos elementos restantes do vetor da direita
        while(j<tamanho2){
            array[k] = dir[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] array){
        int tamanhoArray = array.length;
        for (int i = 0; i < tamanhoArray; ++i){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
