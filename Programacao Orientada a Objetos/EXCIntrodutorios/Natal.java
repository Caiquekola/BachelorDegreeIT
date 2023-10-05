/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacaoorientadao;

/**
 *
 * @author 0056837
 */
import java.util.Scanner;
public class Natal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int N=0;
        N = scan.nextInt();
        if(N==0){
            N=1;
        }
        System.out.print("Feliz nat");
        for (int i = 0; i < N; i++) {
            System.out.print("a");
        }
        System.out.print("l!");
    }
    
}
