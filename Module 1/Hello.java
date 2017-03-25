/**
 * Created by Arif Zeeshan on 2/15/2017.
 * Finding Prime Number with efficiency.
 */
public class Hello
{
    public static void main(String[] args)
    {
        boolean bool=isPrime(100000000000000000L);
    }
    public static boolean isPrime ( long num)
    {
        if (num > 2 && num % 2 == 0 ||num==1)
        {
            System.out.println(num + " is not prime");
            return false;
        }
        int top = (int) Math.sqrt(num) + 1;
        for (int i = 3; i < top; i += 2)
        {
            if (num % i == 0)
            {
                System.out.println(num + " is not prime");
                return false;
            }
        }
        System.out.println(num + " is prime");
        return true;
    }
}
