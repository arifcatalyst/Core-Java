package ExceptionHandling10d;

/**
 * Created by Arif Zeeshan on 3/7/2017.
 */
public class Try {
    public static void main(String[] args) {
        int [] arr=new int[2];
        try {
            int a=0;
            int b=5/a;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        try {
            arr[2]=arr[1]+2;
            System.out.println(arr[2]);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        try {
            int a,b;
            b=0;
            a=5/b;
            System.out.println("A");
        }
        catch (ArithmeticException e)
        {
            System.out.println("B");
        }
        System.out.println("C");
        try {
            String str="abc";
            System.out.println("A");
            char ch=str.charAt(3);
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("Index out of range");
        }
        String[]st=new String [3];
        try
        {
            st[2]="abc";
            String str=st[2];
            System.out.println("A");
            char ch=str.charAt(3);
        }
        catch (Exception e)
        {
            System.out.println("Index out of range");
        }
        try
        {
            //String str="123";
        }
        catch (Exception e)//won't run as no exception found
        {
            System.out.println("Syntax error");
        }
        int sum=0;
        try
        {
            for (int i=-1;i<3;i++)
            {
                sum=(sum/i);
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println("0");
        }
        System.out.println(sum);
        try
        {
            int [] arr1={5,1,2,4};
            int sum1=0;
            for (int i=0;i<=arr1.length;i++)
            {
                sum=sum+arr1[i];
                System.out.println(arr[i]);
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception ocurred");
        }
        try
        {
            String myName="Vishal";
            int len= myName.length();
            char ch=myName.charAt(len);
            System.out.println(ch);

        }
        catch (Exception e)
        {
            System.out.println("Exception ocured in my programme");
        }

    }
}
