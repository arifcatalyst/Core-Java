package com.company;

/**
 * Created by Arif Zeeshan on 3/5/2017.
 * BatBall

 Problem Statement

 Given a string, return true if the string "bat" and "ball" appear the same number of times.

 Sample Input #1

 batBall("1bat2ball")
 Sample Output #1

 true
 Sample Input #2

 batBall("1bat2bat3ball4catch")
 Sample Output #2

 false
 Sample Input #3

 batBall("hello")
 Sample Output #3

 true
 */
public class BatBall {

    static String testcase1 = "1bat2bat3ball4catchball";

    public static void main(String args[]){
        BatBall testInstance= new BatBall();
        boolean result = testInstance.equal(testcase1);
        System.out.println(result);
    }

    public boolean equal(String str)
    {
        int counter1=0;
        int counter2=0;
        for (int i=0;i<str.length();i++)
        {
            if ((str.length()-2>i) && (str.charAt(i)=='b' && str.charAt(i+1)=='a' && str.charAt(i+2)=='t'))
            {
                counter1++;
            }

            else if ((str.length()-3>i) && (str.charAt(i)=='b' && str.charAt(i+1)=='a' && str.charAt(i+2)=='l' && str.charAt(i+3)=='l'))
            {
                counter2++;
            }
        }
        if (counter1==counter2)
        {
            return true;
        }
        else
            return false;
    }
}
