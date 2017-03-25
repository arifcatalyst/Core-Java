/**
 * Created by Arif Zeeshan on 2/26/2017.
 * SumRounded

 Problem Statement

 Round a number to the next multiple of 10 if its ones digit is 5 or more, otherwise round it the previous multiple of 10.So, 25 and 26 round to 30 where as 23 and 24 round to 20. 20 also rounds to 20. You have been given 4 ints as input. Round each of the input values and return their sum.

 Sample Input #1

 sumRounded(11,15,23,30)
 Sample Output #1

 80 (11 rounds to 10, 15 to 20, 23 to 20 and 30 to 30)
 Sample Input #2

 sumRounded(1,3,7,9)
 Sample Output #2

 20
 */
public class SumRounded {

    public static void main(String args[]){
        SumRounded obj = new SumRounded();
        int result = obj.sumRounded(24,25,26,23);
        System.out.println(result);
    }

    public int sumRounded(int num1, int num2, int num3, int num4)
    {
        int []arr={num1,num2,num3,num4};
        int len=arr.length;
        int sum=0;
        for (int i=0;i<len;i++)
        {
            if (arr[i]%10>=5)
            {
                sum=sum+((arr[i]/10)+1)*10;
            }
            else
            {
                sum=sum+(arr[i]/10)*10;
            }
        }
        return sum;
    }
}