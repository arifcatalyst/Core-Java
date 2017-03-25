package com.company;

/**
 * Created by Arif on 11-12-2016.
 */
public class CountDigit {
    public static void main(String[] args) {
        String str="a123bc3d";
        int len=str.length();
        int count=0;
        for (int i=0;i<len;i++){
            char ch=str.charAt(i);
            if (ch>='0' && ch<='9'){
                count++;
            }
        }
        System.out.println(count);
    }
}
