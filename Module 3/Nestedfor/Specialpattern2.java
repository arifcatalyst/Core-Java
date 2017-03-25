package com.company.Nestedfor;

/**
 * Created by Arif on 14-12-2016.
 */
public class Specialpattern2 {
    public static void main(String[] args) {
        int n=4;
        int m=n-1;
        String pattern="";
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                pattern=pattern+i;
            }
            for (int j=1;j<=m;j++)
            {
                pattern=pattern+"0";
            }
            pattern=pattern+"$";
            m=m-1;
        }
        System.out.println(pattern);
    }
}
