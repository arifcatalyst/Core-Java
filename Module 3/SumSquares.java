package com.company;

/**
 * Created by Arif on 09-12-2016.
 */
public class SumSquares {
    public static void main(String[] args) {
        int sum=0;
        int n=4;
        //int n=5;
        for(int i=1 ;i<=n;i++){
            sum=sum+(i*i);
        }
        System.out.println(sum);
    }
}
