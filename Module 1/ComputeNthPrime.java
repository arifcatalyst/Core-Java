/**
 * Created by Arif Zeeshan on 2/26/2017.
 * Module 1

 ComputeNthPrime

 Problem Statement

 Given an input n, find out the nth prime

 Sample Input #1

 computePrime(3)
 Sample Output #1

 5
 Sample Input #2

 computePrime(10)
 Sample Output #2

 31
 */
public class ComputeNthPrime {

    public static void main(String args[]){
        ComputeNthPrime obj= new ComputeNthPrime();
        int result = obj.computePrime(5);
        System.out.println(result);
    }

    public int computePrime(int n)
    {
        int candidate, count;
        for(candidate = 2, count = 0; count < n; ++candidate) {
            if (isPrime(candidate)) {
                ++count;
            }
        }
        // The candidate has been incremented once after the count reached n
        return candidate-1;
    }
    private static boolean isPrime(int n)
    {
        for(int i = 2; i < n; ++i)
        {
            if (n % i == 0) {
                // We are naive, but not stupid, if
                // the number has a divisor other
                // than 1 or itself, we return immediately.
                return false;
            }
        }
        return true;
    }

}