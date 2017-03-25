package com.company;

/**
 * Created by Arif on 11-12-2016.
 */
public class CountA {
    public static void main(String[] args) {
        String str="abcad";
        int len=str.length();
        int count=0;
        for (int i=0;i<len;i++){
            char ch=str.charAt(i);
            if (ch=='a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
