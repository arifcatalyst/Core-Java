package Functions;

/**
 * Created by Arif Zeeshan on 3/7/2017.
 */
public class Vehicle {
    int noOftyres;
    String type;
}
class TestVehicle
{
    public static void fn1()
    {
        Vehicle v=new Vehicle();
        v.noOftyres=2;
        v.type="Bicycle";
        System.out.println(v.noOftyres);
    }
    public static void fn2(String type1)
    {
        Vehicle v=new Vehicle();
        v.noOftyres=4;
        v.type=type1;
        System.out.println("Vehicle :: "+v.type+":"+v.noOftyres);
    }
    public static Vehicle fn3(String type1)
    {
        Vehicle v=new Vehicle();
        v.noOftyres=4;
        v.type=type1;
        return v;
    }

    public static void main(String[] args) {
        fn1();
        fn2("Car");
        fn2("Truck");
        Vehicle v1=fn3("Car");
        Vehicle v2=new Vehicle();
        v2.type="E -Rickshaw";
        v2.noOftyres=3;
        Vehicle v3=fn3("Auto Rickshaw");
        v3.noOftyres=3;
        System.out.println(v1.type+" : "+v1.noOftyres);
        System.out.println(v2.type+" : "+v2.noOftyres);
        System.out.println(v3.type+" : "+v3.noOftyres);
    }
}
