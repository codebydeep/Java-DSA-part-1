package com;

import java.util.ArrayList;
import java.util.List;

public class Leetcode448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int current = nums[i]-1;
            if (nums[i] != nums[current]){
                swap(nums , i, current);
            }
            else {
                i++;
            }
        }

        List<Integer>ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1){
                 ans.add(j+1);
            }
        }
        return ans;
    }
    static void swap(int [] num , int first , int second){
        int temp = num[first];
        num[first] = num[second];
        num[second] = temp;
    }
}
