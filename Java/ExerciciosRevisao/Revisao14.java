/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
import java.util.Random;
public class Revisao14 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int matriz[][] = new int[5][4];
        int somaLinha[] = new int[5];
        int somaTotal=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(0,21);
                somaLinha[i]+=matriz[i][j];
                somaTotal += matriz[i][j];
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < somaLinha.length; i++) {
            System.out.print(somaLinha[i]+", ");
            
        }
        System.out.println("\n"+somaTotal);
        
        
    }

}
