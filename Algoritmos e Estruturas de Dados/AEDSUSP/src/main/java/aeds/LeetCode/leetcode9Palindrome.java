package aeds.LeetCode;

public class leetcode9Palindrome {

    public static void main(String[] args) {
        int x = 121;
        boolean result = isPalindrome(x);
        System.out.println(result);

    }
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int y  = 0;
        int copy = x;
        int contador = 0;
        while(x!=0){
            y = (y * 10) + (x%10);
            contador++;
            x = x/10;
        }
        return y == copy;
    }
}
