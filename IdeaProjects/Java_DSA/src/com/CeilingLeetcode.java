package com;

public class CeilingLeetcode {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = Ceiling(arr,target);
        System.out.println(ans);
    }
    static int Ceiling(int[] num, int target){
        int s=0;
        int e= num.length;
        // Target value is greater than the Greatest number in the Array.
        if (target > num[num.length - 1]){
            return -1;
        }
        while (s<=e){
            int mid = s +(e-s)/2;
            if (num[mid] < target){
                s = mid+1;
            }
            else if (num[mid] > target){
                e = mid - 1;
            }
            else {
                return mid;
            }
        }
        return s;
    }
}
