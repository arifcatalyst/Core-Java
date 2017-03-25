package com.company.ClassesAndObjects;

/**
 * Created by Arif on 28-12-2016.
 */
public class Teach {
}
class Teacher
{
    String name,Subject;

    public static void main(String[] args)
    {
        Teacher t1,t2;
        t1=new Teacher();
        t2=new Teacher();
        t1.name="Rita";
        t1.Subject="Maths";
        t2.name="Nidhi";
        t2.Subject="Java";
        System.out.println(t1.name);
        System.out.println(t1.Subject);
        System.out.println(t2.name);
        System.out.println(t2.Subject);

    }
}
