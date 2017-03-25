package Methods;

/**
 * Created by Arif Zeeshan on 3/7/2017.
 */
public class Car
{
    int speed;
    String model;
    Car(String model1)
    {
        model=model1;
        speed=0;
    }
    public void accelerate(int x)
    {
        speed=speed+x;
    }
    public void brake(int x)
    {
        speed=speed-x;
    }
    public int currentSpeed()
    {
        return speed;
    }
    public void safeSpeed()
    {
        if (currentSpeed()>100)
            System.out.println("Unsafe");
        else
            System.out.println("Safe");
    }
    public void emergencyBrake()
    {
        if (currentSpeed()>100)
            speed=0;
    }

    public static void main(String[] args) {
        /**Car car1=new Car("Maruti WagonR");
        Car car2=new Car("Mahindra XUV");
        car1.accelerate(45);
        car2.accelerate(50);
        car2.brake(25);
        car2.accelerate(15);
        car1.brake(3);
        //int currentSpeed=car1.currentSpeed();
        if (car1.currentSpeed()>car2.currentSpeed())
        {
            System.out.println(car1.model+" is winning.");
        }
        else
            System.out.println(car2.model+" is winning");
         */
        Car car1=new Car("Honda Jazz");
        car1.accelerate(50);
        car1.brake(15);
        System.out.println(car1.currentSpeed());
        car1.accelerate(50);
        car1.safeSpeed();
        car1.emergencyBrake();
        car1.accelerate(20);
        car1.safeSpeed();
        car1.emergencyBrake();
        System.out.println(car1.currentSpeed());
    }
}
