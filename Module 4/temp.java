/**
 * Created by Arif Zeeshan on 3/23/2017 at 7:50 PM
 */
public class temp {
    public static void main(String[] args)
    {
        String [] rev={"Able"," ","was"," ","ere"," ","I"," ","saw"," ","Elba"};
        String arev=reverse(rev);
        for (String aRev : rev) {
            System.out.print(aRev);
        }
    }

    public static String reverse(String [] str)
    {
        String pattern="";
        String pattern2="";
        int j=0;
        for (int i=str.length-1;i>=0;i--)
        {
            pattern2=str[i];
            for (int k=pattern2.length()-1;k>=0;k--,j++)
            {
                pattern=pattern+pattern2.charAt(k);

            }

        }
        return pattern;

    }
}
