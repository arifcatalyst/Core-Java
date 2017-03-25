package com.company;

/**
 * Created by Arif on 11-12-2016.
 */
public class RemoveA {
    public static void main(String[] args) {
        String str="barbequeue";
        int len=str.length();
        String newstr="";
        for (int i=0;i<len;i++){
            char ch=str.charAt(i);
            if (ch=='a'){
                newstr=newstr;
            }
            else{
                newstr=newstr+ch;
            }
        }
        System.out.println(newstr);

    }
}
