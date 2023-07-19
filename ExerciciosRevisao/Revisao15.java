/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Random;
public class Revisao15 {

    
    public static void main(String[] args) {
        Random random = new Random();
        int matriz[][] = new int[4][4];
        int diagonalP=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(0,17);
                System.out.print(matriz[i][j]+" ");
                if(i==j){
                    diagonalP+=matriz[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println(diagonalP);
        
        
    }

}
