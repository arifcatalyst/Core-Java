package Constructors10C;

/**
 * Created by Arif Zeeshan on 3/7/2017
 */
public class Item {
    int quantity,price;
    Item(int quantity1, int price1)
    {
        quantity=quantity1;
        price=price1;
    }
    Item()
    {
        price=10;
        quantity=5;
    }

    public static void main(String[] args) {
        Item it1=new Item();
        Item it2=new Item(20,10);
        System.out.println(it1.price+" "+it1.quantity);
        System.out.println(it2.price+" "+it2.quantity);
    }
}
