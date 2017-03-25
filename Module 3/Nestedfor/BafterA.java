package com.company.Nestedfor;

/**
 * Created by Arif on 20-12-2016.
 */
public class BafterA {
    public static void main(String[] args) {
        String str="bcab";
        int indexa=str.indexOf('a');
        if (indexa>-1)
        {
            int indexb=str.indexOf('b' , indexa);
            if (indexb>-1)
            {
                System.out.println("Yes");
            }
        }
    }
}
