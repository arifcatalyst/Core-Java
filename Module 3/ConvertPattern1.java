package com.company;

/**
 * Created by Arif on 12-12-2016.
 */
public class ConvertPattern1 {
    public static void main(String[] args) {
        String str="123456";
        int len=str.length();
        String newstr="";
        for (int i=0;i<len;i++){
            char ch=str.charAt(i);
            if (i%2==0){
                newstr=newstr+ch;
            }
        }
        System.out.println(newstr);
    }
}
