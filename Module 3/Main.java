package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int n = 12015;
        if (n % 3 == 0) {
            System.out.println("it is a multiple of 3 or 7");
        } else if (n%7==0){
            System.out.println("it is multiple of 3 or 7");
        }
        else {
            System.out.println("not multiple");
        }
    }
}
