package Number_Programs;

// to find da ticket charge according to age.
import java.io.*;
class Ticketcharge
      {
          void Ticketprice()throws IOException
          { 
          BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
          double charge=1;
          System.out.println("Enter your Age");
          int age=Integer.parseInt(br.readLine());
          System.out.println("Enter actual ticket price");
          int tk=Integer.parseInt(br.readLine());
          {
          if (age<=5)
          {
          System.out.println("No Charge");
        }
          if ((age>5)&&(age<=15))
          {
          charge=tk/4;
        }
          if ((age>15)&&(age<=30))
          {
          charge=tk/2;
        }
          if ((age>30)&&(age<=60))
          {
              charge=tk;
            }
          if (age>60)
          {
          charge=tk/3;
        }
       }
       System.out.println("Charge for you is ="+ charge);
    }

public static void main()throws IOException
    {
        Ticketcharge b1=new Ticketcharge();
        b1.Ticketprice();
    }
}
