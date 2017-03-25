/**
 * Created by Arif Zeeshan on 2/26/2017.
 * LargestDigit

 Problem Statement

 Given a number as input, find the largest digit in it. You can assume that the number is not negative.

 Sample Input #1

 largestDigit(91238)
 Sample Output #1

 9
 Sample Input #2

 largestDigit(237)
 Sample Output #2

 7
 Sample Input #3

 largestDigit(111)
 Sample Output #3

 1
 */
public class LargestDigit {

    public static void main(String[] args) {
        LargestDigit obj = new LargestDigit();
        int result = obj.largestDigit(111);
        System.out.println(result);
    }

    public int largestDigit(int num) {
        int div = 10;
        int res = 0;
        int min=0;
        int length = (int) Math.log10(num) + 1;
        for (int i = 1; i <= length; i++)
        {
            if (i==1)
            {
                res=num%div;
                min=res;
            }

            if (i>1)
            {
                res=((num/div)%10);
                div=div*10;
            }
            if (res>min)
            {
                min=res;
            }
        }

        return min;
    }
}