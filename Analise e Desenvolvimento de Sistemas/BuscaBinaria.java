/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buscabinaria;

/**
 *
 * @author 0056837
 */
public class BuscaBinaria {

   
        

        
   
    public static boolean  buscaBinaria(int vetor[], int item, int inicio, int fim){
        int meio = (fim+inicio)/2;
        System.out.println(inicio+" "+meio+" "+fim);
        if(vetor[meio]==item){
            return true;
        } 
        if(inicio==fim){
            return false;
        }
        if(item>vetor[meio]){
            return buscaBinaria(vetor,item,meio+1,fim);
        }else{
            return buscaBinaria(vetor,item,inicio,meio-1);
        }
    }

    public static void main(String[] args) {
        int vetor[] = {0,1,2,3,4,5,6,7};
//        for (int i = 1; i <= 8; i++) {
//            System.out.println(buscaBin(vetor, i));
//        }
        System.out.println(buscaBinaria(vetor,7,0,vetor.length-1));
    }

}
