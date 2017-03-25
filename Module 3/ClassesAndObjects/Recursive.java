package com.company.ClassesAndObjects;

/**
 * Created by Arif on 30-12-2016.
 */
public class Recursive {
    public static void main(String[] args) {
        System.out.println(fact(10));
    }
    public static int fact(int n)
    {
        if (n<=1)
        return 1;
        else
            System.out.println(n);
            return fact(n-1)*n;
    }
}
