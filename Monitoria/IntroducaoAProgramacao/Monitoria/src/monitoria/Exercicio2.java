package monitoria;

import java.util.Scanner;

public class Exercicio2 {

    
    public static void main(String[] args) {
        
        //Ler 10 valores, informar maior e menor
        Scanner teclado = new Scanner(System.in);
        int valor = 0, maior = 0, menor = 999999;
        
        
        for (int indice = 1; indice <= 10; indice++) {
            //LEIA
            valor = teclado.nextInt();
            //SE
            if(valor > maior){
                maior = valor;
            }
            if(valor < menor){
                menor = valor;
            }
        }
        
        System.out.println(maior);
        System.out.println(menor);
        
    }

}
