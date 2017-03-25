package com.company;

/**
 * Created by Arif Zeeshan on 3/4/2017.
 * CombineStr

 Problem Statement

 Given two strings s1 and s2 as input, create a string made of the first char of s1, the first char of s2, the second char of s1,
 the second char of s2, and so on. Any leftover chars go at the end of the result string.

 Sample Input #1

 combine("abc","123")
 Sample Output #1

 a1b2c3
 Sample Input #2

 combine("Hi","Hello")
 Sample Output #2

 HHiello
 Sample Input #3

 combine("Namaste", "Hi")
 Sample Output #3

 NHaimaste

 */
public class CombineStr {

    static String testcase1 = "Hi";
    static String testcase2 = "Hello";

    public static void main(String args[]){
        CombineStr testInstance= new CombineStr();
        String result = testInstance.combine(testcase1,testcase2);
        System.out.println(result);
    }

    public String combine(String str1,String str2)
    {
        int len1=str1.length();
        int len2=str2.length();
        int max=len1;
        if (len2>len1)
            max=len2;
        int min=len2;
        if (max>len1)
            min=len1;
        String pattern="";
        int f1=0;
        for (int i=f1;i<min;i++)
        {
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);
            pattern=pattern+ch1+ch2;
            f1++;
        }
        if (max>min)
        {
            for (int i=f1;i<max;i++)
            {
                if (len2>len1)
                {
                    char ch2=str2.charAt(i);
                    pattern=pattern+ch2;
                }
                else
                {
                    char ch1=str1.charAt(i);
                    pattern=pattern+ch1;
                }
            }
        }

        return pattern;
    }
}