package aeds.LeetCode;

public class leetcode6 {
    //Palindromo
    public static void main(String[] args) {
        String string = "abb";
        System.out.println(string.lastIndexOf("a"));
    }
}
class Solution {
    public String longestPalindrome(String s) {
        int Contador = 0;
        int maiorContador = 0;
        int i = 0, j = 0;
        for(;i<s.length();i++){
            //AA AAB

            int pos = s.lastIndexOf(s.charAt(i));
            if(pos!=-1&pos!=i){
                for(j=i+1;j<pos;j++){
                    //Finalizando
                }

            }


        }
        return null;
    }
}

//Possibilidades

/*
1 - Varreer caracter por caracter até encontrar o maior possível - Tipo um insertion sort
2 - Procurar na String algum caracter repetido, ver se até ele existe um palindromo, procurar o ultimo que aparece e já testa a maior possibilide para a menor se for verdade já para
3 - Procurar para frente e nunca olhar para trás

Ex: aabbaa
    abcba
    abcdedcba

 */