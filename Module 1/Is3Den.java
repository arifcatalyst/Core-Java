/**
 * Created by Arif Zeeshan on 2/25/2017.
 * Is3Den

 Problem Statement

 A number is defined as a 3den if it is a multiple of 3 or has the digit 3 in it. Given a number as input, determine whether it is a 3den or not.

 Sample Input #1

 is3den(12)
 Sample Output #1

 true
 Sample Input #2

 is3den(13)
 Sample Output #2

 true
 Sample Input #3

 is3den(14)
 Sample Output #3

 false
 */
public class Is3Den {

    public static void main(String args[]){
        Is3Den obj = new Is3Den();
        boolean result = obj.is3den(1245670);
        System.out.println(result);
    }

    public boolean is3den(int num)
    {
        int div=10;
        int res=0;
        int counter=0;
        int length = (int) Math.log10(num) + 1;

        if(num%3==0)
        {
            return true;
        }

            for(int i=1;i<=length;i++)
            {
                if(i==1)
                {
                    if(num%div==3)
                    {
                        return true;
                    }
                }
                else
                {
                    res=((num/div)%10);

                    if(res==3)
                    {
                        return true;
                    }
                    div=div*10;

                }
            }
        return false;


    }

}