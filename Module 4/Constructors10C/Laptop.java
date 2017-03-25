package Constructors10C;

/**
 * Created by Arif Zeeshan on 3/7/2017.
 */
public class Laptop {
    String type;
    int price;
    Laptop(String str,int price1)
    {
        /**System.out.println(str);
        type=str;
         */
        //System.out.println(str+" Laptop");
        //type=str;
        System.out.println("Brand Specified");
        type=str;
        price=price1;
    }
    Laptop()
    {
        System.out.println("Default Brand");
    }

    public static void main(String[] args) {
        Laptop lp1=new Laptop();
        System.out.println(lp1.type);
        System.out.println(lp1.price);
        Laptop lp2=new Laptop("HCL",50000);
        System.out.println(lp2.type);
        System.out.println(lp2.price);
    }
}
