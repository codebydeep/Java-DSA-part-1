package com;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        /*
        sortedArray(nums1, nums2);
        System.out.println(Arrays.toString(nums1));

         */
        agSort(nums1 , nums2);
        System.out.println(Arrays.toString(nums1));
    }

    static void sortedArray(int[] num, int[] sum){
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < sum.length; j++) {
                if (num[i] < sum[j]){
                    int temp = sum[j];
                    sum[j] = num[i];
                    num[i] = temp;
                }
            }
        }
    }
    static void agSort(int[] nums1,int[] nums2) {
        sortedArray(nums1, nums2);
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 1; j < nums1.length - i; j++) {
                // Swap if the Item is smaller then previous Item.
                if (nums1[j] < nums1[j - 1]) {
                    // swap
                    int temp = nums1[j];
                    nums1[j] = nums1[j - 1];
                    nums1[j - 1] = temp;
                }
            }
        }
    }
}
