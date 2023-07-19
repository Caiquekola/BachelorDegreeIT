
package marcioquestoesvetor;

import java.util.Random;
import java.util.Scanner;
public class Vetor1 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        /*Leia um vetor de 20 posições e em seguida um valor X qualquer. Seu programa devera fazer
        uma busca do valor de X no vetor lido e informar a posição em que foi encontrado ousenão foi encontrado.*/
        int vetor[] = new int[20];
        for (int i = 0; i < 20; i++) {
            vetor[i] = random.nextInt(30);
            System.out.print(vetor[i]+" ");
        }
        System.out.println("");
        int x = random.nextInt(30);
        System.out.println(x);
        int posicao=0;
        for (int i = 0; i < 20; i++) {
            if(x==vetor[i]){
                posicao=i+1;
            }
        }
        System.out.println(posicao);
    }

}
