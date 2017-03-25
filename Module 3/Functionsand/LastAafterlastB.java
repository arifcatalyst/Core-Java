package com.company.Functionsand;

/**
 * Created by Arif on 22-12-2016.
 */
public class LastAafterlastB {
    public static void main(String[] args)
    {
        String str="aaabbcab";
        for (int i=0;i<str.length();i++)
        {
            int indexb = str.indexOf('b');
            if (indexb > -1)
            {
                int indexa = str.indexOf('a', indexb);
                if (indexa > -1)
                {
                    System.out.println('a');
                }
                else
                {
                    System.out.println('b');
                }
            }
        }
    }
}
