package com.company.Nestedfor;

/**
 * Created by Arif on 14-12-2016.
 */
public class SpecialPattern3 {
    public static void main(String[] args) {
        int n=4;
        int resize=2*(n)-1;
        int mid=(int)resize/2;
        int next=mid;
        String pattern="";
        for (int i=1;i<=n;i++){
            for (int j=0;j<resize;j++)
            {
                if (j<mid || j>next)
                {
                    pattern=pattern+"0";
                }
                else
                {
                    pattern=pattern+"*";
                }

            }
            System.out.println(pattern);
            pattern="";
            mid=mid-1;
            next=next+1;
        }

    }
}
