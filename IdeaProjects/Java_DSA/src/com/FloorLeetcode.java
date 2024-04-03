package com;

public class FloorLeetcode {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = Floor(arr,target);
        System.out.println(ans);
    }
    static int Floor(int[] num, int target){
        int s=0;
        int e= num.length;
        // Target value is smaller than the Smaller number in the Array.
        /*
        if (target < num[num.length - 1]){
            return -1;
        }

         */
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
        return e;
    }
}
