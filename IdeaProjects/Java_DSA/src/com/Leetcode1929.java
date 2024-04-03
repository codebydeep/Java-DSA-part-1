package com;

import java.util.Arrays;

public class Leetcode1929 {
    public static void main(String[] args) {
        int[]num = {1,2,1};
        //int[] non = concateArray(num);
        //System.out.println(Arrays.toString(non));
        Array(num);
    }
    static int[] concateArray(int[] num){
        int[] temp =  num;
        int[] nos = new int[2* num.length];
        for (int i = 0; i < 3; i++) {
            nos[i] = temp[i];
        }
        for (int i = 3; i < nos.length; i++) {
            nos[i] = temp[i-3];
        }
        //System.out.println(Arrays.toString(nos));
        return nos;
    }
    static void Array(int[]nums){
        int[] temp = new int[2* nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }
        for (int i = nums.length; i < temp.length; i++) {
            temp[i] = nums[i-3];
        }
       // temp = nums;
        System.out.println(Arrays.toString(temp));
    }
}
