package com.company.Functionsand;

/**
 * Created by Arif on 21-12-2016.
 */
public class First3Factor {
    public static void main(String[] args) {
        int n=50,count=0;
        for (int i=1;;i++)
        {
            if (n%i==0)
            {
                System.out.println(i);
                count++;
                if (count==3)
                {
                    break;
                }
            }
        }
    }
}
