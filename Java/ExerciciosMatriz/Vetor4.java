
package maratona;

import java.util.Random;
import java.util.Scanner;
public class Vetor4 {

    
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int n1[] = new int[20];
        int n2[] = new int[20];
        int n3[] = new int[20];
        for(int i = 0; i<20; i++){
            
            n1[i] = random.nextInt(30);
            System.out.print(n1[i]+" ");
            

        } 
        System.out.println(" ");
        for (int i = 0; i < 20; i++) {
                n2[i] = random.nextInt(30);
                System.out.print(n2[i]+" ");
                
                if(i%2==0){
                    n3[i]=n1[i];

                }else{
                    n3[i]= n2[i];
                }
        }
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            System.out.print(n3[i]+" ");
        }
    
    
    }
    
}
