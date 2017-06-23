package Functions_Programs;

import java.io.*;
class Student
   {
       int rn;
       int m1;
       int m2;
       String n;
       double avg;
   void set()throws IOException
    {
           
       BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
       System.out.println("Enter your Roll Number");
       rn=Integer.parseInt(br.readLine());
       System.out.println("Enter your Name");
       n=br.readLine();
       System.out.println("Enter your Marks in 1st subject");
       m1=Integer.parseInt(br.readLine());
       System.out.println("Enter your Marks in 2nd subject");
       m2=Integer.parseInt(br.readLine());
    }
    void getavg()throws IOException
    {
       avg=(m1+m2)/2;
    }
    void display()throws IOException
    {
      System.out.println("Roll number="+rn);
      System.out.println("Name="+n);
      System.out.println("Average="+avg);
    }
    public static void main()throws IOException
    { 
        Student s=new Student();
        s.set();
        s.getavg();
        s.display();
    }
}
