/**
 * Created by Arif Zeeshan on 2/25/2017.
 * PerfectNumber

 Problem Statement

 A perfect number is a positive integer that is equal to the sum of its factors. For example, 6 is a perfect number because 6=1+2+3; but 24 is not perfect because 24<1+2+3+4+6+8+12. Given a number n, the objective is find out whether it is a perfect number or not.

 Sample Input #1

 isPerfect(6)
 Sample Output #1

 true
 Sample Input #2

 isPerfect(24)
 Sample Output #2

 false
 */
public class PerfectNumber {

    public static void main(String args[]){
        PerfectNumber obj = new PerfectNumber();
        boolean result = obj.isPerfect(6);
        System.out.println(result);
    }

    public boolean isPerfect(int num)
    {
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==num)
        {
            return true;
        }
        return false;
    }
}