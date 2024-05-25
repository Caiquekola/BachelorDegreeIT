package aeds.faseZero;

import java.util.Scanner;

public class xadrezMula {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        int l = scan.nextInt();
        scan.nextLine();
        char[][] tab = new char[n][m];
        for (int i = 0; i < n; i++) {
            String linha = scan.nextLine();
            for (int j = 0; j < m; j++) {
                tab[i][j] = linha.charAt(j);
            }
        }
        int peoes = 0;
        int maiorQtdP = -1;
        int melhorColuna = 0;
        int melhorLinha = 0;

        for (int i = n-1; i >=0 ; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if(tab[i][j] == '.'){
                    peoes = qntdAtaques(tab,n,m,i,j,k-1,l-1);
                    if(peoes >= maiorQtdP) {
                        maiorQtdP = peoes;
                        melhorLinha = i;
                        melhorColuna = j;
                    }
                }
            }
        }
        System.out.println(melhorLinha+1+" "+(melhorColuna+1));

    }

    private static int qntdAtaques(char[][] tabuleiro, int n, int m, int linhas, int colunas, int k, int l){
        int atks = 0;
        m--;
        n--;

        //cima para K
        int aux = 0;
        for (int i = 0; i < 2; i++) {
            //cima
            if(linhas-k>=0){
                //direta
                if(colunas+l<=m){
                    if(tabuleiro[linhas-k][colunas+l] == '*'){
                        atks++;
                    }

                }
                //esquerda
                if(colunas-l>=0){
                    if(tabuleiro[linhas-k][colunas-l] == '*'){
                        atks++;
                    }
                }
            }
            //baixo
            if(linhas+k<=n){
                //direta
                if(colunas+l<=m){
                    if(tabuleiro[linhas+k][colunas+l] == '*'){
                        atks++;
                    }

                }
                //esquerda
                if(colunas-l>=0){
                    if(tabuleiro[linhas+k][colunas-l] == '*'){
                        atks++;
                    }
                }
            }
            aux = k;
            k = l;
            l = aux;

        }
        return atks;

    }

}