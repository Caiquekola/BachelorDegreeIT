//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int vetor[] = {9,8,7,6,5};
        // 1 2 3 5 4
        // 5 4 3 2 1
        System.out.println(vetor);
        System.out.println("Vetor ordenado");
        quickSort(vetor,0,vetor.length-1);
        System.out.println(vetor);
    }
    private static int partition(int[] vetor, int inicio, int fim, int pivot){
        int i = inicio; int j = inicio;
        while(j<=fim){
            if(vetor[j]<pivot){
                swap(vetor,i,j);
                i++;
            }
            j++;
        }
        return i-1;
    }
    public static void quickSort(int[] vetor, int inicio, int fim){

        if(inicio<=fim){
            int pivot = vetor[fim];
            int position = partition(vetor,inicio,fim,pivot);
            quickSort(vetor,inicio,position-1);
            quickSort(vetor,position+1,fim);
        }


    }

    public static void swap(int[] vetor, int i, int j){
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }
}