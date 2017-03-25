/**
 * Created by Arif Zeeshan on 3/17/2017 at 3:39 PM
 */
public class SpecialPattern1 {
    public static void main(String[] args) {
        int n=9;
        int mid=0;
        String pattern="";
        int next=0;
        int i,j,k;
        for (i=0;i<=n;i++)
        {
            for (j=n;j>0; j--)
            {
                if (j>next)
                   // pattern=pattern+"";
                    System.out.print("*");
                else if (j>0)
                   // pattern=pattern+j;
                    System.out.print(j);
            }
           // pattern=pattern+0;
           System.out.print("0");
            next++;
                for(k=1;k<=n;k++)
                {
                    if (k>mid)
                    {
                        //pattern=pattern+"";
                        System.out.print("*");
                    }
                    else if(mid>=k)
                        //pattern=pattern+k;
                        System.out.print(k);

                }
                mid++;
            System.out.println();
            pattern="";
        }

    }
}
