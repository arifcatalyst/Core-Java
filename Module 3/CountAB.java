package com.company;

/**
 * Created by Arif on 11-12-2016.
 */
public class CountAB {
    public static void main(String[] args) {
        String str="abcdcab";
        int len=str.length();
        int count=0;
        for (int i=0;i<len;i++){
            char ch=str.charAt(i);
            if (ch=='a' || ch=='b'){
                count++;
            }
        }
        System.out.println(count);


    }
}
