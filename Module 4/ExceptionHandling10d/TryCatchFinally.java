package ExceptionHandling10d;

/**
 * Created by Arif Zeeshan on 3/7/2017.
 */
public class TryCatchFinally {
    public static void main(String[] args) {
        /**catch (Exception e) //In this case if catch block is not defined with try and an exception occurs, then it will not
         * be handled.Finally block will run and programme will terminate immediately after that.To handle exception ad resume
         * normal programme flow, it is necesary that try  block is followed by catch.
        {
            System.out.println("Inside Catch");
        }*/
        int [] arr =new int[5];

        try
        {
            arr[6]=25/0;
            arr[2]=3/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divide by Zero not Possible");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array index is not avaialble");
        }

    }
}
