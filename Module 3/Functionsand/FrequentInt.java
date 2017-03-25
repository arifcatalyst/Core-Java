package com.company.Functionsand;

/**
 * Created by Arif on 27-12-2016.
 */
public class FrequentInt {
    public static void main(String[] args) {
        int[]arr={0,0,1,1,-1,-1,5,4,4,1,0};
        int res=getSameint(arr);
        System.out.println(res);
    }
    public static int getSameint(int []arr)
    {
        int total = 0;
        for (int i = 0; i < arr.length; i++)
        {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    count++;
                }
            }
            if (count == 1)
            {
                total++;
            }
        }
        return total;
    }
}
