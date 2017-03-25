/**
 * Created by Arif Zeeshan on 3/13/2017 at 4:26 PM
 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int len=arr.length;
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
        in.close();
    }
}
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */