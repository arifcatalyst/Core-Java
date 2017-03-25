/**
 * Created by Arif Zeeshan on 2/28/2017.
 * CountCharInString

 Problem Statement

 Given a string and a char as input, output the number of times, the char appears in the string.

 Sample Input #1

 count("Hello World",'l')
 Sample Output #1

 3
 Sample Input #2

 count("Animal",'N')
 Sample Output #2

 0
 */
public class CountCharInString {

    static String testcase1 = "An elephant is on the street";
    static char testcase2 = 'e';

    public static void main(String args[]){
        CountCharInString testInstance= new CountCharInString();
        int result = testInstance.count(testcase1,testcase2);
        System.out.println(result);
    }

    public int count(String word, char ch)
    {
        int counter=0;
        for (int i=0;i<word.length();i++)
        {
            if (word.charAt(i)==ch)
                counter++;
        }
        return counter;
    }
}
