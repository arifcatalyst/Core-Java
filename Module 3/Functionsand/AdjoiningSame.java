package com.company.Functionsand;

/**
 * Created by Arif on 25-12-2016.
 */
public class AdjoiningSame {
    public static void main(String[] args) {
        }
        int count=0;
        String [] arr = {"hhelp", "maaid", "0fsf"};
        public boolean getSame(String str)
        {
            for (int i=0;i<str.length()-1;i++)
            {
                char ch1=str.charAt(i);
                char ch2=str.charAt(i+1);
                if (ch1==ch2)
                {
                    return true;
                }
            }
            return false;
        }
        public String [] func(String [] arr)
        {
            for (int i=0;i<arr.length;i++)
            {
                String str=arr[i];
                boolean bool=getSame(str);
                if (bool)
                {
                    count++;
                }
            }
            String []arrnew=new String[count];
            int index=0;
            for (int i=0;i<arr.length;i++)
            {
                String str=arr[i];
                boolean bool=getSame(str);
                if (bool)
                {
                    arrnew[index]=arr[i];
                    index++;
                }
            }
            return arrnew;
        }
}