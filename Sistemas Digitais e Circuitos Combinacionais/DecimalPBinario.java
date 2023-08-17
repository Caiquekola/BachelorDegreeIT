/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package obi2023f2;

/**
 *
 * @author 0056837
 */
import java.util.Scanner;
public class DecimalPBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numDecimal=scan.nextInt(); //Ler o número Decimal
        int auxNum=numDecimal;         //Auxiliar recebe o número decimal 
        int vezes=0;
        
        while(numDecimal>0){
            numDecimal=numDecimal/2;    //Aqui lê-se a quantidade de vezes que ocorre a divisão por 2
            vezes++;                    //Para assim criarmos o vetor de inteiros
        }
        
        int bin[] = new int[vezes];     //Crio o vetor de inteiros
        while(auxNum%2==0){
                auxNum/=2;
            }
        for (int j = 0; j < vezes; j++) {
            
            bin[j] = auxNum%2;          
            auxNum /= 2;
            
        }
        scan.close();
        for (int j = 0; j < bin.length; j++) {
            System.out.print(bin[j]);  //Escreve o número em binário (base 2)
        }
        
    }
    
}
