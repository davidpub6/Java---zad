package Zad3;

import java.util.Arrays;

public class Main {
    public static int suma(int[] ... table) {
        int sum = 0;

        for(int[] subtable : table){
            for(int num : subtable){
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {5,7,8,9,2,3};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {34,65,2,3,8,9,0,2,45};

        System.out.println("Arr1 : "+Arrays.toString(arr1));
        System.out.println("Arr2 : "+Arrays.toString(arr2));
        System.out.println("Arr3 : "+Arrays.toString(arr3));
        System.out.println("Sum : "+ suma(arr1,arr2,arr3));

    }
}
