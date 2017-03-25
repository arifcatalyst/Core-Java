package com.company;

/**
 * Created by Arif Zeeshan on 2/28/2017.
 * ReverseString

 Problem Statement

 Given a string as input, reverse it. Reverse means return the string if it is read from right to left.

 Sample Input #1

 reverse("Hello")
 Sample Output #1

 olleH
 Sample Input #2

 reverse("TAP")
 Sample Output #2

 PAT
 */
public class ReverseString {

    static String testcase1 = "Capital : Delhi";

    public static void main(String args[]){
        ReverseString testInstance= new ReverseString();
        String result = testInstance.reverse(testcase1);
        System.out.println(result);
    }

    public String reverse(String str1)
    {
        String pattern="";
        for (int i=str1.length()-1;i>=0;i--)
        {
            pattern=pattern+str1.charAt(i);
        }
        return pattern;
    }
}