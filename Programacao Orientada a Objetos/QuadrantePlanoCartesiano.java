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
public class ProgramacaoOrientadaO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 2 2 3 -2 -8 -1 -7 1 0 2
        Scanner scan = new Scanner(System.in);
        int x=1,y=1;
        while(x!=0&y!=0){
            x = scan.nextInt();
            y = scan.nextInt();
            if(x>0&y>0){
                System.out.println("Primeiro");
            }else if(x>0&y<0){
                System.out.println("Quarto");
            }else if(x<0&y<0){
                System.out.println("Terceiro");
            }else if(x<0&y>0){
                System.out.println("Segundo");
            }
            
            
        }
        
        
        
        
    }
    
}
