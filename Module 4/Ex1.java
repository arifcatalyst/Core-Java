import java.util.HashSet;
import java.util.Set;

/**
 * Created by Arif Zeeshan on 3/13/2017 at 7:04 PM
 */
public class Ex1
{
    public static void uniqueFromTwo(int []arr1, int []arr2)
    {
        HashSet<Integer> mySet=new HashSet<>();
        for (int i=0;i<arr1.length ;i++ ) 
        {
            mySet.add(arr1[i]);    
        }
        for (int i=0;i<arr2.length ;i++ ) 
        {
            mySet.add(arr2[i]);    
        }
        System.out.print(mySet);
    }
    public static void main(String[] args)
    {
        //A union B using Hash Table
        int [] arr={1,2,2,2,4,5};
        int [] arrnew={9,8,7,6};
        uniqueFromTwo(arr,arrnew);
        //End Of Programme.

        /*
        int [] ar={1,2,2,2,4,5};
        int [] arnew={9,8,7,6};
        int len=ar.length+arnew.length;
        int [] arrmerge = new int[len];
        System.arraycopy(ar,0,arrmerge,0,ar.length);
        System.arraycopy(arnew,0,arrmerge,ar.length,arnew.length);
        int count=0;
        for (int i=0;i<arrmerge.length;i++)
        {
            for (int j=i+1;j<arrmerge.length;j++)
            {

                if (arrmerge[i]==arrmerge[j])
                {
                    count++;
                }
            }
            if (count==1
 )           {
                System.out.print(arrmerge[i]);
                System.out.print(" ");
            }
            else if (count==0)
            {
                for (int k = 0; k <i; k++)
                {
                    if (arrmerge[i]==arrmerge[k])
                        count++;
                }
                if (count==0)
                    System.out.print(arrmerge[i]);
                System.out.print(" ");
            }
            count=0;
        }
        */
    }

}