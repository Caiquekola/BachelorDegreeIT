package TRAB1;

import java.util.Random;

public class BubbleSort {
    static Random random = new Random();
    
    static double finishTime = 0;
    
    static public void bubbleSortCrescent(int v[], int n){
        int i, fim,aux;
        for (fim = (n-1);fim>0;fim--) {
            for (i = 0;i<fim;i++) {
                if(v[i]>v[i+1]){
                    aux=v[i];
                    v[i]=v[i+1];
                    v[i+1]=aux;
                }
            }
        }
    }
    static public void bubbleSortDecrescent(int v[], int n){
        int i, fim,aux;
        for (fim = (n-1);fim>0;fim--) {
            for (i = 0;i<fim;i++) {
                if(v[i]<v[i+1]){
                    aux=v[i];
                    v[i]=v[i+1];
                    v[i+1]=aux;
                }
            }
        }
    }
    public static void main(String[] args) {
        
        int vetorSize = 10;
        int nDisorderly[] = new int[vetorSize];
        //Random numbers generator
        for (int i = 0; i < vetorSize; i++) {
            nDisorderly[i] = random.nextInt(vetorSize);
            System.out.print(nDisorderly[i]+" ");
        }
        double startTime = System.currentTimeMillis();
        //crescent reeordering 
        bubbleSortCrescent(nDisorderly,vetorSize);
        finishTime = (System.currentTimeMillis()-startTime)/1000;
        System.out.println("");
        for (int i = 0; i < vetorSize; i++) {
            System.out.print(nDisorderly[i]+" ");
        }
        //decrescent reeordering
        bubbleSortDecrescent(nDisorderly,vetorSize);
        System.out.println("");
        for (int i = 0; i < vetorSize; i++) {
            System.out.print(nDisorderly[i]+" ");
        }
        //Execution time
        System.out.println("");
        
        System.out.println(String.format("Total time: %.3f seconds",finishTime));
    }

}
