package Array_Programs;

// WAP to enter numbers and insert a tenth number as 0 and the number you wanna between them at position given by user.
import java.io.*;
class Insert
{
   public static void main(int I[])throws IOException
   {   
       BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
       System.out.println("Enter the number you want to insert");
       int a=Integer.parseInt(br.readLine());
       System.out.println("Enter the position of the number");
       int pos=Integer.parseInt(br.readLine());
       int id=pos-1;
       int i;
       for(i=I.length-1;i>id;i--)
       {
          I[i]=I[i-1];
        }
        I[id]=a;
        System.out.println("The new array is");
        for(i=0;i<I.length;i++)
        {
            System.out.println(I[i]);
        }
    }
}

        
       
       
       