package Array_Programs;

// WAP to enter numbers and delete a  number between them at position given by user
import java.io.*;
class Delete
{
   public static void main(int I[])throws IOException
   {   
       BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
       int n=I.length;
       System.out.println("Enter the number you want to insert");
       int a=Integer.parseInt(br.readLine());
       System.out.println("Enter the position of the number you want to replace");
       int pos=Integer.parseInt(br.readLine());
       int id=pos-1;
       int i;
       for(i=n;i<id;i--)
       {
           I[i]=I[i-1];
        }
        I[id]=a;
        System.out.println("The new array is");
        for(i=0;i<n;i++)
        {
            System.out.println(I[i]);
        }
    }
}