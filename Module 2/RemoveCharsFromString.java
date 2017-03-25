package com.company;

/**
 * Created by Arif Zeeshan on 3/4/2017.
 * RemoveCharsFromString

 Problem Statement

 Given two strings, str1 and str2 as input, remove all chars from str1 that appear in str2.
 */
public class RemoveCharsFromString {

    static String testcase1 = "Nightingale";
    static String testcase2 = "Flamingo";

    public static void main(String args[]){
        RemoveCharsFromString testInstance= new RemoveCharsFromString();
        String result = testInstance.remove(testcase1,testcase2);
        System.out.println(result);
    }

    public String remove(String str1, String str2)
    {
        int counter=0;
        String pattern="";
        for (int i=0;i<str1.length();i++)
        {
            char ch2=str1.charAt(i);
            for (int j=0;j<str2.length();j++)
            {
                char ch1=str2.charAt(j);
                if (ch1==ch2)
                {
                    counter++;
                }
            }
            if (counter>=1)
            {

            }
            else
                pattern=pattern+ch2;
            counter=0;
        }
        return pattern;
    }
}