package this_and_super;

/**
 * Created by Arif Zeeshan on 3/10/2017.
 */
public class AC {
    int temp;
    boolean Switch;
    AC(int temp, String Switch)
    {
        System.out.println("Hot");
    }
    AC(int temp)
    {
        this();
        System.out.println("Cold");
    }
    AC()
    {
        System.out.println("Warm");
    }

    public static void main(String[] args) {
        AC control=new AC(23,"On");
    }
}
class Laptop
{
    String type;
    int modelNo;
    Laptop(){}
    Laptop(Laptop l1)
    {
        type="Intel";
        System.out.println(this.type);
    }

    public static void main(String[] args) {
        Laptop lp1=new Laptop();
        lp1.type="AMD";
        Laptop lp2=new Laptop(lp1);
    }
}
class Trisect
{
    int i,j;
    Trisect()
    {
        System.out.println("IN default Constructor");
    }
    Trisect(int i)
    {
        this();
        this.i=i*i;
        System.out.println("In Single parameter constructor");
    }
    Trisect(int i, int j)
    {
        this(i);
        this.j=j*j;
        System.out.println("i : "+i+" : "+j);
    }

    public static void main(String[] args) {
        Trisect center=new Trisect(10,20);
    }
}
