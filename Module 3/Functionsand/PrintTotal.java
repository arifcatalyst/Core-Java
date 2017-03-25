package com.company.Functionsand;

/**
 * Created by Arif on 12-12-2016.
 */
public class PrintTotal {
    public static void main(String[] args) {
        String [] arr={"rat","cat","mat"};
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
            if (str.charAt(i)=='a' || str.charAt(i)=='A')
            {
                count++;
            }
        }
        return count;
    }
}
