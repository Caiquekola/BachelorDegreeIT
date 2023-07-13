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
		int soma=0;
		for (int i =0; i<10 ;i++ )
		{
		    vetor[i] = random.nextInt(10);
		    System.out.print(vetor[i]+" ");
		    if(i%2==0){
		        soma+=vetor[i];
		    }
		} 
		
		System.out.print("\n"+soma);
		
		
	}
}
