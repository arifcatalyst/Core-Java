package Interface;

/**
 * Created by Arif Zeeshan on 3/11/2017 at 9:43 PM
 */
interface One
{
    String s="#ZERO#";
    String methodONE();
}
interface Two
{
    String methodTWO();
}
class Three implements One,Two
{
    String str;
    Three()
    {
        str=s+methodONE()+methodTWO();
    }
    public String methodONE()
    {
        return "#ONE#";
    }
    public String methodTWO()
    {
        return "#TWO#";
    }

    public static void main(String[] args) {
        System.out.println(One.s);
        Three obj=new Three();
        System.out.println(obj.str);
    }
}

