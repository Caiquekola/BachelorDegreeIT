package desafio;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int v[] = new int[x];
        int contador = 1;
        int contador2 = 0;
        int contador3 = 0;
        int soma = 0;
        int aux = x - 1;
        int auxR;
        boolean logico = true;
        if (x != 1) {
            do {
                if (v[1] == 1) {
                    contador++;
                    aux = x - contador;
                    contador3 = 0;
                } else {
                    contador++;
                    if(contador3==2){
                      for (int i = x - 1; i > 0; i--) {
                        if (v[i] != 0 & v[i] != 1) {
                            v[i]--;
                            v[i + 1]--;
                        }
                        logico = false;
                    }  
                    }
                    contador3++;
                }
                if (logico) {
                    contador2 = 0;
                    soma = 0;
                    v = new int[x];
                    while (soma != x) {
                        v[contador2] = aux;
                        System.out.print(v[contador2] + " ");
                        soma += aux;
                        aux = x - aux;
                        contador2++;
                    }
                    System.out.println();
                }

            } while (v[0] != 1);
        }

    }

}
