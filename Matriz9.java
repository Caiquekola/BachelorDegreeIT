
package matriz;

import java.util.Scanner;
import java.util.Random;
public class DiagonalPeS {


    public static void main(String[] args) {
        /*Faça um programa para gerar automaticamente números entre 0 e 99 de uma cartela de bingo. 
        Sabendo que cada cartela devera conter 5 linhas de 5 números, gere estes dados de modo a não 
        ter números repetidos dentro das cartelas. Oprograma deve exibir na tela a cartela gerada.*/
        Random random = new Random();
        int cartela[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                cartela[i][j] = random.nextInt(0,27);
                System.out.print(cartela[i][j]+" ");
            }
            System.out.println("");
        }
        int k =0, l=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                
                
                        k=0;
                        l=0;
                        while(true)
                        {
                            if(cartela[k][l]==cartela[i][j] & k!=i | l!=j)
                            {
                                cartela[k][l] = random.nextInt(0,27);
                                i=0;
                                j=0;
                                k=0;
                                l=0;
                            }
                            else{
                                l++;
                                if(l==5){
                                    l=0;
                                    k++;
                                    if(k==5){
                                        break;
                                    }
                                }
                            }
                        }
               
            }
        }
        
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                
                System.out.print(cartela[i][j]+" ");
            }
            System.out.println("");
        }
        
        
        
        
    }
    
}
