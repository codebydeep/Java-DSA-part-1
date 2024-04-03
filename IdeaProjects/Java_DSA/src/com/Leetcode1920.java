package com;

import java.util.Arrays;

public class Leetcode1920 {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        //output - {0,1,2,4,5,3};
       buildArray(nums);
       // int[] ans = Array(nums);
    }
    static void buildArray(int[] nums) {
        int[] nos = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nos[i] = nums[nums[i]];
        }
        System.out.println(Arrays.toString(nos));
    }
    static int[] Array(int[] nums){
        int[] nos = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nos[i] = nums[nums[i]];
        }
        return nos;
    }

}
