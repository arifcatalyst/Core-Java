package com.company;

/**
 * Created by Arif on 11-12-2016.
 */
public class RemoveDigit {
    public static void main(String[] args) {
        String str="ba0123barbewuqu3";
        int len=str.length();
        String newstr="";
        for (int i=0;i<len;i++){
            char ch=str.charAt(i);
            if (ch>='0' && ch<='9'){
                newstr=newstr;
            }
            else{
                newstr=newstr+ch;
            }
        }
        System.out.println(newstr);
    }
}
