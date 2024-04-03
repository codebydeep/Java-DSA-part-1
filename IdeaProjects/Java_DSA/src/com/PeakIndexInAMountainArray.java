package com;

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 6, 3, 2};
        int ans = peakIndex(arr);
        System.out.println(ans);
    }
    static int peakIndex(int[] num){
        int start = 0;
        int end = num.length-1;
        while(start<end){
            int mid = start + (end - start) / 2;
            if (num[mid] > num[mid+1]){
                end = mid;
            }
            else {
              start = mid+1;
            }
        }
        return start;
    }
}
