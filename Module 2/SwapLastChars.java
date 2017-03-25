package com.company;

/**
 * Created by Arif Zeeshan on 3/4/2017.
 * SwapLastChars

 Problem Statement

 Given a string as input, return the string with its last 2 chars swapped. If the string has less than 2 chars, do nothing and return the input string.

 Sample Input #1

 swap("Hello")
 Sample Output #1

 Helol
 Sample Input #2

 swap("123456")
 Sample Output #2

 123465
 Sample Input #3

 swap("1")
 Sample Output #3

 1
 */
public class SwapLastChars {

    static String testcase1 = "21";

    public static void main(String args[]){
        SwapLastChars testInstance= new SwapLastChars();
        String result = testInstance.swap(testcase1);
        System.out.println(result);
    }


    public String swap(String str1)
    {
        String pattern="";
        int len=str1.length();
        if (len>=2)
        {
            for (int i=0;i<len;i++)
            {
                if (i>=len-2)
                {
                    char ch=str1.charAt(len-1);
                    char ch1=str1.charAt(len-2);
                    pattern=pattern+ch+ch1;
                    break;
                }
                else
                {
                    pattern=pattern+str1.charAt(i);
                }

            }
        }
        if (len>=2)
        {
            return pattern;
        }
        else
            return str1;

    }
}
