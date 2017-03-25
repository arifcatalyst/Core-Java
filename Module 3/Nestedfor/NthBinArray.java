package com.company.Nestedfor;

/**
 * Created by Arif on 21-12-2016.
 */
public class NthBinArray {
    public static void main(String[] args) {
        String [] arr={"bape", "mbap","reignb","aab","abc","bric","xyzacdb","age","mabaze"};
        int n=2;
        for (int i=0;i<arr.length;i++)
        {
            String str=arr[i];
            int index=str.indexOf('b' , n+1);
            if (index>-1)
            {
                System.out.println(str);
            }

        }
    }
}
