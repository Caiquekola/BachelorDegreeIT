/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aeds;

/**
 *
 * @author 0056837
 */
import java.util.Random;
public class InverterElementos {

    /**
     * @param args the command line arguments
     */
    private static void inverter(int v[], int esq, int dir){
        int tempValor;
        if(esq>=dir) return;
        tempValor = v[esq];
        v[esq]=v[dir];
        v[dir] = tempValor;
        inverter(v,esq+1,dir-1);
        
    }
    
    private static Random random = new Random();
    
    public static void main(String[] args) {
        int tamanho = 10;
        int vetor[] = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(tamanho);
            System.out.print(vetor[i]+" ");
        }
        System.out.println("");
        int comeco = 0;
        inverter(vetor,comeco,(tamanho-1));
        for (int i = 0; i < tamanho; i++) {
            
            System.out.print(vetor[i]+" ");
        }
        
    }
    
}
