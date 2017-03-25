package this_and_super;

/**
 * Created by Arif Zeeshan on 3/10/2017.
 */
public class Person {
    String name;
    int age;
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    Person(String name)
    {
        this.name=name;
        age=-1;
    }
    Person(int age)
    {
        String name="Unknown";
        age=age;
    }

    public static void main(String[] args) {
        Person obj=new Person("Monica", 25);
        System.out.println(obj.name+" : "+obj.age);
        Person guest =new Person("Rohit");
        System.out.println(guest.name+" : "+guest.age);
        Person stranger=new Person(28);
        System.out.println(stranger.name+" : "+stranger.age);
    }
}
