package com;

public class FirstLastPositionInSortedArray2 {
    public static void main(String[] args) {
       /*
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        int[] ans = //search(arr,target);
        System.out.println(ans);

    }

    static int[] searchRange(int[] num, int target){
        int[] ans ={-1, -1};
        // Check for first occurence, if Target founds the First Index.
        int s = search(num,target, true);
        int e = search(num,target, false);
        ans[0] = s;
        ans[1] = e;
        return ans;
    }
    // This function returns the Index Value of the Target.
    static int[] search(int[] num, int target, boolean findStartIndex){
        int ans = -1;
        int s=0;int e = num.length-1;
        while (s<=e){
            int mid = s + (e - s)/2;
            if (num[mid] > target){
                e = mid-1;
            } else if (num[mid] < target) {
                s = mid+1;
            }
            else {
                // Potential ans found.
                ans = mid;
                if (findStartIndex){
                    e = mid-1;
                }else {
                    s = mid+1;
                }
            }
        }
        return ans;

        */
    }
}
