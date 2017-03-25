package com.company.Functionsand;


/**
 * Created by Arif on 21-12-2016.
 */
public class BafterA2 {
    public static void main(String[] args) {
        String str = "bbcab";
        int indexa = str.indexOf('a');
        if (indexa > -1) {
            int indexb = str.indexOf('b', indexa);
            if (indexb > -1) {
                System.out.println(indexa);
            }
        }
    }
}
