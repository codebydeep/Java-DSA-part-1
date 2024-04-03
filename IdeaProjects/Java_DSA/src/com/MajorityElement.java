package com;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 22, 9, 6, 1, 4, 2,2 , 7, 88, 56,4, 987,34};
        //insort(nums);
        bubble(nums);
        System.out.println(Arrays.toString(nums));
    }

    /*
     static void insort(int[] arr){
     for (int i = 0; i < arr.length-1; i++) {
         for (int j = i+1; j > 0 ; j--) {
             if (arr[j] < arr[j-1]){
                 int temp = arr[j-1];
                 arr[j-1] = arr[j];
                 arr[j] = temp;
             }
             else{
             break;
         }
     }
     }
     */
    static void bubble(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
