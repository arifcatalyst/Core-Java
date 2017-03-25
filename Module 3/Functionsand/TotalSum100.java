package com.company.Functionsand;

/**
 * Created by Arif on 21-12-2016.
 */
public class TotalSum100 {
    public static void main(String[] args) {
        int [] arr={100,20,0,25};
        int n=0;
        int len=arr.length;
        String print="";
        for (int i=0;i<len;i++)
        {
            n=n+arr[i];
            print=print+arr[i];
            if (n==100)
            {
                len=0;
            }
        }
        System.out.println(print);
    }
}
