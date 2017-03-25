import java.util.*;

/**
 * Created by Arif Zeeshan on 3/20/2017 at 4:22 PM
 */
public class Super_Multiply {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first Number");
        String a=scan.next();
        System.out.println("Enter second Number");
        String b=scan.next();
        int [] n1=convert(a);
        int [] n2=convert(b);
        ArrayList<String> res =new ArrayList<>();
        ArrayList<String>mres=new ArrayList<>();
        int len1=n1.length;
        int len2=n2.length;
        int i,j=0,count=0,carry=0,rem=0;
        if (len1>len2)
        {

            for (i=len2-1;i>=0;i--,j++)
            {
                if (i<=(len2-2))
                {
                    count++;
                    for (int m=0;m<=count;m++)
                    {
                        res.add(j,mult(n2[i],n1)+"0");
                    }

//                    Add(res,count);


                }
               res.add(j,mult(n2[i],n1));
                count++;
            }
        }
       // mult(n1,5);

    }

//    public static String Add(ArrayList<String> arr,int counter)
//    {
//        int i=0;
//        for (int j=1;j<arr.size();j++)
//        {
//
//        }
//        int [] temp =new int[arr.size()];
//        for(String value: arr)
//        {
//                temp[i] = Integer.parseInt(value);
//                i++;
//        }
//
//
//
//    }




    public static int [] convert(String str)
    {
        int [] temp =new int[str.length()];
        for (int i=0;i<str.length();i++)
        {
            temp[i] =Character.digit(str.charAt(i),10);
        }
        return temp;
    }

    public static String mult(int num,int [] a)
    {
        int k=0,carry=0,rem;
        String res="";
        ArrayList<Integer> arr=new ArrayList<>();
            for (int i=a.length-1;i>=0;i--,k++)
            {
                    int temp=num*a[i]+carry;
                    carry=(temp)/10;
                    rem=(temp)%10;

                    if( carry>0 && i!=0) {
                        arr.add(k,rem);
                        //res=res+rem;
                    }

                    else if(carry>0 && i==0){
                        arr.add(k,temp);
                        //res=res+temp;
                        }
                    else if (carry<0) {
                        arr.add(k, temp);
                        //res = res + temp;
                    }

                        else
                            arr.add(k,rem);
                            //res=res+rem;
            }
        Collections.reverse(arr);
            for (int i=0;i<arr.size();i++)
            {
                res=res+arr.get(i);
            }
        return res;
    }
}




