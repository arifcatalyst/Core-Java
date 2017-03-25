package ExceptionHandling10d;

/**
 * Created by Arif Zeeshan on 3/7/2017.
 */
public class NestedTry {
    public static void main(String[] args) {
        int [] a=new int [3];
        try
        {
          try
          {
              "a".charAt(1);
          }
          catch (ArrayIndexOutOfBoundsException e)
          {
              System.out.println("Catch 1");
          }
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("Catch 2");
        }
        finally {
            System.out.println("Finally 2");
        }


    }
}
