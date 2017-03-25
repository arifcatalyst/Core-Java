package Constructors10C;

/**
 * Created by Arif Zeeshan on 3/7/2017.
 */
public class Person {
    String name;
    int age;

    /**Person()
    {
        System.out.println("Non Parameterized Constructor");
    }
     */
    Person(String name1, int age1)
    {
        name=name1;
        age=age1;
    }

    Person()
    {
        age=18;
    }

    public static void main(String[] args) {
        //Person p=new Person();
        //System.out.println("Name = "+p.name+" age = "+p.age);
        Person p1=new Person("Messi",28);
        Person p2=new Person();
        p2.name="Antonio";
        System.out.println("Name = "+p1.name+" age = "+p1.age);
        System.out.println("Name = "+p2.name+" age = "+p2.age);
        //Person p2=new Person("Max");
        //Person p3=new Person()// compile time error
        //p3.name="Antonio";
        //p3.age=p2.age;
        //System.out.println("Name = "+p3.name+" age = "+p3.age);

    }
}

