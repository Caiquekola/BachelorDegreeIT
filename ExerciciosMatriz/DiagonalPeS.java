
package matriz;

import java.util.Scanner;
import java.util.Random;
public class DiagonalPeS {


    public static void main(String[] args) {
        //Diagonal Principal
        Random random = new Random();
        int diagonal[] = new int[5];
        int diagonalS[] = new int[5];
        int matriz[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(10);
                System.out.print(matriz[i][j]+" ");
                
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            diagonal[i] = matriz[i][i];
            System.out.print(diagonal[i]+" ");
        }
        //Secundaria
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            diagonalS[i] = matriz[i][4-i];
            System.out.print(diagonalS[i]+" ");
            
        }
        
        
        
    }
    
}
