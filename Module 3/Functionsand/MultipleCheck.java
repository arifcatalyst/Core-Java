package com.company.Functionsand;

/**
 * Created by Arif on 23-12-2016.
 */
public class MultipleCheck
{

    public static void main(String args[])
    {
        MultipleCheck obj = new MultipleCheck();
        boolean result = obj.check(24);
        System.out.println(result);
    }

    public boolean check(int num)
    {
        if ((num%2==0 && num%3==0 && num%5==0) && (num%7!=0 || num%11!=0))
        {
            return true;
        }
        else if((num%2==0 && num%3==0 && num%7==0) && (num%5!=0 || num%11!=0))
        {
            return true;
        }
        else if ((num%2==0 && num%3==0 && num%11==0) && (num%5!=0 || num%7!=0))
        {
            return true;
        }
        else if((num%3==0 && num%5==0 && num%7==0) && (num%2!=0 || num%11!=0))
        {
            return true;
        }
        else if((num%3==0 && num%5==0 && num%11==0) && (num%2!=0 || num%7!=0))
        {
            return true;
        }
        else if((num%5==0 && num%7==0 && num%11==0) && (num%2!=0 || num%3!=0))
        {
            return true;
        }
        else if((num%5==0 && num%7==0 && num%2==0) && (num%11!=0 || num%3!=0))
        {
            return true;
        }
        else if((num%5==0 && num%2==0 && num%11==0) && (num%7!=0 || num%3!=0))
        {
            return true;
        }
        else if((num%3==0 && num%7==0 && num%11==0) && (num%2!=0 || num%5!=0))
        {
            return true;
        }
        else
        {
            return false;
        }

    }


}