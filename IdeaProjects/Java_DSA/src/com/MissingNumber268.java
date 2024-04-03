package com;

import java.util.Arrays;

public class MissingNumber268 {
    /*
    public static void main(String[] args) {
        int[] num = {0,1};

        cyclicSort(num);
        System.out.println(Arrays.toString(num));

       int ans = count(num);
        System.out.println(ans);

    }
    static void cyclicSort(int[] num){
        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length-i ; j++) {
                if (num[j-1] > num[j]){
                    swap(num , j , j-1);
            }
        }
        }
    }

    static void swap(int [] num , int first , int second){
        int temp = num[first];
        num[first] = num[second];
        num[second] = temp;
    }

    static int count(int[] num){
        int i = 0;
        while(i < num.length) {
            int correct = i;
            if (correct != num[i]){
                return i;
            } else if (correct == num[i]) {
                return num.length;
            }
            i++;
        }
        return -1;
    }
     */
    public int missingNumber(int[] nums) {
         int i=0;
         while (i<nums.length){
             int correct = nums[i];
             if (nums[i] != correct){
                 swap(nums, i , correct);
             }else {
                 i++;
             }
         }
        for (int j = 0; j < nums.length; i++) {
            if (nums[j] != i){
                return i;
            }
        }
        return nums.length;
    }

    static void swap(int [] num , int first , int second){
        int temp = num[first];
        num[first] = num[second];
        num[second] = temp;
    }
}
