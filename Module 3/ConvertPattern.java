package com.company;

/**
 * Created by Arif on 11-12-2016.
 */
public class ConvertPattern {
    public static void main(String[] args) {
        String str="ba012i2bararj";
        int len=str.length();
        String newstr="";
        for (int i=0;i<len;i++){
            char ch=str.charAt(i);
            newstr=newstr+ch+ch;
        }
        System.out.println(newstr);
    }
}
