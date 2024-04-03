package com;

public class Leetcode1832 {
    public static void main(String[] args) {
        String sentence = "leetcode";
        checkIfPangram(sentence);
        //System.out.println(ans));
    }
    static void checkIfPangram(String sentence) {
        char[] ch = sentence.toCharArray();
        int cnt=0;
        for (int i = 0; i < ch.length; i++) {
            cnt++;
        }
        if (ch.length == cnt){
            System.out.println(cnt);
        }
        else {
            System.out.println("False");
        }

    }
}
