package com.company;

/**
 * Created by Arif on 08-12-2016.
 */
public class StringDouble2 {
    public static void main(String[] args)
    {
        String []arr={"coding","is","fun"};
        int len=arr.length;
        String str2="";
        int index=0;
        int count=0;
        for(int i=0;i<len;i++){
            String str=arr[i];
            int len1=str.length();
            if(len1>2){
                count++;
            }
        }
        String[]arrnew=new String[count];
        for(int i=0;i<len;i++) {
            str2 = arr[i];
            int len2 = str2.length();
            if (len2 > 2) {
                arrnew[index] = arr[i];
                index++;
            }
        }
        int len3=arrnew.length;
        for(int i=0;i<len3;i++){
            System.out.println(arrnew[i]);
        }
    }
}
