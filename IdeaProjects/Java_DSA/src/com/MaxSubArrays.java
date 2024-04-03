package com;

public class MaxSubArrays {
        public static void main(String[] args) {
            int[] arr = {3, 5, 7, 8, 12};
            subArrays(arr);
            //System.out.println(Arrays.toString(subArrays(arr));
        }
        static void subArrays(int[] num){
            //int total = 0;
            int currSum = 0;
            int maxSum = Integer.MIN_VALUE;
            for (int i = 0; i < num.length; i++) {
                int start = i;
                for (int j = i; j < num.length; j++) {
                    int end = j;
                    currSum=0;
                    for (int k = start; k <= end; k++) {
                        System.out.print("[" + num[k] + "," + "]");
                            currSum += num[k];
                    }
                    if (maxSum < currSum){
                        maxSum = currSum;
                    }
                   // total++;
                }
                System.out.println();
            }
            //System.out.println("Total no of Sub Arrays are: " +total);
                System.out.println(maxSum);
        }
}
