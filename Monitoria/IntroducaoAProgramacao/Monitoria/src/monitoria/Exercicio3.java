package monitoria;

import java.util.Scanner;


public class Exercicio3 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Lê 10 inteiros positivos e retorna o maior e o 2° maior
        
        int valor = 0, maior = 0, maior2 = 0;
        
        for (int indice = 0; indice < 10; indice++) {
            valor = teclado.nextInt();
            if(valor>maior){
                maior2 = maior;
                maior = valor;
            }else if(valor>maior2){
                maior2 = valor;
            }
            // 2 3 5 7 4 1 6
           
        }
        System.out.println(maior);
        System.out.println(maior2);
    }

}
