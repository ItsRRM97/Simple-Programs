package ICSE_Projects;


import java.io.*;
class Banking
{
      static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String name[]=new String[1000];
      String address[]=new String[1000];
      double bal[]=new double[1000];
      double acn[]=new double[1000];
      String teleno[]=new String[1000];
      int i=0;
      int j=0;
      void cna()throws IOException
      {
          System.out.println("Thank you for choosing our Bank for opening an account");
          System.out.println("Enter your name");
          name[i]=br.readLine();
          System.out.println();
          System.out.println("Enter your address");
          address[i]=br.readLine();
          System.out.println();
          System.out.println("Enter your contact Number(MOBILE or LANDLINE)");
          teleno[i]=br.readLine();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println("***********************************************\n\tEnter The Account you want to create\n************************************************\n\t**********************");
          System.out.println("1.Savings Account");
          System.out.println("2.Current Deposit Account");
          System.out.println("3.Fixed Deposit Account");
          System.out.println("4.Reccurring Deposit Account");
          System.out.println("Enter Your Choice by typing the Corresponding number");
          int ch =Integer.parseInt(br.readLine());
          System.out.println("*********************\n**********************\n********************");
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          switch(ch)
          {
                case 1:
                {
                    System.out.println("*************************");
                    System.out.println("Conditions:");
                    System.out.println("*************************");
                    System.out.println("The Rate provided is 4%p.a Compounded Annually");
                    System.out.println("Minimum Amount to be deposited for Savings is Rs 1000/-");
                    System.out.println();
                    System.out.println("Press Y/N for Yes or No");
                    char c=(char)br.read();
                    if(c=='Y'||c=='y')
                    {
                        
                        try{
                            System.out.println("Enter the money to be deposited");
                            int n=Integer.parseInt(br.readLine());
                        }catch(NumberFormatException e){}
                        double n1=Double.parseDouble(br.readLine());
                            if(n1<1000)
                            {
                                System.out.println("Not Accepted");
                            }
                            else
                            {
                             bal[i]=n1;
                             System.out.println("*********************\n**********************\n********************");
                             System.out.println("ACCOUNT DETAILS");
                             System.out.println(name[i]);
                             System.out.println("Your current balance is="+bal[i]);
                             System.out.println("Your account no is  "+(i+1));
                             System.out.println("Your Contact no="+teleno[i]);
                             System.out.println("\n\n\n");
                             acn[i]=i+1;
                             
                             i++;
                             System.out.println();
                             System.out.println();
                             System.out.println();
                             System.out.println("Thank you for choosing our Bank for opening an account\n\n\n"); 
                            }
                        }
                        
                    else if(c=='n'||c=='N')
                     {
                            System.out.println("Sorry for the Inconvenience\n\n");
                            
                      }
                      break;
                       
                
            
                    }
               
                        
                case 2:
                          {
                    System.out.println("*************************");
                    System.out.println("Conditions:");
                    System.out.println("*************************");
                    System.out.println("No rate is provided by the bank");
                    System.out.println("Minimum Amount to be deposited for current deposit is Rs 5000/-");
                    System.out.println("Press Y/N for Yes or No");
                    char c=(char)br.read();
                    if(c=='Y'||c=='y')
                    {
                        
                        try{
                            System.out.println("\n\nEnter the money to be deposited");
                            int n=Integer.parseInt(br.readLine());
                        }catch(NumberFormatException e){}
                        double n1=Double.parseDouble(br.readLine());
                            if(n1<5000)
                            {
                                System.out.println("\n\nNot Accepted");
                            }
                            else
                            {
                             bal[i]=n1;
                             System.out.println("*********************\n**********************\n********************");
                             System.out.println("ACCOUNT DETAILS");
                             System.out.println("Name- "+name[i]);
                             System.out.println("Your current balance is="+bal[i]);
                             System.out.println("Your account no is  "+(i+1));
                             System.out.println("Your Contact no="+teleno[i]);
                             acn[i]=i+1;
                             
                             i++;
                             System.out.println();
                             System.out.println();
                             System.out.println();
                             System.out.println("\n\nThank you for choosing our Bank for opening an account\n\n\n"); 
                            }
                        }
                        
                    else if(c=='n'||c=='N')
                     {
                            System.out.println("\n\nSorry for the Inconvenience\n\n");
                            
                      }
                      break;
                       
                
            
                    }
               
                case 3:
                              {
                     System.out.println("*************************");
                    System.out.println("Conditions:");
                    System.out.println("*************************");
                   System.out.println("the interest rate allowed is 8% for 3 months and above");
                   System.out.println("the interest rate allowed is 8.5% for 1 year and above");
                    System.out.println("the interest rate allowed is 9% for 3 years and above");
                    System.out.println("Minimum Amount to be deposited for fixed deposit is Rs 1000/-");
                    System.out.println("Press Y/N for Yes or No");
                    char c=(char)br.read();
                    if(c=='Y'||c=='y')
                    {
                        
                        try{
                            System.out.println("Enter the money to be deposited");
                            int n=Integer.parseInt(br.readLine());
                        }catch(NumberFormatException e){}
                        double n1=Double.parseDouble(br.readLine());
                            if(n1<1000)
                            {
                                System.out.println("\n\nNot Accepted\n\n");
                            }
                            else
                            {
                             bal[i]=n1;
                             System.out.println("*********************\n**********************\n********************");
                             System.out.println("ACCOUNT DETAILS");
                             System.out.println(name[i]);
                             System.out.println("Your current balance is="+bal[i]);
                             System.out.println("Your account no is  "+(i+1));
                             System.out.println("Your Contact no="+teleno[i]);
                             acn[i]=i+1;
                             
                             i++;
                             System.out.println();
                             System.out.println();
                             System.out.println();
                             System.out.println("\n\nThank you for choosing our Bank for opening an account\n\n"); 
                            }
                        }
                        
                    else if(c=='n'||c=='N')
                     {
                            System.out.println("\n\nSorry for the Inconvenience\n\n");
                            
                      }
                      break;
                       
                
            
                    }
               
                case 4:
                          {
                    System.out.println("*************************");
                    System.out.println("Conditions:");
                    System.out.println("*************************");
                    System.out.println("Minimum period of deposit is 1 year");
                    System.out.println("The Rate provided is 7.5%p.a");
                    System.out.println("The amount is to be paid in monthly installments");
                    System.out.println("Withdrawal is permitted only upon maturity");
                    System.out.println("Press Y/N for Yes or No");
                    char c=(char)br.read();
                    if(c=='Y'||c=='y')
                    {
                        
                        try{
                            System.out.println("\nEnter the money to be deposited");
                            int n=Integer.parseInt(br.readLine());
                        }catch(NumberFormatException e){}
                        double n1=Double.parseDouble(br.readLine());
                             bal[i]=n1;
                             System.out.println("*********************\n**********************\n********************");
                             System.out.println("ACCOUNT DETAILS");
                             System.out.println(name[i]);
                             System.out.println("Your current balance is="+bal[i]);
                             System.out.println("Your account no is  "+(i+1));
                             System.out.println("Your Contact no="+teleno[i]);
                             acn[i]=i+1;
                            
                             i++;
                             System.out.println();
                             System.out.println();
                             System.out.println();
                             System.out.println("\n\nThank you for choosing our Bank for opening an account\n\n");  
                            
                        }
                        
                    else if(c=='n'||c=='N')
                     {
                            System.out.println("\n\nSorry for the Inconvenience\n\n");
                            
                      }
                      break;
                       
                
            
                    }
               
                default:
                {
                    System.out.println("Wrong choice\n\n");
                    break;
                }
            }
        }
        void deposit()throws IOException
        {
            String nm,chk;
            int n,dp,cr;
           
            do
            {
                System.out.println();
                 System.out.println("Enter your name");
                 nm=br.readLine();
                 System.out.println();
                System.out.println("Enter Your Account Number");
                n=Integer.parseInt(br.readLine());
                System.out.println();
                for(j=0;j<i;j++)
                {
                    if(nm.equalsIgnoreCase(name[j])&&acn[j]==n)
                    {
                        System.out.println("Enter the Amount To be Deposited");
                        dp=Integer.parseInt(br.readLine());
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println("Your Balance Was="+bal[j]);
                        bal[j]=bal[j]+dp;
                        System.out.println("Current BALANCE is="+bal[j]);
                        break;
                    }
                    else
                    {
                        break;
                            }
                }
                if(j==i||j<i-1)
                {
                    System.out.println();
                              System.out.println(); 
                              System.out.println(); 
                              System.out.println(); 
                        System.out.println("Invalid account number or name!!!!!\nEither you have not created an account in this name\n or\nThe name or account number you have entered is not valid.\n\n\n ");
                              System.out.println(); 
                              System.out.println("Please create an account if you have not created it");
                }
                System.out.println("Enter 'Cont' to deposit\n       or\nEnter 'Exit' to exit");
                chk=br.readLine();
            }while(chk.equalsIgnoreCase("cont"));
        }
       void withdrawl()throws IOException
        {
            
            String chk=" ";
            int n,w,cr,b;
            do
            {
                System.out.println();
                System.out.println("Enter your name");
                String nm=br.readLine();
                System.out.println();
                System.out.println("Enter your Account No");
                n=Integer.parseInt(br.readLine());
                System.out.println();
                for(j=0;j<i;j++)
                {
                    if(nm.equalsIgnoreCase(name[j])&&acn[j]==n)
                    {
                        
                        System.out.println("***********************************************\n\tPlease select the type of BANK account you chose\n************************************************\n\t**********************");
                        System.out.println("1.Savings Account");
                        System.out.println("2.Current Deposit Account");
                        System.out.println("3.Fixed Deposit Account");
                        System.out.println("4.Reccurring Deposit Account");
                        System.out.println("Enter Your Choice by typing the Corresponding number");
                        int ch =Integer.parseInt(br.readLine());
                        System.out.println("*********************\n**********************\n********************");
                        switch(ch)
                        {
                            case 1:
                            {
                                System.out.println("Enter the Amount to be Withdrawn");
                                w=Integer.parseInt(br.readLine());
                                if(w<bal[j]-1000)
                                {
                                   System.out.println("Your Balance Was="+bal[j]);
                                   bal[j]=bal[j]-w;
                                   System.out.println("Current Balance is="+bal[j]);
                                   
                                 }
                               else
                               {
                                   System.out.println("Insufficient Balance");
                               }
                            }
                            break;
                            case 2:
                            {
                                System.out.println("Enter the Amount to be Withdrawn");
                                w=Integer.parseInt(br.readLine());
                                if(w<bal[j]-5000)
                                {
                                   System.out.println("Your Balance Was="+bal[j]);
                                   bal[j]=bal[j]-w;
                                   System.out.println("Current Balance is="+bal[j]);
                                   
                                 }
                               else
                               {
                                   System.out.println("Insufficient Balance");
                               }
                            }
                            break;
                            case 3:
                            {
                                System.out.println("Enter the Amount to be Withdrawn");
                                w=Integer.parseInt(br.readLine());
                                if(w<bal[j]-1000)
                                {
                                   System.out.println("Your Balance Was="+bal[j]);
                                   bal[j]=bal[j]-w;
                                   System.out.println("Current Balance is="+bal[j]);
                                   
                                 }
                               else
                               {
                                   System.out.println("Insufficient Balance");
                               }
                            }
                            break;
                            case 4:
                            {
                                System.out.println("Enter the Amount to be Withdrawn");
                                w=Integer.parseInt(br.readLine());
                                   System.out.println("Your Balance Was="+bal[j]);
                                   bal[j]=bal[j]-w;
                                   System.out.println("Current Balance is="+bal[j]);
                                 
                                 
                            }
                            break;
                            default:
                            {
                               System.out.println("the number you have typed is not valid"); 
                            }
                        }
                        break;
                    }
                    
                }
                if(j==i||j<i-1)
                {
                    System.out.println();
                              System.out.println(); 
                              System.out.println(); 
                              System.out.println(); 
                        System.out.println("Invalid account number or name!!!!!\nEither you have not created an account in this name\n                   or\nThe name or account number you have entered is not valid. ");
                              System.out.println(); 
                              System.out.println("Please create an account if you have not created it");
                }
            
  
                    System.out.println("Enter 'cont' to withdraw\n       or\nEnter 'Exit' to exit");
                    chk=br.readLine();
                
            }while(chk.equalsIgnoreCase("cont"));
        }
               void check()throws IOException
                {
                    System.out.println("Enter your name");
                    String nm=br.readLine();
                    String chk;
                    int n,w,cr;
                    do
                    {
                        System.out.println("Enter your Account Number");
                        n=Integer.parseInt(br.readLine());
                        for(j=0;j<i;j++)
                        {
                            if(nm.equalsIgnoreCase(name[j])&&acn[j]==n)
                            {
                                System.out.println("Your Current Balance is="+bal[j]);                             
                                break;
                            }
                            else
                            {
                            break;
                            } 
                        }
                        if(j==i||j<i-1)
                {
                    System.out.println();
                              System.out.println(); 
                              System.out.println(); 
                              System.out.println(); 
                        System.out.println("Invalid account number or name!!!!!\nEither you have not created an account in this name\n                   or\nThe name or account number you have entered is not valid. ");
                              System.out.println(); 
                              System.out.println("Please create an account if you have not created it");
                }
                        System.out.println("Enter 'cont' to check again\n\tor press Exit");
                        chk=br.readLine();
                    }while(chk.equalsIgnoreCase("cont"));
                }
            
                public static void main()throws IOException
                {
                   System.out.println("________________________________________________");
            System.out.println("\n\n");
            System.out.println("******************************************************\n            WELCOME\n\t      TO\nTHE ADARSH n KARTHIK CO-OPERATIVE BANK\t\n*************************************************");
            //String a=br.readLine();
                    //String b=br.readLine();
                    Banking kk=new Banking();
                    String aa,chk,chk1;
                    do
                    {
                        
                        System.out.println("\t************************\n\tTAKE A LOOK ON THE MENU\n\t************************");
                        System.out.println("1.Create new Account");
                        System.out.println("2.Deposit Money");
                        System.out.println("3.Withdraw Money");
                        System.out.println("4.Check balance");
                        System.out.println("5.Exit");
                        System.out.println("Enter Your Choice by typing the Corresponding number");
                        int n=Integer.parseInt(br.readLine());
                        if(n==1)
                        {
                            kk.cna();                           
                     
                        }
                        else if(n==2)
                        {
                            kk.deposit();
                            
                        }
                        else if(n==3)
                        {
                            kk.withdrawl();
                            
                        }
                        else if(n==4)
                        {
                            kk.check();
                            
                        }
                        else
                        {
                            aa="Exit";
                        }
                        System.out.println("\t************************\n\t\n\t************************");
                        //String c=br.readLine();
                        System.out.println("Enter 'cont' to Continue");
                        System.out.println("\tIf you are completely satisfied and want to continue further\n\t take a look at main menu otherwise press 'no' ");   
                        //chk=br.readLine();
                        chk1=br.readLine();
                        
                    }while(chk1.equalsIgnoreCase("cont"));
                   
                    
                    
            }
            
 }
