/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package marcioquestoesvetor;

import java.util.Scanner;
import java.util.Random;
public class Vetor5Letras {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String p1 = scan.nextLine();
        String p2 = scan.nextLine();
        int numero = p2.length()-1;
        char resposta = 'N';
        for(int i = 0; i < numero; i++){
            if(p1.substring(i, i+1).equals(p2.substring(numero-i, numero+1))){
                resposta='S';
            }
        }
        System.out.println(resposta);
        
        
    }

}
