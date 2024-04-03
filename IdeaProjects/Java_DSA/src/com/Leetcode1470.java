package com;

import java.util.Arrays;

public class Leetcode1470 {
    public static void main(String[] args) {
        /*
        Input: nums = [2,5,1,3,4,7], n = 3
        Output: [2,3,5,4,1,7]
        */
        int[] nums = {2,5,1,3,4,7};
        int[] ans = shuffle(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] shuffle(int[] nums){
        int [] temp = new int[nums.length];
        for (int i = 0; i < nums.length/2; i++) {
            temp[i] = nums[i];


        }

        return temp;
    }
}
