package aeds.beecrowd;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class CAP4E1025 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int v[];
        int contadorJ = 1;
        while(true){
            int N = scan.nextInt();
            int Q = scan.nextInt();
            if(N == 0 && Q == 0){
                break;
            }
            v = new int[N];
            for (int i = 0; i < N; i++) {
                v[i] = scan.nextInt();
            }

            quickSort(v,0,v.length-1);

            System.out.printf("CASE# %d:\n",contadorJ);
            contadorJ++;

            for(int i = 0; i < Q; i++){
                N = scan.nextInt();
                int index = searchBinary(v,N,0, v.length-1);
                if(index>=0){
                    System.out.printf("%d found at %d\n",N,index+1);
                }else{
                    System.out.printf("%d not found\n",N);
                }
            }


        }
    }

        public static void quickSort(int vetor[], int l, int r){
            if(l<r){
                int partition = partition(vetor,l,r);
                quickSort(vetor,l,partition-1);
                quickSort(vetor,partition+1, r);

            }
        }

        private static int partition(int v[], int l, int r){
            int pivot = v[r];
            int j = l;
            for(int i=l; i<r; i++){
                if(v[i]<pivot){
                    swap(v,j,i);
                    j++;
                }
            }
            swap(v,j,r);
            return j;

        }

        private static void swap(int vetor[], int i, int j){
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }

        public static int searchBinary(int[] v, int elemento, int l, int r){
            int m = (int)((l+r)/2);
            if(v[m]==elemento){
                return m;
            }
            if(l>=r){
                return -1;
            }
            if(elemento<v[m]){
                return searchBinary(v,elemento,l,m-1);
            }else{
                return searchBinary(v,elemento,m+1,r);
            }

        }
}

