//to find da average of marks, name, marks , overall average of the class, name,...etc.
import java.io.*;
class Marks
   {
       void marks()throws IOException
       {
           String s;
           int i;
           for (i=1;i<=50;i++)
           { 
               
               double avg;
               double ovr=0;
               {
                   {
               double m1,m2,m3;
               BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
               System.out.println("Enter the name of 50 students");
               s=br.readLine();
               System.out.println("Enter the marks of three subjects");
               m1=Double.parseDouble(br.readLine());
               m2=Double.parseDouble(br.readLine());
               m3=Double.parseDouble(br.readLine());
               System.out.println("Name is "+ s);
               System.out.println("Marks are "+m1+","+m2+","+m3);
               avg=(m1+m2+m3)/3;
               System.out.println("Average="+avg);
            }
               
               ovr=ovr+avg;
            }
               double avrg=ovr/50;
               if (avg>avrg)
               System.out.println("The students scored above average are");
               System.out.println(s);
               System.out.println("Overall average of the class="+avrg);
            }
        }
    

    
public static void main()throws IOException
        {
            
            Marks a=new Marks();
            a.marks();    
        }
    }


               