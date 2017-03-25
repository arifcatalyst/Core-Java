/**
 * Created by Arif Zeeshan on 2/17/2017.
 * LotteryPrize3

 Problem Statement

 Jack bought 3 lottery tickets. He will get a reward based on the number of the lottery ticket. The rules are as follows -
 If the ticket number is divisible by 4, he gets 6 - If the ticket number is divisible by 7, he gets 10 -
 If the ticket number is divisible by both 4 and 7, he gets 20 - Otherwise, he gets 0.
 Given the numbers of the 3 lottery tickets as input, compute the total reward he will receive.
 In this problem define a function to compute the reward given the ticket number and use that function to calculate the total reward.

 Sample Input #1

 lotteryRewardFor3(22,16,21)
 Sample Output #1

 16
 Sample Input #2

 lotteryRewardFor3(56,8,49)
 Sample Output #2

 36
 */
public class LotteryPrize3 {

    public static void main(String args[]){
        LotteryPrize3 obj = new LotteryPrize3();
        int result = obj.lotteryRewardfor3(56,8,49);
        System.out.println(result);
    }

    public int lotteryRewardfor3(int ticketNumber1, int ticketNumber2, int ticketNumber3){
        //write your code here
        int reward=0;
        int count1=0;
        int count2=0;
        int count3=0;
        if ((ticketNumber1%4==0) && (ticketNumber1%7==0))
        {
            reward=reward+20;
            count1++;
        }
        if ((ticketNumber2%4==0) && (ticketNumber2%7==0))
        {
            reward=reward+20;
            count2++;
        }
        if ((ticketNumber3%4==0) && (ticketNumber3%7==0))
        {
            reward=reward+20;
            count3++;
        }
        if (ticketNumber1%7==0)
        {
            if (count1==1)
            {

            }
            else
            {
                reward=reward+10;
            }
        }
        if (ticketNumber2%7==0)
        {
            if (count2==1)
            {

            }
            else
            {
                reward=reward+10;
            }
        }
        if (ticketNumber3%7==0)
        {
            if (count3==1)
            {

            }
            else
            {
                reward=reward+10;
            }
        }
        if (ticketNumber1%4==0)
        {
            if (count1==1)
            {

            }
            else
            {
                reward=reward+6;
            }
        }
        if (ticketNumber2%4==0)
        {
            if (count2==1)
            {

            }
            else
            {
                reward=reward+6;
            }
        }
        if (ticketNumber3%4==0)
        {
            if (count3==1)
            {

            }
            else
            {
                reward=reward+6;
            }
        }

        return reward;
    }
}