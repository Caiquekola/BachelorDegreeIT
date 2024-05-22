package aeds.beecrowd;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class CAP4E1025 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int Q = scan.nextInt();
        int v[];
        int contador;
        int contadorJ = 1;
        while(N!=0 && Q!=0){
            v = new int[N];
            contador = 0;
            for (int i = 0; i < N; i++) {
                v[contador] = scan.nextInt();
                contador++;
            }
            Arrays.sort(v);
            System.out.printf("CASE# %d:\n",contadorJ);
            contadorJ++;
            for(int i = 0; i < Q; i++){
                N = scan.nextInt();
                if(Arrays.binarySearch(v,N)>=0){
                    System.out.printf("%d found at %d\n",N,Arrays.binarySearch(v,N)+1);
                }else{
                    System.out.printf("%d not found\n",N);
                }
            }
            N = scan.nextInt();
            Q = scan.nextInt();
        }
        }



}
