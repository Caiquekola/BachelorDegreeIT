package aeds.sort;

public class quickSort {
    public static void main(String[] args) {
        int vetor[] = {5,4,3,2,1};
        for(int i:vetor){
            System.out.print(i+" ");
        }
        order(vetor);
        System.out.println();
        for(int i: vetor){
            System.out.print(i+" ");
        }
    }

    public static void order(int v[]){
        orderRecursive(v,0,v.length-1);
    }
    private static void orderRecursive(int v[], int l, int r){
        if(l<r){
            int partition = partition(v,l,r);
            orderRecursive(v,l,partition-1);
            orderRecursive(v,partition+1,r);
        }
    }

    private static int partition(int v[],int l, int r){
        int pivot = v[r];
        int pos = 0;
        for(int i=l; i<r; i++){
            if(v[i]<=pivot){
                switchPos(v,i,pos);
                pos++;
            }
        }
        switchPos(v,pos,r);
        return pos;
    }

    private static void switchPos(int v[], int i, int j){
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
}
