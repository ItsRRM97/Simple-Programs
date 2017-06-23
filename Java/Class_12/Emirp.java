package Class_12;
import java.util.*; import java.awt.*;
class Emirp
{
   int n,rev,f;
   Emirp(int nn)
   {
       n=nn;
       rev=0;
       f=2;
    }
    int isPrime(int x)
    {
        while(f<x)
        {
            if(x%f!=0) f++;
            else if(x%f==0) return 0;
            else isPrime(f);
        }
        return 1;
    }
    void isEmirp()
    {
        int a=n;
        while(a!=0)
        {
         
          a=a%10;
         rev=(rev*10)+a;
          a=a/10;
        }  
        int t=isPrime(n);
        int s=isPrime(rev);
        if(s==1&&t==1)
        {
            System.out.println("The number is prime and emirp");
        }
        else if(s==1)
        {
            System.out.println("The number "+rev+"is prime but not emirp");
        }
        else if(t==1)
        {
            System.out.println("The number "+n+"is prime but not emirp");
        }
         else
        {
            System.out.println("The numbers arre neither prime nor emirp");
        }
    }

    public static void main(int aa)
    {
        Emirp e=new Emirp(aa);
        e.isEmirp();
    }
}

        
            