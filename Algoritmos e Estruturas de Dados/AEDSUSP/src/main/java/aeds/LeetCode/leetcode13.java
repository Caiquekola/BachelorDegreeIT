package aeds.LeetCode;

import java.util.*;

public class leetcode13 {
    public static void main(String[] args) {
        Map<Character, Integer> romano = new HashMap<>();
        romano.put('I', 1);
        romano.put('V', 5);
        romano.put('X', 10);
        romano.put('L', 50);
        romano.put('C', 100);
        romano.put('D', 500);
        romano.put('M', 1000);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int somatorio = 0;
        List<Character> redutores = Arrays.asList('I', 'X', 'C');
        for (int i = 0; i < input.length(); i++) {
            // I X C
            // IV IX XL XC CD CM
            if (i != input.length() - 1 && romano.get(input.charAt(i)) < romano.get(input.charAt(i + 1))) {
                somatorio -= romano.get(input.charAt(i));
            } else {
                somatorio += romano.get(input.charAt(i));
            }
        }
        System.out.println(somatorio);
    }
}





