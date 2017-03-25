/**
 * Created by Arif Zeeshan on 2/27/2017.
 * SuperDivide

 Problem Statement

 A positive int is called super-divide if every digit in the number divides the number. 
 So for example 128 divides itself since 128 is divisible by 1, 2, and 8. Note that no number is divisible by 0. 
 Given a number as input, determine if it is a super-divide.

 Sample Input #1

 superDivide(184)
 Sample Output #1

 true
 Sample Input #2

 superDivide(39)
 Sample Output #2

 false
 Sample Input #3

 superDivide(120)
 Sample Output #3

 false

 */
public class SuperDivide {

    public static void main(String[] args) {
        SuperDivide obj = new SuperDivide();
        boolean result = obj.checkSuper(120);
        System.out.println(result);
    }

    public boolean checkSuper(int num){
        int div = 10;
        int res = 0;
        int length = (int) Math.log10(num) + 1;
        int count=0;
        for (int i = 1; i <= length; i++)
        {
            if (i==1)
            {
                res=num%div;
                if (res!=0 && num%res==0)
                {
                    count++;
                }
            }

            if (i>1)
            {
                res=((num/div)%10);
                div=div*10;
                if (res!=0 && num%res==0)
                {
                    count++;
                }
            }

        }
        if (count==length)
        {
            return true;
        }
        else
            return false;

    }
}