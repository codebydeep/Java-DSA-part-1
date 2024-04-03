package com;

public class SmallerLetterGreaterThanTarget {
    public static void main(String[] args) {
        char [] ch = {'c', 'f', 'h'};
        char target = 'a';
        char ans = Ceil(ch, target);
        System.out.println(ans);
    }
    static char Ceil(char[] ch, char target){
        int s = 0;
        int e = ch.length-1;
        while (s<=e){
            int mid = s + (e-s)/2;
            if (ch[mid] > target){
                e = mid-1;
            } else if (ch[mid] < target) {
                s = mid+1;
            }
            else {
                return ch[mid];
            }
        }
        return ch[s];
    }
}
