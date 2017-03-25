package com.company;

/**
 * Created by Arif on 11-12-2016.
 */
public class PrintPattern {
    public static void main(String[] args) {
        String str="abc";
        int len=str.length();
        String newstr="";
        for (int i=0;i<len;i++){
            char ch=str.charAt(i);
            System.out.println(ch);
        }
    }
}
