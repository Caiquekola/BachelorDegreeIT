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
public class LampadaHelp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String letras = scan.next();
        char letrasSeparadas[] = new char[26];
        for (int i = 0; i < 26; i++) {
            letrasSeparadas[i] = letras.charAt(i);
        }
        int quantNum = scan.nextInt();
        int numAlfabeto[] = new int[quantNum];
        for (int i = 0; i < quantNum; i++) {
            numAlfabeto[i] = scan.nextInt();
            numAlfabeto[i]--;
        }
        for (int i = 0; i < quantNum; i++) {
            System.out.print(letrasSeparadas[numAlfabeto[i]]);
        }
        
        
        
    }
    
}
