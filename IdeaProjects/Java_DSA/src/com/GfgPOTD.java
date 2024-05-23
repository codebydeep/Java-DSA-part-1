package com;

import java.util.Arrays;

public class GfgPOTD {
    public static void main(String[] args) {
        int[] s = {4,2,1};
        substrings(s);
    }
static void substrings(int[] s){
        /*
        char[] ch = s.toCharArray();
        System.out.println(Arrays.toString(ch));

         */
       int current = 0;
    for (int i=0;i< s.length;i++){
        int start = i;

        for (int j=i;j< s.length;j++){
            int end = j;
           // current = 0;
            for (int k=start;k<=end;k++){
                System.out.print(s[k]+"");
                current += s[k];
                System.out.println(current);
            }
            System.out.println();
        }
    }
    System.out.println(current);
}
}
