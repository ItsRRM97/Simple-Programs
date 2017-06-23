package Number_Programs;

class HCF
{
   public static void main()
   {
       int a=20; int b=236; int c=24;
       int i; int HCF=0;
       for(i=124;i>=1;i--)
       {
           if(a%i==0&&b%i==0&&c%i==0)
           {
               HCF=i;
               break;
            }
        }
        System.out.println("HCF="+HCF);
    }
}