//  predict the output of the folowing
import java.io.*;
class Predict
{
   public static void main()throws IOException
   {
       BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
       int a=65,b=20;
       double x=a%b;
       double y=94/a;
       double z=65.0%20;
       double p=65/20.0;
       System.out.println(x+","+y+","+z+","+p);
       int a1,b1; a=24; b=33;
       int c=a<<2; int d=b>>1;
       int e=a&b,f=c|d,g=b^c;
       System.out.println("c="+c+" d="+d+" e="+e+" f="+f+" g="+g);
       
        }
        
    }


       