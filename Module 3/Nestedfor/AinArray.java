package com.company.Nestedfor;

/**
 * Created by Arif on 21-12-2016.
 */
public class AinArray {
    public static void main(String[] args) {
        String [] arr={"aab","bric","abc"};
        int len=arr.length;
        String str="";
        for (int i=0;i<len;i++)
        {
            str=arr[i];
            int index=str.indexOf('a');
            if (index>-1)
            {
                System.out.println("\"\""+str+"\"\"");
            }
        }
    }
}
