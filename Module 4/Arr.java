/**
 * Created by Arif Zeeshan on 3/11/2017 at 11:44 PM
 */
public class Arr {


    public static void main(String[] args) {
        int[] arr;                   // reference
        arr = new int[10];          // make array
        //int nElems = 0;              // number of items
        //int j;                       // loop counter
        //int searchKey;// key of item to search for

        //-------------------------------------------------------------
        // insert 10 items
        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        for (int i=1;i<arr.length;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while (j>0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                i=i-1;
            }
            arr[j+1]=temp;
            System.out.println(arr[j]);

        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }



        /*
        //nElems = 10;                 // now 10 items in array
        //-------------------------------------------------------------
        searchKey = 77;              // delete item with key 55
        for(j=0; j<nElems; j++)           // look for it
            if(arr[j] == searchKey)
                break;
        for(int k=j; k<nElems; k++)  // move higher ones down
        {
            arr[k] = arr[k + 1];
            nElems--;              // decrement size
        }

        for(j=0; j< nElems; j++)      // display items
            System.out.print( arr[j] + " ");
        System.out.println("");
        */
    }  // end main()
}

