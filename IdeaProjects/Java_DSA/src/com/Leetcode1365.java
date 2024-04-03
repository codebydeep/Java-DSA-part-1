package com;

import java.util.Arrays;

public class Leetcode1365 {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] ans = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] temp = new int[nums.length];
        int cnt;
        for(int i=0;i<nums.length;i++){
            cnt=0;
            int start = nums[i];
            for(int j=0;j<nums.length;j++){
                if(start > nums[j]){
                    cnt++;
                }
            }
            temp[i] = cnt;
        }
        return temp;
    }
}
