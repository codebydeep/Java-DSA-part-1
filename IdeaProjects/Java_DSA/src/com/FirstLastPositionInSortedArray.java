package com;

import java.util.Arrays;

public class FirstLastPositionInSortedArray {
    public static void main(String[] args) {
        int[] num = {1};
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 7;
        int[] ans = PositionRange(num,target);
        System.out.println(Arrays.toString(ans));
    }
    /*
    static int[] PositionRange(int[] num, int target){
        int s = 0;
        int e = num.length-1;

        while (s<=e){
            int mid = s + (e-s)/2;
            if (num[mid] < target){
                s = mid+1;
            } else if (num[mid] > target) {
                e = mid-1;
            }
             else {
                return new int[]{mid-1,mid};
            }


        }
        return new int[] {-1,-1};
    }

     */
    static int[] PositionRange(int[] num , int target){
        for (int i = 0; i < num.length; i++) {
            for (int j = num.length-1; j >=0 ; j--) {
                if (num[i] == target && num[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
