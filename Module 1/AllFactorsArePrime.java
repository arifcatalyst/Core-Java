/**
 * Created by Arif Zeeshan on 2/27/2017.
 * AllFactorsArePrime
 *Problem Statement
*
 *Given a number n, return true is all the factors of n are prime numbers. Note that 1 and the number itself are not considered as factors in
 *this problem.
*
 *Sample Input #1
*
* areAllFactorsPrime(22)
 *Sample Output #1
*
 *true (2,11 are prime)
* Sample Input #2
*
 *areAllFactorsPrime(25)
 *Sample Output #2
*
 *true (5 is a prime)
 *Sample Input #3
*
 *areAllFactorsPrime(32)
 *Sample Output #3
*
 *false (4,8,16 are not prime)
 */
public class AllFactorsArePrime {

    public static void main(String[] args) {
        AllFactorsArePrime obj = new AllFactorsArePrime();
        boolean result = obj.areAllFactorsPrime(32);
        System.out.println(result);
    }

    public boolean areAllFactorsPrime(int n) {
        boolean bool=false;
        for (int i=2;i<n;i++)
        {
            if (n%i==0)
            {
                bool=checkPrime(i);
                if (bool==false)
                {
                    bool=false;
                }
                else
                    bool=true;
            }

        }
        if (bool)
        {
            return true;
        }
        else
            return false;
    }
    public boolean checkPrime(int num)
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
