/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
 import java.util.Scanner;
 import java.util.Random;
public class Main
{
	public static void main(String[] args) {
		Random random = new Random();
		int vetor[] = new int[8];
		int vetor2[] = new int[8];
    
		int aux=0;
		for (int i =0; i<8 ;i++ )
		{
		    
		    vetor[i] = random.nextInt(10);
		    vetor2[i] = random.nextInt(10);
		    System.out.print(vetor[i]+" ");
		    
		}
		System.out.println("");
		for (int i =0; i<8 ;i++ )
		
		{
		    System.out.print(vetor2[i]+" ");
		    aux = vetor[i];
		    vetor[i] = vetor2[i];
		    vetor2[i] = aux;
		    
		}
		System.out.println("\n");
	    for (int i =0; i<8 ;i++ )
		{

		    System.out.print(vetor[i]+" ");
		}
		System.out.println("");
		for (int i =0; i<8 ;i++ )
		{

		    System.out.print(vetor2[i]+" ");
		}
		
		
	}
}
