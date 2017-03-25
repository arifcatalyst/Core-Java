/**
 * Created by Arif Zeeshan on 3/16/2017 at 8:03 PM
 */
//import ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Ex5 {
    public static void main(String[] args) 
    {
    	ArrayList<String> arrlist =new ArrayList<>(Arrays.asList("it's","not","just","a","truck","it's","a","truck","truck"));
    	replaceDup(arrlist);
    }

    public static void replaceDup(ArrayList <String> arrlist)
    {
    	HashSet<String> Dup=new HashSet<>();
    	for (int i=0;i<arrlist.size() ;i++ )
    	{
    		if (Dup.contains(arrlist.get(i)))
    		{
    			arrlist.set(i,"Hello");
    		}
    		Dup.add(arrlist.get(i));

    	}
    	System.out.print(arrlist);
    }
}
