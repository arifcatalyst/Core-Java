package com.company.Nestedfor;

/**
 * Created by Arif on 21-12-2016.
 */
public class ThirdZ {
    public static void main(String[] args) {
        String str="xyzzazcdb";
        int len=str.length();
        int index=0;
        int count=0;
        for (int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if (ch=='z')
            {
                index=str.indexOf('z' , index);

                    count++;
                    if (count==3)
                    {
                        System.out.println(index);
                        len=0;
                    }
                    index++;

            }

        }


    }
}
