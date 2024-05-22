/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Random;
import java.util.Scanner;
public class Vetor5Numeros {

    
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        
        int n1[] = new int[5];
        int n2[] = new int[5];
        boolean resposta=true;
        for (int i = 0; i < 5; i++) {
            n1[i] = scan.nextInt();
           
        }
        for (int i = 0; i < 5; i++) {
            n2[i] = scan.nextInt();
            
        }
        
        for (int i = 0; i < 5; i++) {
            if(n1[i]!=n2[4-i]){
                resposta=false;
            }
        }
        System.out.println(resposta);
        
        
        
    }

}
