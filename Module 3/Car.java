package com.company;

/**
 * Created by Arif on 02-01-2017.
 */
public class Car {
    int speed;
    String model;
    Car(String model1)
    {
        model=model1;
        speed=0;
    }
    public void aceelerate(int x)
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
        else
            speed=speed;
    }
}

    class Test
    {
        public static void main(String[] args) {
            Car car1=new Car("Maruti Swift");
            Car car2=new Car("Mahindra XUV");
            car1.aceelerate(45);
            car2.aceelerate(50);
            car2.brake(25);
            car2.aceelerate(15);
            car1.brake(3);
            Car car3=new Car("Honda Jazz");
            car3.aceelerate(50);
            car3.brake(15);
            System.out.println(car3.currentSpeed());
            car3.aceelerate(60);
            car3.safeSpeed();
            car3.emergencyBrake();
            System.out.println(car3.currentSpeed());
            car3.aceelerate(20);
            car3.safeSpeed();
            car3.emergencyBrake();
            System.out.println(car3.currentSpeed());
        }
    }
