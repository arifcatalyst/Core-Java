package this_and_super;

/**
 * Created by Arif Zeeshan on 3/10/2017 at 8:10 PM
 */
public class A {
    int i,j;
    A()
    {
        i=1;
        j=2;
    }
}
class B extends A {
    int a;
    B()
    {
        super();
    }

    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.i+" : "+obj.j);
    }
}
