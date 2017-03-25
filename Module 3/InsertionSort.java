/**
 * Created by Arif on 21-01-2017.
 */
public class InsertionSort
{
    public static void main(String[] args)
    {
        int [] arr={2,3,5,7,9,11,13,6};
        insert(6,6,arr);
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
    public static void insert(int LastIndex, int targetValue, int[] array)
    {
        int i=LastIndex;
       while ((i>-1)&&(array[i]>targetValue))
       {
           array[i+1]=array[i];
           i--;
       }
       array[i+1]=targetValue;
    }
}
