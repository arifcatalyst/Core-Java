package com.company.ClassesAndObjects;

/**
 * Created by Arif on 03-01-2017.
 */
public class TwoDpoint {
    int x;
    int y;
    TwoDpoint(int x1,int y1)
    {
        x=x1;
        y=y1;
    }
}
class PointUser
{
    public TwoDpoint nearestX(TwoDpoint pt1,TwoDpoint pt2)
    {
        if (pt1.x<pt2.x)
            return pt1;
        else
            return pt2;
    }
    public int areaRectangle(TwoDpoint pt1,TwoDpoint pt2)
    {
        return (pt2.x-pt1.x)*(pt2.y-pt1.y);
    }
}
class test1
{
    public static void main(String[] args) {
        TwoDpoint p1=new TwoDpoint(5,3);
        TwoDpoint p2=new TwoDpoint(2,9);
        PointUser obj=new PointUser();
        TwoDpoint p3=obj.nearestX(p1,p2);
        System.out.println("TwoDPoint :: "+p3.x + ":"+p3.y);
    }
}
