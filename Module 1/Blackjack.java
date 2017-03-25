/**
 * Created by Arif Zeeshan on 2/24/2017.
 * Blackjack

 Problem Statement

 Given 2 int values greater than 0, return whichever value is nearest to 21 without being greater than 21. Return -1 if the values are greater
 than 21. Also return -2 if both the values are same and less or equal to 21.

 Sample Input #1

 blackjack(18,21)
 Sample Output #1

 21
 Sample Input #2

 blackjack(21,16)
 Sample Output #2

 21
 Sample Input #3

 blackjack(22,23)
 Sample Output #3

 -1
 Sample Input #4

 blackjack(12,22)
 Sample Output #4

 12
 Sample Input #5

 blackjack(20,20)
 Sample Output #5

 -2
 */
public class Blackjack {

    public static void main(String args[]){
        Blackjack obj = new Blackjack();
        int result = obj.calcBlackjack(20,20);
        System.out.println("Result : "+result);
    }

    public int calcBlackjack(int num1, int num2)
    {
      int k1=num1-21;
      int k2=num2-21;
      int closest=0;
      if (k1==0)
      {
          closest=num1;
      }
      else if (k2==0)
      {
          closest=num2;
      }
      else if ((num1==num2) && (num1<=21 && num2<=21))
      {
          return -2;
      }
      else if ((k1<k2)&&(num1<=21&&num2<=21))
      {
          closest=num2;
      }
      else if((k2<k1)&&(num1<=21&&num2<=21))
      {
          closest=num1;
      }
      else if (k1<closest&&k2<=21)
      {
          closest=num1;
      }
      else if (k2<closest&&k1<=21)
      {
          closest=num2;
      }
        else if (num1>21 && num2>21)
        {
            return -1;
        }
      return closest;
    }
}