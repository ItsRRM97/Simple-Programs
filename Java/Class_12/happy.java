 
import java.io.*;
class happy
{
int n ; static int s=0; static int sum=0;
happy()
{
n=0;
}
void getnum (int nn)
{
n=nn;
}
int sum_sq_digits (int x )
{
if(x>0) return (x%10)*(x%10)+sum_sq_digits(x/10);
else return 0;
}
void ishappy()
{
int h=0;
h=sum_sq_digits(n);
while(h>9)
{
 h=sum_sq_digits(h);
}
if(h==1)
{
System.out.println( "happy ");
}
else  System.out.println("Not Happy");
}
public static void main ()throws IOException
{
BufferedReader br=new BufferedReader ( new InputStreamReader (System.in) );
System.out.println("enter no.");
int x=Integer.parseInt (br.readLine());
happy ob =new happy();
ob.getnum(x);
ob.ishappy();
}
}
