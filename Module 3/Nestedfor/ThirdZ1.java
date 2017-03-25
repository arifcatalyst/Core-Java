package com.company.Nestedfor;

/**
 * Created by Arif on 21-12-2016.
 */
public class ThirdZ1 {
    public static void main(String[] args) {
        String str="hzzzjzjghuazubuy";
        int index=IndexOf(str,'z',3);
        System.out.println(index);

    }
    public static int IndexOf(String str, char ch, int n)
    {
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)==ch)
            {
                n--;
                if (n==0)
                {
                    return i;
                }
            }
        }
        return -1;
    }
}
