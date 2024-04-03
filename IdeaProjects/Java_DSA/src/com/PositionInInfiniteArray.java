package com;

public class PositionInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,
                100, 130, 140, 160 ,170};
        int target = 10;
        int ans = ans(arr, target);
        System.out.println(ans);
    }
    static int ans(int[] arr, int target){
        // First initialise the Range as 0;
        // First start with a box of size 2;
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end+1; // This is my new Start.
            // Double the box value {i.e. b/w start and end}.
            // End = previous end + size-of-box*2;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] num , int element, int start ,int end){
        /*
        int start = 0;
        int end = (int)(num.length-1/Math.pow(2, num.length-1));
         */
        while(start<=end){
            // int mid = ( start + end )/ 2; //might be possible to exceeds the Integer limit.
            // better way to find Mid.
            int mid = start + (end - start)/2;
            if (element < num[mid]){
                end = mid-1;
            } else if(element > num[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
