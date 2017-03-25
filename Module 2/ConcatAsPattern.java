package com.company;

/**
 * Created by Arif Zeeshan on 2/28/2017.
 *ConcatAsPattern

 Problem Statement

 Given 2 strings str1 and str2 as input, return a string of the form (str1)str2(/str1)
 */
public class ConcatAsPattern {

    static String testcase1 = "site";
    static String testcase2 = "google";

    public static void main(String args[]){
        ConcatAsPattern testInstance= new ConcatAsPattern();
        String result = testInstance.makePattern(testcase1,testcase2);
        System.out.println(result);
    }

    public String makePattern(String str1, String str2)
    {
        String pattern="("+str1+")"+str2+"(/"+str1+")";

        return pattern;
    }
}
