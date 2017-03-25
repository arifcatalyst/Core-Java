package com.company.ClassesAndObjects;

/**
 * Created by Arif on 08-01-2017.
 */
public class Inter_faces {
}
interface A
{
    String a="aaa";
    String methodA();
}
interface B
{
    String b="bbb";
    String methodB();
}
class C implements A
{
    public String methodA()
    {
        return "c"+a;
    }
}
class D implements B
{
    public String methodB()
    {
        return b + "d";
    }

    public static void main(String[] args) {
        C c=new C();
        D d=new D();
        String str1=A.a+c.methodA();
        String str2=d.methodB()+B.b;
        System.out.println(str1);
        System.out.println(str2);

    }
}