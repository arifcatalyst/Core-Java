package com.company;

/**
 * Created by Arif on 10-12-2016.
 */
public class VisualProduct {
    public static void main(String[] args) {
        int n=5,prod=1;
        String pattern="";
        for(int i=1;i<=n;i++){
            prod=prod*i;
            if(i==n){
                pattern=pattern+i+"="+prod;
            }
            else{
                pattern=pattern+i+"*";
            }
        }
        System.out.println(pattern);

    }
}
