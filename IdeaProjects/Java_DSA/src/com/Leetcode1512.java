package com;

public class Leetcode1512 {
    public static void main(String[] args) {
       int[] nums = {1,2,3,1,1,3};
        // There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
       numIdenticalPairs(nums);
       // System.out.println(ans);
    }
    static void numIdenticalPairs(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length ; j++) {
                int end = j;
                cnt = 0;
                for (int k = start; k <= end; k++) {
                        System.out.print(nums[k] + " ");
                        cnt += nums[k];
                }
                System.out.println();
            }
        }
        System.out.println(cnt);
    }
}
