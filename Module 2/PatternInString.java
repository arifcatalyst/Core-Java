package com.company;

/**
 * Created by Arif Zeeshan on 3/4/2017.
 * PatternInString

 //Problem Statement

 Given two strings str1 and str2 as input, determine whether str2 occurs with str1 or not.

 //Sample Input #1

 occurs("JavaLadders","Java")
 //Sample Output #1

 true
 //Sample Input #2

 occurs("Problem Panel","Panes")
 //Sample Output #2

 false
 */
public class PatternInString {

    static String testcase1 = "No, I am going to Noida";
    static String testcase2 = "goings";

    public static void main(String args[]){
        PatternInString testInstance= new PatternInString();
        boolean result = testInstance.occurs(testcase1,testcase2);
        System.out.println(result);
    }

    public boolean occurs(String str1, String str2)
    {
        String pattern="";
        for (int i=0;i<str2.length();i++)
        {
            char ch=str2.charAt(i);
            for (int j=0;j<str1.length();j++)
            {
                char ch1=str1.charAt(j);
                if (ch==ch1)
                {
                    pattern=pattern+ch;
                    break;
                }
            }
        }
        if (pattern.equals(str2))
            return true;
        else
            return false;
    }
}