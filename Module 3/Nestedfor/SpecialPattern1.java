package com.company.Nestedfor;

/**
 * Created by Arif on 14-12-2016.
 */
public class SpecialPattern1 {
    public static void main(String[] args) {
        int n=3;
        String pattern="";
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                pattern=pattern+i;
            }
            pattern=pattern+"$";
        }
        System.out.println(pattern);
    }
}
