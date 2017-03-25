/**
 * Created by Arif Zeeshan on 2/26/2017.
 * Module 1

 CountTheDigit

 Problem Statement

 Given a number n and a digit d as input, find the number of time d occurs in n. You can assume that the number is non-negative.

 Sample Input #1

 findDigitCount(0,0)
 Sample Output #1

 1
 Sample Input #2

 findDigitCount(9,2)
 Sample Output #2

 0
 Sample Input #3

 findDigitCount(2001,0)
 Sample Output #3

 2
 */
public class CountTheDigit {

    public static void main(String[] args) {
        CountTheDigit obj = new CountTheDigit();
        int result = obj.findDigitCount(200001,0);
        System.out.println(result);
    }

    public int findDigitCount (int num, int digit)
    {
        int div = 10;
        int res = 0;
        int count=0;
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
            if (res==digit)
            {
                count++;
            }
        }

        return count;
    }

}