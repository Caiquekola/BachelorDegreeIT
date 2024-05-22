
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


public class Matriz9 {

    
    public static void main(String[] args) {
        /*Faça um programa para gerar automaticamente números entre 0 e 99 de 
        umacartela de bingo. Sabendo que cada cartela devera conter 5 linhas de 5 
        números, gere estes dados de modo a não ter números repetidos dentro das 
                cartelas. Oprograma deve exibir na tela a cartela gerada.*/
        Random random = new Random();
        int matriz[][] = new int[5][5];
        for(int i = 0; i<matriz.length;i++){
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(0,26);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i = 0; i<matriz.length;i++){
            for (int j = 0; j < matriz.length; j++) {
                
                for (int k = 0; k < matriz.length; k++) {
                    for (int l = 0; l < matriz.length; l++) {
                        if(matriz[k][l]==matriz[i][j]&(k!=i|l!=j)){
                            matriz[k][l]=random.nextInt(0,26);
                            k=0;l=0;
                            i=0;j=0;
                        }
                    }
                }
                
            }
            
        }
        for(int i = 0; i<matriz.length;i++){
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        int aux=0;
        for(int i = 0; i<matriz.length;i++){
            for (int j = 0; j < matriz.length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    for (int l = 0; l < matriz.length; l++) {
                        if(matriz[k][l]>matriz[i][j]){
                            aux = matriz[i][j];
                            matriz[i][j]=matriz[k][l];
                            matriz[k][l]=aux;
                            // 3 2
                        }
                    }
                }
                
            }
            
        }
        System.out.println("");
        for(int i = 0; i<matriz.length;i++){
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
       
        
    }

}
