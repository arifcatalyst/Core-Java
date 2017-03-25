/**
 * Created by Arif Zeeshan on 2/28/2017.
 * JoinChars

 Problem Statement

 Given two strings s1 and s2 of equal length as input, the expected output is a string which the 1st char from s1,
 then 1st char from s2, then 2nd char from s1, then 2nd char from s2 and so on.

 Sample Input #1

 join("1357","2468")
 Sample Output #1

 12345678
 Sample Input #2

 join("Outer","Space")
 Sample Output #2

 OSuptaecre
 */
public class JoinChars {

    static String testcase1 = "Hello";
    static String testcase2 = "World";

    public static void main(String args[]){
        JoinChars testInstance= new JoinChars();
        String result = testInstance.join(testcase1,testcase2);
        System.out.println(result);
    }

    public String join(String str1, String str2)
    {
        String pattern="";
        for (int i=0;i<str1.length();i++)
        {

                pattern=pattern+str1.charAt(i);
                pattern=pattern+str2.charAt(i);
        }
        return pattern;
    }
}