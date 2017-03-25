package Methods;

/**
 * Created by Arif Zeeshan on 3/8/2017.
 */
public class TwoDPoint
    {
        int x;
        int y;

            TwoDPoint(int x1, int y1)
            {
                x = x1;
                y = y1;
            }
    }
    class PointUser
    {
        public TwoDPoint nearestX(TwoDPoint pt1,TwoDPoint pt2)
        {
            if (pt1.x<pt2.x)
            {
                return pt1;
            }
            else
                return pt2;
        }
        public int areaRectangle(TwoDPoint pt1,TwoDPoint pt2)
            {
                return (pt2.x-pt1.x)*(pt2.y-pt1.y);
            }
        public TwoDPoint midPoint(TwoDPoint p1,TwoDPoint p2)
            {
                int p1mid=(p1.x+p2.x)/2;
                int p2mid=(p1.y+p2.y)/2;
                TwoDPoint midP=new TwoDPoint(p1mid,p2mid);
                return midP;
            }
        public void displayQuadrant(TwoDPoint p1)
        {
            if (p1.x>0 && p1.y>0)
            {
                System.out.println("Qudrant I");
            }
            else if (p1.x<0 && p1.y>0)
            {
                System.out.println("Quadrant II");
            }
            else if (p1.x<0 && p1.y<0)
            {
                System.out.println("Quadrant III");
            }
            else
                System.out.println("Quadrant IV");
        }
        public static void main(String[] args) {
            TwoDPoint p1=new TwoDPoint(2,-3);
            TwoDPoint p2=new TwoDPoint(4,9);
            PointUser obj=new PointUser();
            int area=obj.areaRectangle(p1,p2);
            System.out.println(area);
            PointUser obj1=new PointUser();
            TwoDPoint p3=obj1.midPoint(p1,p2);
            System.out.println(p3+"  "+obj1);
            System.out.println(p3.x+" : "+p3.y);
            obj.displayQuadrant(p1);
        }

    }
    class PointTwo
    {
        int x,y;
        PointTwo(int x1,int y1)
        {
            x=x1;
            y=y1;
        }
        public void dragPoint(PointTwo p)
        {
            this.x=this.x+p.x;
            this.y=this.y+p.y;
        }
    }
    class PointTwotest
    {
        public static void main(String[] args) {
            PointTwo p1=new PointTwo(3,7);
            PointTwo p2=new PointTwo(1,2);
            PointTwo p3=new PointTwo(8,5);
            p2.dragPoint(p1);
            p1.dragPoint(p3);
            System.out.println("PointTwo :: "+p1.x+" : "+p1.y);
            System.out.println("PointTwo :: "+p2.x+" : "+p2.y);
            System.out.println("PointTwo :: "+p3.x+" : "+p3.y);
        }
    }
