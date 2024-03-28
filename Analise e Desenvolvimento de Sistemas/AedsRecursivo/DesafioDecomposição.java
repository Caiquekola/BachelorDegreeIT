package desafio;

import java.util.Scanner;

public class DesafioDecomposição {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int soma = 0;
        int cont = 0;

        if (x != 1) {
            int v[] = new int[x];
            v[0] = x - 1;
            v[1] = 1;
            while (v[0] != 1) {
                cont = 0;
                soma = 0;
                while (soma != x) {
                    System.out.print(v[cont] + " ");
                    soma += v[cont];
                    cont++;

                }
                System.out.println("");
                for (int i = x - 1; i >= 0; i--) {
                    if (v[0] == 1) {
                        break;
                    }else if (v[i] != 1 && v[i] != 0) {
                        v[i]--;
                        v[i + 1]++;
                        break;
                    }
                }
               

            }
        }

    }

}
