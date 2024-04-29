
package aeds;

import java.util.Arrays;

public class BuscaBinaria {
    public static boolean buscaBInt(int v[], int item, int i, int f){
        int meio = (i + f)/2;
        if(v[meio]==item){
            return true;
        }
        if(meio<=i){
            return false;
        }
        if(item>v[meio]){
            return buscaBInt(v,item,meio+1,f);
        }else{
            return buscaBInt(v,item,i,meio-1);
        }
    }
    public void sortInt(int v[]){
        Arrays.sort(v);
    }
}
