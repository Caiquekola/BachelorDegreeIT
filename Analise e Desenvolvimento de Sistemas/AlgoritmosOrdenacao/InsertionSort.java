package TRAB1;

import java.util.Random;

public class Main {
    static Random random = new Random();
    
    static double finishTime = 0;
    
    static public void insertionSortCrescent(int v[], int n){
        int i = 0;
        int j = 1;
        int aux = 0;
        while (j<n){
            aux = v[j];
            i = j - 1;
            while((i>=0)&&(v[i]>aux)){
                v[i+1] = v[i];
                i--;
            }
            v[1+i] = aux;
            j++;
        }
    }
    static public void insertionSortDecrescent(int v[], int n){
        int i = 0;
        int j = 1;
        int aux = 0;
        while (j<n){
            aux = v[j];
            i = j - 1;
            while((i>=0)&&(v[i]<aux)){
                v[i+1] = v[i];
                i--;
            }
            v[1+i] = aux;
            j++;
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
        double startTime = System.currentTimeMillis();
        //crescent reeordering 
        insertionSortCrescent(nDisorderly,vetorSize);
        finishTime = (System.currentTimeMillis()-startTime)/1000;
        System.out.println("");
        for (int i = 0; i < vetorSize; i++) {
            System.out.print(nDisorderly[i]+" ");
        }
        //decrescent reeordering
        insertionSortDecrescent(nDisorderly,vetorSize);
        System.out.println("");
        for (int i = 0; i < vetorSize; i++) {
            System.out.print(nDisorderly[i]+" ");
        }
        //Execution time
        System.out.println("");
        
        System.out.println(String.format("Total time: %.3f seconds",finishTime));
    }

}
