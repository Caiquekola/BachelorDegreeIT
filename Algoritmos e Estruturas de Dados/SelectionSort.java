package SelectionSort;

import java.util.Scanner;

public class SelectionSort {

    
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Insira o tamanho do vetor: ");
            int tamanho = scan.nextInt();
            int vetor[] = new int[tamanho];
            for (int i = 0; i < tamanho; i++) {
                vetor[i] = scan.nextInt();
            }
            int i,j,min,aux;
            for (i = 0; i < tamanho-1; i++) {
                min = i;
                for (j = (i+1); j < tamanho; j++) {
                    if(vetor[j]<vetor[min]){
                        min = j;
                    }
                }
                if(vetor[i]!=vetor[min]){
                    aux = vetor[i];
                    vetor[i] = vetor[min];
                    vetor[min] = aux;
                }
            }
            for (int k = 0; k < tamanho; k++) {
                System.out.print(vetor[k]+" ");
            }
            
            
    }
    
}
