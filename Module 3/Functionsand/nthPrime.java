package com.company.Functionsand;

/**
 * Created by Arif on 22-12-2016.
 */
public class nthPrime {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;
        int nthprime = 0;
        for (int i = 1;; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if (i % j == 0)
                {
                   count++;
                }

            }
            if (count == 2)
            {
                nthprime++;
            }
            if (nthprime==n)
            {
                System.out.println("Nth Prime Number: "+i);
                break;
            }
            count=0;
        }
    }
}
