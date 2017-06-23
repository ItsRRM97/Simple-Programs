import java.io.*;
class Factor
  {
       void HCF()throws IOException
           {
               BufferedReader br=new BufferedReader( new InputStreamReader(System.in));   
               System.out.println("Enter three numbers...one by one...type 1 and press enter n type da second no..den again enter ther third then enter");
               int a=Integer.parseInt(br.readLine());
               int b=Integer.parseInt(br.readLine());
               int c=Integer.parseInt(br.readLine());
               int i;
               int h=0;
               int min=(a<b)?a:b;
               min=(c<min)?c:min;
               for (i=1;i<=min;i++)
               {
                   if((a%i==0)&&(b%i==0)&&(c%i==0))
                   h=i;
                }  
    System.out.println("HCF="+h);
}

void LCM()throws IOException
{
    BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
    System.out.println("Enter three numbers...one by one...type 1 and press enter n type da second no..den again enter ther third then enter");
    int a1=Integer.parseInt(br.readLine());
    int b1=Integer.parseInt(br.readLine());
    int c1=Integer.parseInt(br.readLine());
    int l=0;
    int max=(a1>b1)?a1:b1;
    max=(c1>max)?c1:max;
    int i;
    for(i=max;;i+=max)
    {
        if((i%a1==0)&&(i%b1==0)&&(i%c1==0))
        {
            l=i;
            break;
        }
    }
    System.out.println("LCM="+l);
}

public static void main()throws IOException
  {
      BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
      Factor q=new Factor();
      System.out.println("Enter 1 to print HCF of the numbers");
      System.out.println("Enter 2 to print Lcm of the numbers");
      {
          int ch=Integer.parseInt(br.readLine());
          switch(ch)
          {
              case 1:q.HCF();
              break;
              case 2:q.LCM();
              break;
              default: System.out.println("Wrong choice, rerun da program");
              break;
            }
        }
    }
}   