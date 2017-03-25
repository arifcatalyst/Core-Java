package com.company;

/**
 * Created by Arif on 10-12-2016.
 */
public class UpDownn1 {
    public static void main(String[] args) {
        int n=1;
        String pattern="";
        for (int i=0;i<=5;i++){
            pattern=pattern+n+i+"$";
        }
        for (int i=4;i>=0;i--){
            pattern=pattern+n+i+"$";
        }
        System.out.println(pattern);
    }
}
