package obi2023f2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 0056837
 */
import java.util.Scanner;
public class BinarioPDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String binario = scan.next();
        
        //1100
        int j=binario.length()-1, total=0;
        
        for (int i = 0; i < binario.length(); i++) {
            if(binario.substring(i,i+1).equals("1")){
               total+=Math. pow(2, j);
            }
            j--;
        }
        System.out.println(total);
    }
    
}
