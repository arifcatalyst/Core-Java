package com.company;

/**
 * Created by Arif on 27-12-2016.
 */
public class FrequentChar {
    public static void main(String[] args) {
        String str="xyyzzxzdtrffgxy";
        String pattern=FreqChar(str);
        System.out.println(pattern);
    }
    public static String FreqChar(String str)
    {
        String res="";
        for (int i=0;i<str.length()-1;i++)
        {
              char ch1 = str.charAt(i);

              for (int j=i+1;j<str.length();j++)
              {
                  char ch2 = str.charAt(j);
                  if (ch1 == ch2)
                  {
                      res=res+ch1;
                  }
              }

        }
        return res;
    }
}
