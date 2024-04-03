package com;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode1480 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
       // Output: [1,3,6,10]
       // Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
        runningSum(nums);
    }
    static void runningSum(int[] nums){
        int[] temp = new int[nums.length];
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans += nums[i];
            temp[i] += ans;
        }
        System.out.println(Arrays.toString(temp));
    }
}
