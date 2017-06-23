//  a program to input name and roll number..choice and print roll no, if name is entered and vice versa
import java.io.*;
class Funkrray
{
    public static void main(int n)throws IOException 
        {
            int i=0;int p=0;
            String q;int r=0;
            int a[]=new int[n];int ch=0; 
            String x[]=new String[n];
            BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
            System.out.println("Enter Roll Number First and then name");
            for(i=0;i<n;i++)
           {
               a[i]=Integer.parseInt(br.readLine());
               x[i]=br.readLine();
           }
           System.out.println("Enter choce.... '1' for roll number and '2' for name");
           ch=Integer.parseInt(br.readLine());
           switch(ch)
             {
                case 1:
                {
                System.out.println("Enter Roll number");
                r=Integer.parseInt(br.readLine());
                for(i=0;i<n;i++)
                {
                    if(a[i]==r)
                    {
                        System.out.println("Found");
                        System.out.println("Name is "+x[i]);
                    }
                }
            }
            break;
            case 2:
            {
                System.out.println("Enter name");
                q=br.readLine();
                for(i=0;i<n;i++)
                {
                    if(x[i]==q)
                    {
                        System.out.println("Found");
                        System.out.println("The Roll Number is "+a[i]);
                    }
                }
            }
            break;
        }
    }
} 

