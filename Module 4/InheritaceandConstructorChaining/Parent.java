package InheritaceandConstructorChaining;

/**
 * Created by Arif Zeeshan on 3/9/2017.
 */
public class Parent {
    public void method1()
    {
        System.out.println("Parent :: method1");
    }

    public void method2()
    {
        System.out.println("Parent :: method2");
    }


    public void method2(String str)
    {
        System.out.println("Parent :: Overloadeded method2");
    }
}
class Child extends Parent
{
    @Override
    public void method1()
    {
        System.out.println("Child  :: Overriden method1");
    }

    public void method1(int x)
    {
        System.out.println("Child  :: Overloaded method1");
    }

    @Override
    public void method2()
    {
        System.out.println("Child  :: Overridden method2");
    }

    @Override
    public void method2(String str)
    {
        System.out.println("Child  :: Overridden method2");
    }

    public void method2(String str, int x)
    {
        System.out.println("Child  :: Overloaded method2");
    }

    public static void main(String[] args) {
        Parent obj1=new Parent();
        obj1.method1();
        obj1.method1();
        obj1.method2("Hello");
        Child obj2=new Child();
        obj2.method1();
        obj2.method2("World");
        obj2.method2("Ends", 10);
        obj2.method2();
    }
}
