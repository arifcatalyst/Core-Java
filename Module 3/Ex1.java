import java.util.*;

/**
 * Created by Arif on 15-03-2017.
 */
public class Ex1
{

    public static void main(String[] args)
    {
        List<Integer> values=new ArrayList<Integer>();
        values.add(40);
        values.add(38);
        values.add(64);
        values.add(33);
        Collections.sort(values,(o1,o2) ->
        {
            return o1%10>o2%10?1:-1;
        }); 
        values.forEach(System.out::println);

    }

}