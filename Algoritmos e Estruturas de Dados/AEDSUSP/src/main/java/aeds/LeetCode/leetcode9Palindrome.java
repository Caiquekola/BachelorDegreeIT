package aeds.LeetCode;

public class leetcode9Palindrome {

    public static void main(String[] args) {
        int x = 212;
        boolean result = isPalindrome(x);
        System.out.println(result);

    }
    public static boolean isPalindrome(int x) {
        int y  = 0;
        int copy = x;
        int contador = 0;
        while(x!=0){
            y += (int)Math.pow(10,contador) * (x%10);
            contador++;
            x = x/10;
        }
        return y == copy;
    }
}
