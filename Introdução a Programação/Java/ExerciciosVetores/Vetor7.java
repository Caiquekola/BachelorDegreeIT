/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

    
      


public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int element = 0, indice=0;
        int vetor[] = new int[9];
        for(int i = 0 ; i<9; i++){
    	indice = scan.nextInt();
    	element = scan.nextInt();
	
    	vetor[indice-1] = element;
        }
        for(int i = 0 ; i<9; i++){
	
	
	    System.out.print(vetor[i]+" ");
        }
	}
}
