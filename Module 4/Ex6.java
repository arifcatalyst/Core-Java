/**
 * Created by Arif Zeeshan on 3/16/2017 at 9:01 PM
 */
//Common Elements from both the Array. 
//import ;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import javax.lang.model.util.Elements;
public class Ex6 {
    public static void uniqueFromTwo(int []arr1, int [] arr2)
    {
      HashSet<Integer> myset=new HashSet<Integer>();
      for (int i=0;i<arr1.length ;i++ ) 
      {
        myset.add(arr1[i]);	
      }  
      for (int i=0;i<arr2.length ;i++ ) 
      {
      	if (myset.contains(arr2[i])) 
      	{
      		System.out.println(arr2[i]);	
      	}	
      }
    }
    public static void main(String[] args) 
    {
    	int [] arr={2,1,5,3};
    	int [] arrnew={3,4,0,1,10};
    	uniqueFromTwo(arr,arrnew);   
    	ArrayList<Integer> s=new ArrayList<>();
    	 	
    }
}
