package com.company.Functionsand;

/**
 * Created by Arif on 13-12-2016.
 */
public class CountDigitArray {
    public static void main(String[] args)
    {
        String [] arr={"123","456","789"};
        int len=arr.length;
        int count=0;
        for (int i=0;i<len;i++)
        {
            count=count+getcount(arr[i]);
        }
        System.out.println(count);
    }
    public static int getcount(String str)
    {
        int count=0;
        int len=str.length();
        for (int i=0;i<len;i++)
        {
            if (str.charAt(i)>='0' && str.charAt(i)<='9')
            {
                count++;
            }
        }
        return count;
    }
}
