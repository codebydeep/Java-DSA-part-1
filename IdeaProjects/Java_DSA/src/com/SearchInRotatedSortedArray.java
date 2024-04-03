package com;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
        System.out.println(findPivot(arr));
    }
    // Method to find Pivot Element.
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            // 4 Cases Over here.
            if (arr[mid] > arr[mid+1] && mid < end){
                return mid;
            }
            if (arr[mid] < arr[mid-1] && mid > start){
                return mid-1;
            }
            if (arr[mid] <= arr[start]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }

    // Method to find Element or Target.
    static int search(int[] num, int target){
        int pivot = findPivot(num);

        // If you did not find pivot, it means the Array is not Sorted.
        if (pivot == -1){
            // Just do normal Binary Search.
            return BinarySearch(num , target, 0 ,num.length-1);
        }
        // If pivot is found , you have found 2 Ascending Sorted Arrays.
        if (num[pivot] == target){
            return pivot;
        }
        if (target >= num[0]){
            return BinarySearch(num, target, 0, pivot-1);
        }
        return BinarySearch(num, target, pivot+1, num.length-1);
    }


    static int BinarySearch(int[] num , int element ,int start , int end){
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


    // In Case of Duplicate values.
    static int findPivotwithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            // 4 Cases Over here.
            if (arr[mid] > arr[mid+1] && mid < end){
                return mid;
            }
            if (arr[mid] < arr[mid-1] && mid > start){
                return mid-1;
            }
            // If Elements at middle, start, end are Equal then just skip the duplicates.
            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the duplicates.
                // Note: What if these elements at start and end were the pivot??
                // check, if start is pivot.
                if (arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                // Check whether end is pivot.
                if (arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            // Left side is Sorted, so pivot should be in right.
           /*
            else if (arr[start] < arr[mid] || (arr[start] = arr[mid] && arr[mid] > arr[end])) {
                start = mid+1;
            }
            */
            else {
                end = mid-1;
            }
        }
        return -1;
    }
}
