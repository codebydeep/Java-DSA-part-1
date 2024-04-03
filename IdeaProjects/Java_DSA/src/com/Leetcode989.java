package com;

import java.util.ArrayList;
import java.util.List;

public class Leetcode989 {
    private static java.util.List<Integer> List;

    public static void main(String[] args) {
        int[] arr = {1,2,0,0};
        int k = 34;
        int[]list = addToArrayForm(arr,k);
        System.out.println(list);
    }
    static int[] addToArrayForm(int[] num, int k) {
        for (int i = num.length-1; i >= 0; i--) {
            while(k>0){
                int rem = k/10;
                num[i] += rem;
            }
        }
        return num;
    }
}
