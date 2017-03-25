import java.util.Scanner;

/**
 * Created by Arif on 07-02-2017.
 */
public class Solt {
    public static void main(String[] args)
    {
     int i=4;
     double d=4.0;
     String s="HackerRank";
     Scanner scan =new Scanner(System.in);
        int i2;/* Declare second integer, double, and String variables. */
        double d1;
        String s1;
                   /* Read and save an integer, double, and String to your variables.*/
        i2=scan.nextInt();
        d1=scan.nextDouble();
        s1=scan.next();
         /* Print the sum of both integer variables on a new line. */
        System.out.println(i+i2);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d+d1);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        //System.out.println(s+s2);
        scan.close();
        //int totalcost=(int) Math.round();


    }
}
