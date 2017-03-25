package StaticandFinalVariables;

import java.io.Console;

/**
 * Created by Arif Zeeshan on 3/8/2017.
 */
public class Test {
    static int x;

    void increment() {
        x = x + 1;
    }

    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();
        System.out.println(Test.x);
        t1.increment();
        t2.increment();
        System.out.println(t1.x);
        System.out.println(t2.x);
    }
}

class A
{
    public int x;
    static int y;
    void cal(int a,int b)
    {
        x=x+a;
        y=y+b;
    }

    public static void main(String[] args) {
        A obj1=new A();
        A obj2=new A();
        obj1.x=0;
        obj1.y=0;
        obj1.cal(1,2);
        obj2.x=0;
        obj2.cal(2,3);
        System.out.println(obj1.x);
        System.out.println(obj2.y);
    }
}

class test5
{
    final static int i=5;
    static int x=15;

    public static void main(String[] args) {
        test5.x=35;
        System.out.println(test5.x);
        System.out.println(test5.i);
    }
}
