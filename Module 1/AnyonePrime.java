/**
 * Created by Arif Zeeshan on 2/26/2017.
 * AnyonePrime

 Problem Statement

 Given three numbers as input, return true if at least one of them is a prime number. For solving this problem, define a function that checks
 whether a number is a prime or not and use that function.

 Sample Input #1

 anyonePrime(12,23,45)
 Sample Output #1

 true
 Sample Input #2

 anyonePrime(97,83,71)
 Sample Output #2

 true
 Sample Input #3

 anyonePrime(169,361,121)
 Sample Output #3

 false
 */
public class AnyonePrime {

    public static void main(String args[]){
        AnyonePrime obj = new AnyonePrime();
        boolean result = obj.anyonePrime(101,102,100);
        System.out.println(result);
    }

    public boolean anyonePrime(int num1, int num2, int num3)
    {
        boolean bool=CheckPrime(num1);
        boolean bool1=CheckPrime(num2);
        boolean bool2=CheckPrime(num3);
        if (bool || bool1 || bool2)
        {
            return true;
        }
        else
            return false;
    }
    public boolean CheckPrime(int num)
    {
        if (num > 2 && num % 2 == 0 || num==1)
        {
            return false;
        }
        int top = (int) Math.sqrt(num) + 1;
        for (int i = 3; i < top; i += 2)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

}