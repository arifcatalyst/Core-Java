package com.company.Nestedfor;

/**
 * Created by Arif on 19-12-2016.
 */
public class FirstX {
    public static void main(String[] args) {
        String str1="abc";
        String str2="defx";
        int istr1=str1.indexOf('x');
        int istr2= str2.indexOf('x');
        if (istr1<0 && istr2<0)
        {
            //System.out.println("No x");
        }
        else if (istr1<0 && istr2>=0 || istr2<istr1 && istr2>=0)
        {
            System.out.println(str2);
        }
        else if (istr2<0 && istr1>=0 || istr1<istr2 && istr1>=0)
        {
            System.out.println(str1);
        }



    }
}
