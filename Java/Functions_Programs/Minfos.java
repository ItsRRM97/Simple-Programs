package Functions_Programs;

import java.io.*;
class Minfos
{
   double s; double da;
   double t; double hra;
   double gp; double mdt;
   String n;
   double ai;
   void Input()throws IOException
   {
       BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
       System.out.println(" Enter the employees name");
       n=br.readLine();
       System.out.println("Enter your Basic Salary of Month");
       s=Integer.parseInt(br.readLine());
       ai=s*12;
    }
    void Compute()
    {
        if(s<=15000)
        da=(s*20)/100;
        hra=(10*s)/100;
        gp=s+hra+da;
        if((s>15000)&&(s<=25000))
        da=(s*25)/100;
        hra=(12*s)/100;
        gp=s+hra+da;
        if(s>25000)
        da=(s*30)/100;
        hra=(15*s)/100;
        gp=s+hra+da;
        
    }
    void Tax()
    {
       if(ai<200000)
       t=0;
       mdt=0;
       if((ai>200000)&&(ai<300000))
       t=(10*s)/100;
       mdt=t/12;
       if((ai>300000)&&(ai<500000))
       t=((20*s)/100)+30000;
       mdt=t/12;
       if(ai>500000)
       t=((30*s)/100)+130000;
       mdt=t/12;
    }
    void Display()
    {
       System.out.println("Name of the employee is "+n);
       System.out.println("Gross Pay is "+gp);
       System.out.println("Monthly Tax Deduction= "+mdt);
       System.out.println("Net Salary= "+(gp-mdt));
       
    }
    public static void main()throws IOException
    {
        int i;
        for(i=1;i<=50;i++)
        {
            Minfos m= new Minfos();
            m.Input();
            m.Compute();
            m.Tax();
            m.Display();
        }
    }
}

    

       