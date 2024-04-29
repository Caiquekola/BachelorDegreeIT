package Ordenação;

import java.util.Random;
public class SelectionSort {
    static Random random = new Random();
    static double finishTime = 0;
    static public void selectionSortCrescent(int v[], int n){
        int i,j,min,aux;
        for (i = 0; i < (n-1); i++) {
            min = i;
            for (j = (i+1); j< n; j++) {
                if(v[j]>v[min]){
                    min=j;
                }
            }
            if(v[i]!=v[min]){
                aux = v[i];
                v[i] = v[min];
                v[min] = aux;
            }
        }
    }
    static public void selectionSortDecrescent(int v[], int n){
        int i,j,min,aux;
        for (i = 0; i < (n-1); i++) {
            min = i;
            for (j = (i+1); j< n; j++) {
                if(v[j]<v[min]){
                    min=j;
                }
            }
            if(v[i]!=v[min]){
                aux = v[i];
                v[i] = v[min];
                v[min] = aux;
            }
        }
    }
    public static void main(String[] args) {
        
        int vetorSize = 500000;
        int nDisorderly[] = new int[vetorSize];
        //Random numbers generator
        for (int i = 0; i < vetorSize; i++) {
            nDisorderly[i] = random.nextInt(vetorSize);
            System.out.print(nDisorderly[i]+" ");
        }
        selectionSortCrescent(nDisorderly,vetorSize);
        double startTime = System.currentTimeMillis();
        //crescent reeordering 
        selectionSortDecrescent(nDisorderly,vetorSize);
        finishTime = (System.currentTimeMillis()-startTime)/1000;
        System.out.println("");
        for (int i = 0; i < vetorSize; i++) {
            System.out.print(nDisorderly[i]+" ");
        }
        //Execution time
        System.out.println(String.format("\nTotal time: %.3f seconds",finishTime));
    }
}
