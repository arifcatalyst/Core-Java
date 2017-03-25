package com.company.Functionsand;

/**
 * Created by Arif on 13-12-2016.
 */
public class FirstThree {
    public static void main(String[] args) {
        String []arr={"George","IO","Jacob",""};
        int len=arr.length;
        for (int i=0;i<len;i++)
        {
            String element=arr[i];
            arr[i]=modify(element);
        }
        for (int i=0;i<len;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static String modify(String str)
    {
        int len=str.length();
        String newstr="";
        for (int i=0;i<len;i++)
        {
            if (i >= 3)
            {
                newstr = newstr;
            }
            else
            {
                newstr = newstr + str.charAt(i);
            }
        }
        return newstr;
    }
}
