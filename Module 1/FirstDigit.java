/**
 * Created by Arif Zeeshan on 2/26/2017.
 * FirstDigit

 Problem Statement

 Given a number as input, find the most significant digit in it. You can assume that the number is not negative.

 Sample Input #1

 firstDigit(91238)
 Sample Output #1

 9
 Sample Input #2

 firstDigit(1238)
 Sample Output #2

 1
 Sample Input #3

 firstDigit(238)
 Sample Output #3
 */
public class FirstDigit {

    public static void main(String[] args) {
        FirstDigit obj = new FirstDigit();
        int result = obj.firstDigit(1001);
        System.out.println(result);
    }

    public int firstDigit(int num){
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
        return 0;
    }
}
