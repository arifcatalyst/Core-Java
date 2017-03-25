/**
 * Created by Arif Zeeshan on 3/7/2017.
 */
class TwoDPoint
{
    int x,y;
}
class TestTwoDPoint
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