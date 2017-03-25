package com.company.Functionsand;

/**
 * Created by Arif on 13-12-2016.
 */
public class EqualAnB {
    public static void main(String[] args)
    {
        String []arr={"aabb","aabb","aaab"};
        int len=arr.length;
        int count=0;
        boolean bool=false;
        for (int i=0;i<len;i++)
        {
            bool=getcount(arr[i]);
            if (bool==true)
            {
                count++;
            }
        }
        System.out.println(count);

    }
    public static boolean getcount(String str)
    {
        boolean bool=false;
        int count1=0;
        int count2=0;
        int len=str.length();
        for (int i=0;i<len;i++)
        {
            if (str.charAt(i)=='a' || str.charAt(i)=='A')
            {
                count1++;
            }
            if (str.charAt(i)=='b' || str.charAt(i)=='B')
            {
                count2++;
            }
        }
            if (count1==count2)
                bool=true;

        return bool;
    }
}
