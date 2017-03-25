/**
 * Created by Arif Zeeshan on 2/25/2017.
 * SumOfDigitsWithCount

 Problem Statement

 Given 2 inputs, a number n and the number of digits it has d , find the sum of its digits.

 Sample Input #1

 sumOfDigits(123,3)
 Sample Output #1

 6 (1+2+3=6)
 Sample Input #2

 sumOfDigits(50809,5)
 Sample Output #2

 22 (5+0+8+0+9=22)
 */
public class SumOfDigitsWithCount {

    public static void main(String args[]){
        SumOfDigitsWithCount obj = new SumOfDigitsWithCount();
        int result = obj.sumDigits(963237526, 9);
        System.out.println(result);
        int fg=1245670/10;
        System.out.println(fg);
    }

    public int sumDigits(int num,int count)
    {
        int div=10;
        int sum=0;
        for(int i=1;i<=count;i++)
        {
            if(i==1)
            {
                sum=sum+(num%div);
            }
            else
            {
                sum=sum+((num/div)%10);
                div=div*10;
            }
        }
        return sum;

    }
}