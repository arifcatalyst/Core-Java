package com.company.ClassesAndObjects;


/**
 * Created by Arif on 03-01-2017.
 */
public class Parent {

}
abstract class X
{

    String str="ZERO";
    public X()
    {
        System.out.println("ONE");
    }
    public abstract void method1();
}
class Y extends X
{
  public Y()
  {
      System.out.println("TWO");
  }
  public void method1()
  {
      System.out.println("THREE");
  }
}
class Z extends X
{
   //String str="FIVE";
    public void method1()
    {
        str="FOUR";
    }

    public static void main(String[] args) {
        Z z=new Z();
        z.method1();
        System.out.println(z.str);
        Y y=new Y();
        System.out.println(y.str);

    }
}

