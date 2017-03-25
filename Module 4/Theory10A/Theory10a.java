/**
 * Created by Arif Zeeshan on 3/7/2017.
 * Theory-Classes and Objects
 */
package Theory10A;
class Calculate
{
    int a,b,c;
}
class testCalculateA
{
    public static void main(String[] args) {
        Calculate cal=new Calculate();
        cal.a=5;
        cal.b=13;
        int result=cal.a+cal.b;
        System.out.println(result);

        int num=3;
        cal.a=5*num;
        System.out.println(cal.a+"::"+cal.b+"::"+cal.c);


        cal.a=17;
        cal.b=7;
        cal.c=6;
        cal.c=cal.c+cal.a+cal.b;
        System.out.println(cal.a+"::"+cal.b+"::"+cal.c);

    }
}
class Person
{
    int age;
    String name;
}
class testPerson
{
    public static void main(String[] args)
    {
        Person person;
        person=new Person();
        person.age=18;
        System.out.println(person.name);
        System.out.println(person.age);
    }
}
class testPersonB
{
    public static void main(String[] args) {
        Person person1,person2;
        person1=new Person();
        person2=new Person();
        person1.age=18;
        person1.name="Rakesh";
        person2.name="jatin";
        person2.name=person1.name;
        person2.age=person1.age+5;
        System.out.println(person2.name);
        System.out.println(person2.age);
    }
}

class Point
{
    int x;
    int y;
}
class testPointA
{
    public static void main(String[] args) {
        Point p1=new Point();
        p1.x=4;
        p1.y=4;
        Point p2=new Point();
        p2.y=7;
        p2.x=4;
        Point p3=new Point();
        p3.x=p1.y-p2.y;
        p3.y=p1.x+p2.x;
        System.out.println(p3.x);
        System.out.println(p3.y);
    }
}
class testPointB
{
    public static void main(String[] args) {
        Point p1,p2;
        p1=new Point();
        p2=new Point();
        p1.x=4;
        p1.y=7;

        p2.x=p1.x+1;
        p2.y=p1.y+3;

        System.out.println("P1::"+p1.x+","+p1.y);
        System.out.println("P2::"+p2.x+","+p2.y);

        p1.x=p1.x+p2.x;
        p1.y=p1.y-p2.y;
        System.out.println("P1::"+p1.x+","+p1.y);
        System.out.println("P2::"+p2.x+","+p2.y);

    }
}
class Rectangle
{
    int length,breadth;

    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.length=5;
        r1.breadth=6;
        System.out.println(r1.length);
        System.out.println(r1.breadth);
    }
}
class Teacher
{
    String name,subject;

    public static void main(String[] args) {
        Teacher t1,t2;
        t1=new Teacher();
        t2=new Teacher();
        t1.name="Rita";
        t1.subject="Maths";
        t2.name="Adam";
        t2.subject="Science";
        System.out.println(t1.name+"::"+t1.subject+"  "+t2.name+"::"+t2.subject);
    }
}


