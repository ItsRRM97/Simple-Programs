// To input a number and check if they are in Pseudo AArithmetic Sequence
import java.io.*;
class PseudoArithmetic
{
   public static void main()throws IOException
   {
        BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter the size of the array");
        int l=Integer.parseInt(br.readLine());
        int ar[]=new int[l];
        System.out.println("EEnter array Elements");
        int i; int c=0;
        for(i=0;i<l;i++)
        {
            ar[i]=Integer.parseInt(br.readLine());
        }
        int d=ar[0]+ar[l-1];
        for(i=0;i<l;i++)
        {
            if(d==ar[i]+ar[(l-1)-i])
            {
                c++;
            }
            else
            {
                System.out.println("No they are Not inPseudoArithmetic Sequence");
                break;
            }
        }
        if(c>=l/2)
        {
            System.out.println("Yes, they are in Pseudo Arithmetic Sequence");
        }
    }
}

