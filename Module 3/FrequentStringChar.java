package com.company;

/**
 * Created by Arif on 26-12-2016.
 */
public class FrequentStringChar {
    public static void main(String[] args) {
    }
    String[]arr={"cook","crook","calm"};
    public static int getNString(String str)
    {
        for (int i=0;i<str.length()-1;i++)
        {
            char ch1=str.charAt(i);
            char ch2=str.charAt(i+1);
            if (ch1==ch2)
            {
                return 0;
            }
        }
        return 1;
    }
    public static int func(String[]arr)
    {
        int count=0;
        for (int i=0;i<arr.length;i++)
        {
            String str=arr[i];
            count=count+getNString(str);
        }
        return count;
   }
}
