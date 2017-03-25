package com.company;

/**
 * Created by Arif on 10-12-2016.
 */
public class AlternateSum {
    public static void main(String[] args) {
        int totalsum=0,n=5;
        String pattern="";
        for (int i=1;i<=n;i++){
            if(i%2==0){
                totalsum=totalsum+i;
                pattern=pattern+"+"+i;
            }
            else{
                totalsum=totalsum-i;
                pattern=pattern+"-"+i;
            }

        }
        System.out.println(pattern+"="+totalsum);

    }
}
