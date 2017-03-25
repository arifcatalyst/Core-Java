package com.company.Functionsand;

/**
 * Created by Arif on 13-12-2016.
 */
public class DoubleElement {
    public static void main(String[] args) {
        String []arr={"rat","cat","mat"};
        int len=arr.length;
        for (int i=0;i<len;i++)
        {
            String element=arr[i];
            arr[i]=modify(element);
        }
    }
    public static String modify(String str) {
        int len = str.length();
        String newstr = "";
        for (int i = 0; i < len; i++) {

            newstr = newstr + str.charAt(i) + str.charAt(i);
        }
        System.out.println(newstr);
        return newstr;
    }
}
