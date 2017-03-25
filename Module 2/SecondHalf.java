package com.company;

/**
 * Created by Arif Zeeshan on 2/28/2017.
 * SecondHalf

 Problem Statement

 Given a string as input, output the second half of the string. You can assume that the length of the string is a even number.

 Sample Input #1

 half("HelloWorld")
 Sample Output #1

 World
 Sample Input #2

 half("123456")
 Sample Output #2

 456
 */
public class SecondHalf {

    static String testcase1 = "mangojuice";

    public static void main(String args[]){
        SecondHalf testInstance= new SecondHalf();
        String result = testInstance.half(testcase1);
        System.out.println(result);
    }

    public String half(String word)
    {
        String pattern="";
        int second=word.length()/2;
        for (int i=second;i<second*2;i++)
        {
            pattern=pattern+word.charAt(i);
        }
        return pattern;
    }
}
