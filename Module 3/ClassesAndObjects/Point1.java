package com.company.ClassesAndObjects;

/**
 * Created by Arif on 28-12-2016.
 */
public class Point1 {
}
class Point
{
    int x;
    int y;
    public static void main(String[] args) {
        Point p1=new Point();
        p1.x=4;
        p1.y=7;
        Point p2=new Point();
        p2.y=p1.y+3;
        p2.x=p1.x+1;
        Point p3=new Point();
        p1.x=p1.x+p2.x;
        p1.y=p1.y-p2.y;
        System.out.println("P2::"+p2.x+","+p2.y);


    }
}

