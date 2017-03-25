package com.company.Functionsand;

/**
 * Created by Arif on 22-12-2016.
 */
public class SmallestPrime {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        for (int i = n+1;; i++)
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
                System.out.println("Smallest Prime Number after "+n+" is "+i);
                break;
            }

            count=0;
        }
    }
}


