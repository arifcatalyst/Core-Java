package com.company;

/**
 * Created by Arif Zeeshan on 2/28/2017.
 * DoubleString

 Problem Statement

 Given a string, return a string where for every char in the original, there are two chars.

 Sample Input #1

 double("The")
 Sample Output #1

 TThhee
 Sample Input #2

 double("AAbb")
 Sample Output #2

 AAAAbbbb
 Sample Input #3

 double("HiHello")
 Sample Output #3

 HHiiHHeelllloo
 */
public class DoubleString {

    static String testcase1 = "Hello";

    public static void main(String args[]){
        DoubleString testInstance= new DoubleString();
        String result = testInstance.doubleStr(testcase1);
        System.out.println(result);
    }

    public String doubleStr(String str)
    {
        String pattern="";
        for (int i=0;i<str.length();i++)
        {
            pattern=pattern+str.charAt(i);
            pattern=pattern+str.charAt(i);
        }
        return pattern;
    }
}
