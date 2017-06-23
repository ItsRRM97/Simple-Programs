// WAP to print the GCD (greatest common divisor) of the two number
class GCD
{
   public static void main(int a,int b)
   {
       int dividend=0,divisor=0;
       if(a>b)
       {
           dividend=a;
           divisor=b;
        }
        else
        {
            dividend=b;
            divisor=a;
        }
        int r=0;
        do
        {
            r=dividend%divisor;
            if(r!=0)
            {
                dividend=divisor;
                divisor=r;
            }
            else break;
        }
        while(true);
        System.out.println("GCD of "+a+"and "+b+"is :"+divisor);
    }
}

       
       