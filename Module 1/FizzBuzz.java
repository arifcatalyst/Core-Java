/**
 * Created by Arif Zeeshan on 2/25/2017.
 * Module 1

 FizzBuzz

 Problem Statement

 A number is considered fizz if it is divisible by 3. It is considered buzz if it is divisible by 5.
 It is considered fizzbuzz if it is divisible by both 3 and 5.
 A fizzbuzz is neither fizz nor buzz.
 Given two numbers n1 and n2 such that n2>n1, let f be the number of fizz, b be the number of buzz and fb be the number of fizzbuzz
 between n1 and n2(both n1 and n2 are included). Calculate and return the value of 3*f+5*b-15*fb.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzz obj = new FizzBuzz();
        int result = obj.calcFB(10,200);
        System.out.println(result);
    }

    public int calcFB (int n1, int n2)
    {
        int f=0;
        int b=0;
        int fb=0;
        for(int i=n1;i<=n2;i++)
        {
            if(i%3==0 && i%5==0)
            {
                fb++;
            }
            else if(i%3==0)
            {
                f++;
            }
            else if(i%5==0)
            {
                b++;
            }
        }
        return 3*f+5*b-15*fb;
    }
}