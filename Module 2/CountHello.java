package com.company;

/**
 * Created by Arif Zeeshan on 3/4/2017.
 * CountHello

 Problem Statement

 Return the number of times that the string "hello" appears anywhere in the given string.

 Sample Input #1

 count("abc hello def")
 Sample Output #1

 1
 Sample Input #2

 count("Hi. Hello. Hello. Ok")
 Sample Output #2

 2
 Sample Input #3

 count("hi")
 Sample Output #3

 0
 */
public class CountHello {

    static String testcase1 = "HELLO how are you";

    public static void main(String args[]){
        CountHello testInstance= new CountHello();
        int result = testInstance.count(testcase1);
        System.out.println(result);
    }

    public int count(String str)
    {
        int counter=0;
        for (int i=0;i<str.length();i++)
        {
            if ((str.charAt(i)=='h' ||str.charAt(i)=='H') && (str.charAt(i+1)=='e' ||str.charAt(i+1)=='E') && (str.charAt(i+2)=='l' || str.charAt(i+2)=='L') && (str.charAt(i+3)=='l' || str.charAt(i+3)=='L') && (str.charAt(i+4)=='o' || str.charAt(i+4)=='O'))
            {
                counter++;
            }
        }
        return counter;
    }
}