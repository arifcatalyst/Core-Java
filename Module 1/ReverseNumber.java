/**
 * Created by Arif Zeeshan on 2/28/2017.
 * ReverseNumber

 Problem Statement

 Given a number as input, reverse it. You can assume that the number is not negative.

 Sample Input #1

 reverse(123)
 Sample Output #1

 321
 Sample Input #2

 reverse(14)
 Sample Output #2

 41
 Sample Input #3

 reverse(5089)
 Sample Output #3

 9805
 */
public class ReverseNumber {

    public static void main(String[] args) {
        ReverseNumber obj = new ReverseNumber();
        int result = obj.reverse(2199);
        System.out.println(result);
        int res=obj.reverse(result);
        System.out.println(res);

    }

    public int reverse(int num){
        int reverse = 0;
        while(num != 0){
            reverse = (reverse*10)+(num%10);
            num = num/10;
        }
        return reverse;
    }
}
