package com.company.Functionsand;

/**
 * Created by Arif on 13-12-2016.
 */
public class PrintPattern2 {
    public static void main(String[] args) {
        int n=4;
        String str="";
        int num=n;
        for (int i=1;i<=n;i++)
        {
            for (int j=i;j<=num;j++)
            {
                str=str+j;
            }
            num=num+1;
            str=str+"$";
        }
        System.out.println(str);
    }
}
