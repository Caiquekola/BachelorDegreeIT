/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacaoorientadao;

import java.util.Scanner;
public class PaoDeQueijoSweeper {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=0,m=0;
        n = scan.nextInt();
        m = scan.nextInt();
        int matriz[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = scan.nextInt();
                if(matriz[i][j]==1){
                    matriz[i][j]=9;
                }
            }
            
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(j<m-1){ //Direita
                  if(matriz[i][j]!=9&matriz[i][j+1]==9){
                      matriz[i][j]++;
                  }
                    
                }
                if(i<n-1){//Baixo
                    if(matriz[i][j]!=9&matriz[i+1][j]==9){
                       matriz[i][j]++; 
                    }
                }
                if(i>0){//Cima
                    if(matriz[i][j]!=9&matriz[i-1][j]==9){
                       matriz[i][j]++; 
                    }
                }
                if(j>0){//Esquerda
                    if(matriz[i][j]!=9&matriz[i][j-1]==9){
                       matriz[i][j]++; 
                    }
                }
            }
            
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        
    }
    
}
