package Number_Programs;

class Number_Casw
{
   public static void main(int b)
   {
       int c=0;
       int sum=0;
       int pro=1;
       {
           while ((b%10)>0)
           {
               int l=b%10;
               pro=pro*l;
               sum=sum+l;
               c++;
               b=b/10;
            }
            System.out.println("sum="+sum);
            System.out.println("Product="+pro);
            System.out.println("Number of digits="+c);
        }
    }
}
