package com.company;

/**
 * Created by Arif Zeeshan on 3/5/2017.
 * ChangeStringCase

 Problem Statement

 Given a string as input, the expected output is a string where the case of all alphabets has been changed.

 Sample Input #1

 changeCase("Hello 123")
 Sample Output #1

 hELLO 123
 Sample Input #2

 changeCase("Good BYE !!")
 Sample Output #2

 gOOD bye !!
 */
public class ChangeStringCase {

    static String testcase1 = "The full form of UN is United Nations";

    public static void main(String args[]){
        ChangeStringCase testInstance= new ChangeStringCase();
        String result = testInstance.changeCase(testcase1);
        System.out.println(result);
    }

    public String changeCase(String sentence)
    {
        String pattern="";
        for (int i=0;i<sentence.length();i++)
        {
            char ch=sentence.charAt(i);
            if (ch==' ')
            {
                pattern=pattern+" ";
            }
            else if (ch>=65 && ch<=90)
            {
                ch=(char)(ch+32);
                pattern=pattern+ch;

            }
            else if (ch>=97 && ch<=122)
            {
                ch=(char)(ch-32);
                pattern=pattern+ch;
            }
            else
            {
                pattern=pattern+ch;
            }


        }
        return pattern;
    }
}
