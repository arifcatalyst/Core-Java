package com.company.Functionsand;

/**
 * Created by Arif on 12-12-2016.
 */
public class FiveA {
    public static void main(String[] args)
    {
        String []arr={"loveA","like","mat"};
        int len=arr.length;
        int count=0;
        String longestA="";
        for (int i=0;i<len;i++)
        {
           int res=getcount(arr[i]);
           if (res>count)
           {
               count=res;
               longestA=arr[i];
           }
        }
        System.out.println(longestA);
    }
    public static int getcount(String str)
    {
        int count=0;
        int len=str.length();
        for (int i=0;i<len;i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='A')
                count++;
        }
        return count;
    }
}
