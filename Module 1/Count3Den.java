/**Module 1

 Count3Den

 Problem Statement

 A number is defined as a 3Den if it is a multiple of 3 or has the digit 3 in it. Given a number num as input, count the number of 3Den
 between 1 and num.

 Sample Input #1

 count(15)
 Sample Output #1

 6 (3,6,9,12,13,15)
 Sample Input #2

 count(40)
 Sample Output #2

 21 (3,6,9,12,13,15,18,21,23,24,27,30,31,32,33,34,35,36,37,38,39)
 *
 */
public class Count3Den {

    public static void main(String args[]){
        Count3Den obj = new Count3Den();
        int result = obj.count(15);
        System.out.println(result);
    }

    public int count(int num)
    {
        int counter=0;
        for (int i=3;i<=num;i++)
        {
            boolean bool=Check3Den(i);
            if (bool)
            {
                counter++;
            }
        }
        return counter;
    }
    public boolean Check3Den(int num)
    {
        int div=10;
        int res=0;
        int length = (int) Math.log10(num) + 1;

        if(num%3==0)
        {
            return true;
        }
        else
            {
            for (int i = 1; i <= length; i++)
            {
                if (i == 1) {
                    if (num % div == 3) {
                        return true;
                    }
                } else {
                    res = ((num / div) % 10);

                    if (res == 3) {
                        return true;
                    }
                    div = div * 10;

                }
            }
        }
        return false;
    }
}