package com;

public class Leetcode1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }
    static int findNumbers(int[] nums) {
        int cnt=0;
        for (int i = 0; i < nums.length; i++) {
            if (isEven(nums[i])){
                cnt++;
            }
        }
        return cnt;
    }
    static boolean isEven(int num){
        int nos = digits(num);
        if (nos%2==0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
