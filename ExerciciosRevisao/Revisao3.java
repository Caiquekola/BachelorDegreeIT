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
		int vetor[] = new int[10];
		int vetor2[] = new int[10];
    
		int soma=0,cont=0;
		for (int i =0; i<10 ;i++ )
		{
		    
		    vetor[i] = random.nextInt(10);
		    
		    vetor2[i] = vetor[i]*2;
		    System.out.print(vetor[i]+" ");
		} 
		System.out.println("");
		for(int i = 0; i < 10; i++){
		    System.out.print(vetor2[i]+" ");
		}
	
		
		
	}
}
