package String_Programs;

// to input name and sex and display them in different list..
import java.io.*;
class Boygirl
{
       public static void main()throws IOException
       {
            BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
            System.out.println("Enter the number of students");
            int n=Integer.parseInt(br.readLine());
            String name[]= new String[n]; 
            char gender[]= new char[n];
            int i;
            System.out.println("Enter your name 1st then Begin with names of the Student");
            for(i=0;i<n;i++)// Some runtime error occouring..1st its accepting 1 string then not acceptint any string
            {
                System.out.println("Name of the Student");
                String names=br.readLine();name[i]=br.readLine();
                System.out.println("Enter Sex either B or G");
                gender[i]=(char)br.read();
            }
            System.out.println("List of BOYS");
            for(i=0;i<n;i++)
            {
                if(gender[i]=='B')
                {
                    System.out.println(name[i]);
                }
            }
            System.out.println("List of GIRLS");
            for(i=0;i<n;i++)
            {
                 if(gender[i]=='G')
                 System.out.println(name[i]);
                }
            }
        }


            
            
       