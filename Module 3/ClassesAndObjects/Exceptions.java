package com.company.ClassesAndObjects;

/**
 * Created by Arif on 02-01-2017.
 */
public class Exceptions {
    public static void main(String[] args) {
        try
        {
            try
            {
                "a".charAt(1);
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Catch1");
            }

        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("Catch2");
        }

        finally
        {
            System.out.print("Finally 2");
        }
        //System.out.println("Outside");
    }
}
