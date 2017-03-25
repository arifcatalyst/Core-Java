/**
 * Created by Arif Zeeshan on 2/26/2017.
 * SameFirst

 Problem Statement

 Given three numbers as input, return true if the first digit of any two of them is the same.
 The first digit of 2345 is 2, of 981201 is 9. Assume all the numbers are positive integers greater than 0.
 For solving this problem, define a function that computes the first digit if a number and use that function.

 Sample Input #1

 sameFirstDigit(981231,7810009,9)
 Sample Output #1

 true (981231 and 9 have the same first digit, which is 9).
 Sample Input #2

 sameFirstDigit(122341,2231,341)
 Sample Output #2

 false
 */
public class SameFirst {

    public static void main(String args[]){
        SameFirst obj= new SameFirst();
        boolean result = obj.sameFirstDigit(124,325,23);
        System.out.println(result);
    }

    public boolean sameFirstDigit(int num1, int num2, int num3)
    {
        int l1=Check(num1);
        int l2=Check(num2);
        int l3=Check(num3);
        if (l1==l2 || l1==l3 || l2==l3)
        {
            return true;
        }
        else return false;
    }
    int Check(int num)
    {
        int div = 10;
        int res = 0;
        int min=0;
        int length = (int) Math.log10(num) + 1;
        for (int i = 1; i <= length; i++)
        {
            if (i==1)
            {
                res=num%div;
            }

            if (i>1)
            {
                res=((num/div)%10);
                div=div*10;
            }
            if (i==length)
            {
                return res;
            }
        }
        return res;
    }
}
