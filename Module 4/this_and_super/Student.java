package this_and_super;

import InheritaceandConstructorChaining.Parent;

/**
 * Created by Arif Zeeshan on 3/10/2017.
 */
public class Student {
    int rollNo;
    Student(int rollNo)
    {
        this.rollNo=30;
        System.out.println(rollNo);
    }

    public static void main(String[] args) {
        Student st=new Student(5);
        System.out.println(st.rollNo);

    }
}

class JBT {

    public static void main(String[] args) {
        JBT obj = new JBT();
        obj.methodThree();
    }
    void methodOne(){
        System.out.println("Inside Method ONE");
    }

    void methodTwo(){
        System.out.println("Inside Method TWO");
        this.methodOne();// same as calling methodOne()
    }
    void methodThree(){
        System.out.println("Inside Method THREE");
        this.methodTwo();
    }
}
class JBTThisAsParameter {

    public static void main(String[] args) {
        JBT1 obj = new JBT1();
        JBT1 obj1=new JBT1();
        obj.i = 10;
        obj.method();
    }

}

class JBT1 extends JBTThisAsParameter {
    int i;

    void method() {
        method1(this);
    }

    void method1(JBT1 t) {
        System.out.println(t.i);
    }
}

class Parentclass
{
    int num;
    Parentclass()
    {
        System.out.println("Constructor of Parent Class");
    }
    Parentclass(int num)
    {
        this.num=num;
        System.out.println("Constructor of Parent class with arg");
    }

}
class Subclass extends Parentclass
{
    Subclass(){
        super(5);
        System.out.println("Constructor of Subclass");

    }

    public static void main(String args[]){
        Subclass obj= new Subclass();
        System.out.println(obj.num);

    }
}

