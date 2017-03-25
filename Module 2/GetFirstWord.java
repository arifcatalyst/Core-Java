package com.company;

/**
 * Created by Arif Zeeshan on 2/28/2017.
 * GetFirstWord

 Problem Statement

 Given a sentence as an input, return the first word of the sentence. Note that words in a sentence have the char space or ' ' between them.

 Sample Input #1

 firstWord("May I come in?")
 Sample Output #1

 May
 Sample Input #2

 firstWord("Hello")
 Sample Output #2

 Hello
 */
public class GetFirstWord {

    static String testcase1 = "May i sit here?";

    public static void main(String args[]){
        GetFirstWord testInstance= new GetFirstWord();
        String result = testInstance.firstWord(testcase1);
        System.out.println(result);
    }

    public String firstWord(String sentence)
    {
        String pattern="";
        for (int i=0;i<sentence.length();i++)
        {
            if (sentence.charAt(i)==' ')
            {
                break;
            }
            else
            pattern=pattern+sentence.charAt(i);
        }
        return pattern;
    }
}
