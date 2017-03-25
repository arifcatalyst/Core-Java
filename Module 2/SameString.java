package com.company;

/**
 * Created by Arif Zeeshan on 2/28/2017.
 * Given 3 strings as input, return true if any two of the strings are the same.

 Sample Input #1

 areSame("hello","world","hello")
 Sample Output #1

 true
 Sample Input #2

 areSame("123″,"4567″,"89102″)
 Sample Output #2

 false
 */
public class SameString {

    static String testcase1 = "Hello";
    static String testcase2 = "World";
    static String testcase3 = "Hello";

    public static void main(String args[]){
        SameString testInstance= new SameString();
        boolean result = testInstance.isSame(testcase1,testcase2,testcase3);
        System.out.println(result);
    }

    public boolean isSame(String str1,String str2, String str3)
    {
        if (str1.equals(str2) || str1.equals(str3) ||str2.equals(str3))
        {
            return true;
        }
        else
            return false;
    }
}
