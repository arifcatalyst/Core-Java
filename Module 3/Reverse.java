package com.company;

/**
 * Created by Arif on 10-12-2016.
 */
    public class Reverse {
        public static void main(String[] args) {
            int n=5;
            String pattern="";
            for(int i=n;i>=1;i--){
                pattern=pattern+i;
            }
            System.out.println(pattern+n);

        }
    }
