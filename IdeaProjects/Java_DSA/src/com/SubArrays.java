package com;

import java.util.Arrays;

public class SubArrays {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 8, 12};
        subArrays(arr);
        //System.out.println(Arrays.toString(subArrays(arr));
    }
    static void subArrays(int[] num){
        int total = 0;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(num[k] +" ");
                }
                total++;
            }
            System.out.println();
        }
        System.out.println("Total no of Sub Arrays are: " +total);
    }
}
