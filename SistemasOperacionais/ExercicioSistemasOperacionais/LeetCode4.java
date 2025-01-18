package ExercicioSistemasOperacionais;

import java.util.Arrays;
import java.util.Stack;

public class LeetCode4 {
    public static void main(String[] args) {
        int v[] = {1, 2};
        int v2[] = {3, 4};

        System.out.println(findMedianSortedArrays(v, v2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newArray = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            newArray[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            newArray[nums1.length + i] = nums2[i];
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        Arrays.sort(newArray);
        if (newArray.length % 2 != 0) {
            return newArray[newArray.length / 2];
        } else {
            return (double) (newArray[newArray.length / 2 - 1] + newArray[newArray.length / 2]) / 2;
        }
    }

    public boolean isValid(String s) {
        Stack<Character> pilha = new Stack<>();
        if (s.length() == 1) {
            return false;
        }
        char[] letras = s.toCharArray();
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == '(') {
                pilha.push(')');
            } else if (letras[i] == '[') {
                pilha.push(']');

            } else if (letras[i] == '{') {
                pilha.push('}');
            } else if (pilha.peek() == letras[i]) {
                pilha.pop();
            } else {
                return false;
            }

        }

        return pilha.isEmpty();
    }
}

