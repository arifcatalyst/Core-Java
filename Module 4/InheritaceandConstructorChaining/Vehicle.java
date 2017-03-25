package InheritaceandConstructorChaining;

import java.io.Console;

/**
 * Created by Arif Zeeshan on 3/9/2017.
 */
class Vehicle
{
    String type,color;
    int tyres;
    public static void myMEthod(float a,int b){
    }
    public static void myMethos(int a, float b){}

}
class Car extends Vehicle
{
    String brand,fuel;
    Car (String b,String f,String c,int t)
    {
        brand=b;
        fuel=f;
        color=c;
        tyres=t;
    }

    public static void main(String[] args) {
        Car c1=new Car("Hyundi","Petrol","Red",4);
        System.out.println(c1.brand+c1.tyres+c1.fuel+c1.color);
        Vehicle.myMEthod(2,5);
        Vehicle.myMethos(3,5);
    }
}
class ABC{
    public void disp()
    {
        System.out.println("disp() method of parent class");
    }
    public void abc()
    {
        System.out.println("abc() method of parent class");
    }
}
class Test extends ABC{
    public void disp(){
        System.out.println("disp() method of Child class");
    }
    public void xyz(){
        System.out.println("xyz() method of Child class");
    }
    public static void main( String args[]) {
        //Parent class reference to child class object
        ABC obj=new Test();
        ABC obj1=new Test1();
        ABC obj2=new Test2();
        obj.disp();
        obj.abc();
        obj1.disp();
        obj2.disp();


    }
}

class Test1 extends ABC
{
    public void disp()
    {
        System.out.println("disp() method of Test1 class");
    }
}
class Test2 extends ABC
{
    public void disp()
    {
        System.out.println("disp() of Test2 class");
    }
    
}