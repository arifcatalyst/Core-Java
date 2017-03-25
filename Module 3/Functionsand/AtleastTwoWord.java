package com.company.Functionsand;

/**
 * Created by Arif on 21-12-2016.
 */
public class AtleastTwoWord {
    public static void main(String[] args) {
        String [] arr={"whatthe","name","football","black day","mission"};
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
        int count=0;
        for (int i=0;i<str.length();i++)
        {
         if (str.charAt(i)==' ')
         {
             count++;
         }
        }
        if (count>=1)
        {
            return 1;
        }
        return 0;

    }
}
