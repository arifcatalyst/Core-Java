package Functions;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Arif Zeeshan on 3/7/2017.
 */
public class Item {
    int price,quanitity;
    String name;;
}
class TestItem
{
    public static Item makeItem(String name1,int price1,int quanity1)
    {
        Item item=new Item();
        item.price=price1;
        item.quanitity=quanity1;
        item.name=name1;
        return item;
    }

    public static void compareTotalCost(Item item1,Item item2)
    {
        if ((item1.quanitity*item1.price)>(item2.quanitity*item1.price))
        {
            System.out.println(item1.name+" costs more");
        }
        else
            System.out.println(item2.name+" costs more");
    }

    public static void main(String[] args) {
        Item item1=makeItem("Apple",20,5);
        System.out.println(item1.quanitity+" : "+item1.name);
        Item it1=makeItem("Apple",20,5);
        Item it2=makeItem("Orange",26,4);
        compareTotalCost(it1,it2);
    }
}
