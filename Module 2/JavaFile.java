package com.company;

/**
 * Created by Arif Zeeshan on 3/4/2017.
 * JavaFile

 Problem Statement

 A file name in java ends in .java. Given the name of the file, return true if its a java file, else return false.

 Sample Input #1

 isJavaFile("hello.java")
 Sample Output #1

 true
 Sample Input #2

 isJavaFile("java.pdf")
 Sample Output #2

 false
 */
public class JavaFile {

    static String testcase1 = "Trisect.java";

    public static void main(String args[]){
        JavaFile testInstance= new JavaFile();
        boolean result = testInstance.isJavaFile(testcase1);
        System.out.println(result);
    }

    public boolean isJavaFile(String str1)
    {
        for (int i=0;i<str1.length();i++)
        {
            if (str1.charAt(i)=='.' && str1.charAt(i+1)=='j' && str1.charAt(i+2)=='a' && str1.charAt(i+3)=='v' && str1.charAt(i+4)=='a' && i+4==str1.length()-1)
            {
                return true;
            }
        }
        return false;
    }
}
