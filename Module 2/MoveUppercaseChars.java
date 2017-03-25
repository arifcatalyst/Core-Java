package com.company;

/**
 * Created by Arif Zeeshan on 2/28/2017.
 * MoveUppercaseChars

 Problem Statement

 Given a string as input, move all the alphabets in uppercase to the end of the string.

 Sample Input #1

 move("Hello World")
 Sample Output #1

 ello orldHW
 Sample Input #2

 move("India")
 Sample Output #2

 ndiaI
 */
public class MoveUppercaseChars {
    static String testcase1 = "how are you";

    public static void main(String args[]){
        MoveUppercaseChars testInstance = new MoveUppercaseChars();
        String result = testInstance.move(testcase1);
        System.out.println("Result : "+result);
    }

    public String move(String str)
    {
        String pattern="";
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)>=65 && str.charAt(i)<=90)
            {
            }
            else
                pattern=pattern+str.charAt(i);
        }
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)>=65 && str.charAt(i)<=90)
            {
                pattern=pattern+str.charAt(i);
            }
        }
        return pattern;
    }
}
