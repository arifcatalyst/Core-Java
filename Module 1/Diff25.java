/**
 * Created by Arif Zeeshan on 2/25/2017.
 * Module 1

 Diff25

 Problem Statement

 Given three ints as input , return true if one of them is 25 or more less than one of the other numbers.

 Sample Input #1

 diff25(1, 13, 40)
 Sample Output #1

 true
 Sample Input #2

 diff25(13, 1, 25)
 Sample Output #2

 false
 Sample Input #3

 diff25(40, 60, 2)
 Sample Output #3

 true
 */
public class Diff25 {

    public static void main(String args[]){
        Diff25 obj = new Diff25();
        boolean result = obj.diff25(40, 60, 2);
        System.out.println(result);
    }

    public boolean diff25(int a, int b,int c)
    {
        if ((a-b>=25)||(a-c>=25)||(b-a>=25)||(b-c>=25)||(c-a>=25)||(c-a>=25))
        {
            return true;
        }
        else
            return false;
    }

}