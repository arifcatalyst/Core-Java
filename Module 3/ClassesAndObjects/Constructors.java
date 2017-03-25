package com.company.ClassesAndObjects;

/**
 * Created by Arif on 31-12-2016.
 */
public class Constructors {
}
class Laptop
{
    String type;
    Laptop(String str)
    {
        System.out.println(str+" Laptop");
        type=str;
    }

    public static void main(String[] args) {
        Laptop Lp1=new Laptop("Dell");
        System.out.println(Lp1.type);
    }
}
