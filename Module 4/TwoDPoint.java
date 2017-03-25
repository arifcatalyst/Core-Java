/**
 * Created by Arif Zeeshan on 3/7/2017.
 * TwoDPoint

 Problem Statement

 Create a class TwoDPoint that contains two fields x, y which are of type int. Define another class TestTwoDPoint,
 where a main method is defined.
 The main method should create two TwoDPoint objects, assign them values 2,2 and 3,3 and print them.
 */
package trisect.twoDPoint;
//Write your code here
class TwoDPoint
{
    int x;
    int y;
}
class TestTwoDPoint
{
    public static void main(String[] args)
    {
        TwoDPoint t1,t2;
        t1=new TwoDPoint();
        t2=new TwoDPoint();
        t1.x=2;
        t1.y=2;
        t2.x=3;
        t2.y=3;
        System.out.println(t1.x);
        System.out.println(t1.y);
        System.out.println(t2.x);
        System.out.println(t2.y);

    }
}

/**
 * TwoDPoint2

 Problem Statement

 Adding to the previous problem, modify the class TestTwoDPoint and add a function create( int x , int y) to it.
 This function takes two ints as input and returns a TwoDPoint.
 */
class TestTwoDPoint2
{
    public static TwoDPoint create(int x,int y)
    {
        TwoDPoint t1;
        t1=new TwoDPoint();
        t1.x=x;
        t1.y=y;
        return t1;
    }
    public static void main(String[] args)
    {
        create(4,6);
    }
}

/**
 * TwoDPoint3

 Problem Statement

 Adding to the previous problem, modify the class TestTwoDPoint and add another function farthest( TwoDPoint t1, TwoDPoint t2 ) to it.
 This function takes two TwoDPoints as input and returns the TwoDPoint that is farthest from the point (0,0).
 */
class TestTwoDPoint3
{
    public static TwoDPoint create(int x,int y)
    {
        TwoDPoint t1;
        t1=new TwoDPoint();
        t1.x=x;
        t1.y=y;
        return t1;
    }
    public static TwoDPoint farthest(TwoDPoint t1, TwoDPoint t2)
    {
        if (t1.x>t2.x && t1.y>t2.y){
            return t1;
        }
        else
            return t2;
    }

    public static void main(String[] args) {
        TwoDPoint t1=new TwoDPoint();
        t1.x=4;
        t1.y=5;
        TwoDPoint t2=new TwoDPoint();
        t2.x=0;
        t2.y=0;
        farthest(t1,t2);

    }
}

/**
 *TwoDPoint4

 Problem Statement

 Adding to the previous problem, modify the class TestTwoDPoint and add another function sum( TwoDPoint t1, TwoDPoint t2) to it.
 This function takes two TwoDPoints as input and returns a new TwoDPoint whose x value is the sum of x values of the input
 TwoDPoint's and whose y value is the sum of the y valaues of the input TwoDPoint's
 */
class TestTwoDPoint4
{
    public static TwoDPoint create(int x,int y)
    {
        TwoDPoint t1;
        t1=new TwoDPoint();
        t1.x=x;
        t1.y=y;
        return t1;
    }
    public static TwoDPoint farthest(TwoDPoint t1, TwoDPoint t2)
    {
        if (t1.x>t2.x && t1.y>t2.y){
            return t1;
        }
        else
            return t2;
    }
    public static TwoDPoint sum(TwoDPoint t1,TwoDPoint t2)
    {
        TwoDPoint t=new TwoDPoint();
        t.x=t1.x+t2.x;
        t.y=t1.x+t2.y;
        return t;
    }

    public static void main(String[] args) {
        TwoDPoint t1=new TwoDPoint();
        t1.x=4;
        t1.y=5;
        TwoDPoint t2=new TwoDPoint();
        t2.x=0;
        t2.y=0;
        sum(t1,t2);
    }
}