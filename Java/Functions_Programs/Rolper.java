package Array_Programs;

// WAP to input roll numbers as well as their percentage and dispay when the user enters the roll number
import java.io.*;
class Rolper
{
  public static void main(int a[],int p[])throws IOException
  {
     BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
     System.out.println("Enter the roll number u want to search");
     int f=Integer.parseInt(br.readLine());
     int ub=4,lb=0,mid=0;
     int pos=-1;
     while ((lb<=ub)&&(pos==-1))
        {
            mid=(lb+ub)/2;
            if(f==a[mid])
            {
                pos=mid+1;
            }
            else if(f>a[mid])
            {
                lb=mid+1;
            }
            else
            {
                ub=mid-1;
            }
        }
    
    System.out.println(f+" Scored,");
    System.out.println(p[mid]+"%");

   }
}
