package Array_Programs;

// to input 20 numbers and print their sum, product and average of the elements
import java.io.*;
class Arrays
{
   public static void main()throws IOException
   {
       BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
       int i,s=0,p=1,avg;
       int a[]= new int[20];
       System.out.println("Enter 20 integers");
       for(i=0;i<20;i++)
       {
           a[i]=Integer.parseInt(br.readLine());
           s=s+a[i];
           p=p*a[i];
        }
        System.out.println("Sum="+s);
        System.out.println("Product="+p);
        avg=s/i;
        System.out.println("Average="+avg);
    }
}

