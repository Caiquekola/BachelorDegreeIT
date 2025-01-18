package com.caiquekola.ListaExercicios;

public class Exc6SortedArray {
    public static void main(String[] args) {
        int[] sortedArray = {1,2,3,4,5,6,7};
        int[] array = {4,2,1,5};

        System.out.println("Ordered array:" +orderedElements(sortedArray,0));
        System.out.println("Ordered array:" +orderedElements(array,0));

    }

    public static boolean orderedElements(int[] array, int index){
        if(index>=array.length-1){
            return true;
        }
        if(array[index]>array[index+1]){
            return false;
        }
        return orderedElements(array, index+1);
    }
}
