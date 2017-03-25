package com.company;

/**
 * Created by Arif Zeeshan on 3/4/2017.
 * CountCommonChars

 Problem Statement

 Given 2 strings, str1 and str2, as input, return the count of the chars which are in the same position in str1 and str2.

 Sample Input #1

 count("New York","New Delhi")
 Sample Output #1

 4 (because "New " are in the position)
 Sample Input #2

 count("rhinoceroses","hippopotamus")
 Sample Output #2

 2 (because o is 4 position in both, s is in 11th position in both)
 */
public class CountCommonChars {

    static String testcase1 = "San Francisco";
    static String testcase2 = "New Yorkers";

    public static void main(String args[]){
        CountCommonChars testInstance= new CountCommonChars();
        int result = testInstance.count(testcase1,testcase2);
        System.out.println(result);
    }

    public int count(String str1, String str2)
    {
        int counter=0;
        int len1=str1.length();
        int len2=str2.length();
        int min=len1;
        if (len1>len2)
            min=len2;
        for (int i=0;i<min;i++)
        {
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);
            if (ch1==ch2)
                counter++;
        }
        return counter;
    }
}