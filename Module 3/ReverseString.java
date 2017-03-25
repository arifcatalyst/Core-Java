package com.company;

/**
 * Created by Arif on 11-12-2016.
 */
public class ReverseString {
    public static void main(String[] args) {
        String str="1234567890";
        int len=str.length();
        String newstr="";
        for (int i=len-1;i>=0;i--){
            char ch=str.charAt(i);
            newstr=newstr+ch;
        }
        System.out.println(newstr);
    }
}