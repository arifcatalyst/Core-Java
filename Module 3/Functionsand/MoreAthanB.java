package com.company.Functionsand;

/**
 * Created by Arif on 22-12-2016.
 */
public class MoreAthanB {
    public static void main(String[] args) {
        String [] arr={"ahgj","fdjkfj","defefeaaaaa"};
        int count=0;
        for (int i=0;i<arr.length;i++)
        {
            String str=arr[i];
            count=count+getCount(str);
        }
        System.out.println(count);
    }
    public static int getCount(String str)
    {
        int count1=0,count2=0;
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)=='a')
            {
                count1++;
            }
            else if (str.charAt(i)=='b')
            {
                count2++;
            }
        }
        if (count1>count2)
        {
            return 1;
        }
        return 0;
    }
}
