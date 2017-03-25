package Abstract_Class;

import Functions.Vehicle;

/**
 * Created by Arif Zeeshan on 3/10/2017 at 9:22 PM
 */
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
    public void method1()
    {
        str="FOUR";
    }

    public static void main(String[] args) {
        Z z=new Z();
        z.method1();
        System.out.println(z.str);
    }
}
class Bubble
{
    int num[]={2,3,4,5};
    public static void main(String[] args) {
        int num[]={99,-10,100123,18,-978,5623,463,-9,287,49};
        int a,b,t;
        int size;
        size=10;
        //This is Bubble Sort
        for (a=1;a<size;a++)
        {
            for (b=size-1;b>=a;b--)
            {
                if (num[b-1]>num[b])//if outof order
                {
                    //exchange elements
                    t=num[b-1];
                    num[b-1]=num[b];
                    num[b]=t;
                }
            }
        }
        //display sorted array
        for (int i=0;i<size;i++)
        {
            System.out.println("Sorted Array "+num[i]);
        }
        String org="Java";
        String substr=org.substring(0,1);
        System.out.println(org);
    }
    public interface vehicle {
        default void print(){
            System.out.println("I am a vehicle!");
        }
        void method5();
    }

    public interface fourWheeler {
        default void print(){
            System.out.println("I am a four wheeler!");
        }
    }


}
class car implements Bubble.vehicle
{
    public void method5()
    {

    }
    public static void main(String[] args) {
        car ABS=new car();
    }
    enum Transport
    {

    }
}

