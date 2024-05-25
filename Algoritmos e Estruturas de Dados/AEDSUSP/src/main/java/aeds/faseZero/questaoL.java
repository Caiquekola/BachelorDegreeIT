package aeds.faseZero;

import java.util.Scanner;

public class questaoL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int criancas = scan.nextInt();
        String[] quartos = new String[criancas];
        String[] criancasNovas = new String[criancas];
        for (int i = 0; i < criancas; i++) {
            quartos[i] = scan.next();
        }
        for (int i = 0; i < criancas; i++) {
            criancasNovas[i] = scan.next();
        }
        int nova = 0;
        int quarto = 0;
        // A B C
        // C B A

        //A B C
        //A B C
        while(quarto<criancas){
            if(quarto==criancas-1){
                System.out.println(criancasNovas[nova]);
                if((criancasNovas[nova].equals(quartos[quarto]))){
                    nova++;
                }
            }else{
                System.out.print(criancasNovas[nova]+" ");
                if(criancasNovas[nova].equals(quartos[quarto])){
                    nova++;
                }

            }
            quarto++;


        }

    }
}
