package aeds.buscabinaria;

public class buscaBinaria {

    public static void main(String[] args) {
        int vetor[] = {1,2,3,4,5};
        System.out.println(busca(0,vetor,0,vetor.length));
        System.out.println(busca(5,vetor,0,vetor.length));

    }
    public static boolean busca(int item, int[] v, int e, int d){
        int meio = ((e+d)/2);
        if(e==d){
            return false;
        }
        if (item == v[meio]) {
            return true;
        }
        if(item>v[meio]){
            busca(item,v,meio+1,d);
        }
        if(item<v[meio]){
            busca(item,v,e,meio-1);
        }
        return false;
    }
}
