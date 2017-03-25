package com.company.Functionsand;

/**
 * Created by Arif on 13-12-2016.
 */
public class PrintPattern3 {
    public static void main(String[] args) {
        int n=4;int res=0;
        for (int i=1;i<=n;i++)
        {
            String str="";
            for (int j=1;j<=n;j++)
            {
                res=i*j;
                str=str+res;
            }
            System.out.println(str);
        }
    }
}
