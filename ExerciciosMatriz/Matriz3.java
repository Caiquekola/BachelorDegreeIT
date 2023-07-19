/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marcioquestoesvetor;

/**
 *
 * @author 0056837
 */
import java.util.Scanner;
import java.util.Random;
public class Matriz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        /*Leia uma matriz 4 x 4, imprima a matriz e retorne a localização (linha e a coluna)
        do maior valor.*/
        int matriz[][] = new int[4][4];
        int maior = 0, maiorLinha = 0, maiorColuna=0, menor =99, menorLinha=0, menorColuna=0;
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(30);
                System.out.print(matriz[i][j]+" ");
                if(matriz[i][j]>maior){
                    maior = matriz[i][j];
                    maiorColuna = j+1;
                    maiorLinha = i+1;
                }
                if(matriz[i][j]<menor){
                    menor = matriz[i][j];
                    menorLinha = i+1;
                    menorColuna = j+1;
                }
            }
            System.out.println(" ");
        }
        System.out.println("\nO maior numero eh: "+maior);
        System.out.println("Sua linha eh "+maiorLinha+" e sua coluna eh "+maiorColuna);
        System.out.println("\nO menor numero eh: "+menor);
        System.out.println("Sua linha eh "+menorLinha+" e sua coluna eh "+menorColuna);
        
        
    }
    
}
