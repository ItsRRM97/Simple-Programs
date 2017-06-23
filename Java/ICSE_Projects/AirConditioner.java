package ICSE_Projects;

import java.io.*;
class AirConditioner implements Runnable
     {
         BufferedReader nn=new BufferedReader(new InputStreamReader(System.in));
         Thread t;
         Thread t1;
         String sa;
         String sa1;
         static int c;
         static int ti;
         static int j=0;
         static int at=26;
         static double rt;
         AirConditioner(double n)
         {
              t=new Thread(this);
              t.start();
         }
         AirConditioner()
         {}
         public void run() 
         {
            try
            {
                if (rt>at)
                {
                    Heater();
                }
                else
                { 
                    Ac();
                }
            }
            catch(IOException s)
            {}
         }
         void Ac()throws IOException
         {
             try
             {
                for (int y=26;y>=rt;y--)
                {
                    j++;
                    System.out.println("Now the car temperature is "+y+" degree celsius");
                    Thread.sleep(c);
                    if(ti==j)
                        break;
                 }
                System.out.println("Now the compressor is off and the fan is on");
            }
             catch(InterruptedException e)
            {}
          }
         void Heater()throws IOException
         {
             try
             {
                for (int y=26;y<=rt;y++)
                {
                    j++;
                    System.out.println("Now the car temperature is "+y+" degree celsius");
                    Thread.sleep(c);
                    if(ti==j)
                        break;
                }
                System.out.println("Now the compressor is off and the fan is on");
             }
             catch(InterruptedException e)
            {}
          }
         void display()/*display() method*/
         {
             System.out.println("Thank You for Watching the Proceedings of our CAR'S INTEGRATED AIR TEMPERARTURE CONTROL SYSTEM hope you have enjoyed it.");/*thanking the viewers*/
             System.out.println("Now watch the Credits that follow.");/*displaying Credits*/
             try/*try block*/
             {
                 for( ; ; )/*for loop*/
                 {      
                     System.out.println("We would like to thank the following people for their help in the successful completion of our Project:-");
                     Thread.sleep(2000);/*invoking sleep()*/
                     System.out.println("Haribabu Sir-Our Computer Teacher for his Guidance.");
                     Thread.sleep(2000);/*invoking sleep()*/
                     System.out.println("Some of our friends for their help.");
                     Thread.sleep(2000);/*invoking sleep()*/
                     System.out.println("Our Team Members who did this Project-Shreyash Mishra and C.A. Anand");
                     Thread.sleep(2000);/*invoking sleep()*/
                     System.out.println("*******************************************************************THE END*******************************************************************");
                     System.out.println("                                               * * * * *  *   *  * * * *    * * * *  * *   *  * * *    ");/*printing The End*/
                     Thread.sleep(1000);
                     System.out.println("                                                   *      * * *  * *        * *      *  *  *  *    *   ");
                     Thread.sleep(1000);
                     System.out.println("                                                   *      *   *  * * * *    * * * *  *   * *  * * *    ");
                     break;/*breaking the for loop*/
                 }/*end of for loop*/
             }/*end of try*/
        catch(InterruptedException e)/*sleep() method throws InterruptedException*/
        {}/*end of catch()*/
    }/*end of display()*/
         public static void main()throws IOException
          {
             BufferedReader nn=new BufferedReader(new InputStreamReader(System.in));
             AirConditioner kk=new AirConditioner();
             int ch;
             String answer;          
             System.out.println("___________________>>>>>>>  PRESS 1 TO SWITCH ON THE AC  <<<<<<<____________________");
             System.out.println("___________________>>>>>>>  PRESS 2 TO SWITCH OFF THE AC <<<<<<<____________________");
             ch=Integer.parseInt(nn.readLine());
             switch(ch)
             {
               case 1:
               try
               {
                System.out.println("               *         *  * * * *    *         * * * *   * * * *   *      *   * * * *                     ");/*printing Welcome*/
                Thread.sleep(1000);
                System.out.println("                *   *   *   *          *         *         *     *   * *  * *   *                           ");                                
                Thread.sleep(1000);
                System.out.println("                 * * * *    * * *      *         *         *     *   *  **  *   * * *                       ");
                Thread.sleep(1000);
                System.out.println("                  *   *     * * * *    * * * *   * * * *   * * * *   *      *   * * * *                     ");
                Thread.sleep(1000);
               }
               catch(InterruptedException e)
               {}
                System.out.println("----------------------------------------THIS IS SHREYASH AND ANAND'S AIR CONDITIONER------------------------------------");
                System.out.println();
                System.out.println("##################::::::IT IS A SAMPLE PROGRAM FOR A CAR'S INTEGRATED AIR TEMPERARTURE CONTROL SYSTEM:::::::::#############");  
                System.out.println();
                System.out.println("##################::::::::::::WHERE THE CAR TEMPERATURE CAN BE EITHER INCREASED OR DECREASED:::::::::::::##################");
                System.out.println();
                System.out.println("##################::::::::::::::::::::::::::AS PER THE USER'S REQUIREMENT::::::::::::::::::::::::::::::::##################");
                int qr=0;
                System.out.println();
                System.out.println("The temperature to be displayed is in Centigrade or Celsius scale");
                System.out.println("In the whole program we have assumed 1 Hour to be 2 Second");
                System.out.println("Now the car temperature is 26 degrere Celsius");
                System.out.println("How much temperature do you want to set?");

                
                if (rt>at)
                  {
                     System.out.println("Now the heater is on");
                     System.out.println("Now the car temperature will increase by 1 degree in 2 hours");
                     System.out.println("Do you want to switch on the turbo effect?");
                     System.out.println("Press yes or no");
                     String ans=nn.readLine();
                     System.out.println("Do you want to switch on the timer or sleep function");
                     System.out.println("Press yes or no");
                     String chhh=nn.readLine();
                     if(chhh.equalsIgnoreCase("yes"))
                     {
                         System.out.println("Please set the time period you want");
                         ti=Integer.parseInt(nn.readLine())*2;
                     }
                     if(ans.equalsIgnoreCase("yes"))
                     {   
                          AirConditioner mm=new AirConditioner(rt);                
                          c=2000;
                          try
                          {
                              System.out.println("Press Enter"); 
                              for( ; ; )
                              {
                                  System.out.println("Do you want to switch off the AC?");
                                  System.out.println("Press yes or no");
                                  String gq=nn.readLine();
                                  Thread.sleep(2000);
                                  if(gq.equalsIgnoreCase("yes"))
                                     break;
                               }    
                           }
                           catch(InterruptedException f)
                           {}
                     }
                     else
                     {   
                          AirConditioner mm=new AirConditioner(rt);
                          c=4000;
                          try
                          {
                              System.out.println("Press Enter"); 
                              for( ; ; )
                              {
                                System.out.println("Do you want to switch off the AC?");
                                System.out.println("Press yes or no");
                                String gq=nn.readLine();
                                Thread.sleep(2000);
                                if(gq.equalsIgnoreCase("yes"))
                                     break;
                               }    
                           }
                           catch(InterruptedException f)
                           {}
                       }                                     
                    System.out.println("Thank You for using our Air Conditioner");
                    System.out.println("Do you want the Air Conditioner to start from the beginning again ?");
                    System.out.println("Press yes or no");
                    answer=nn.readLine();
                    if(answer.equalsIgnoreCase("yes"))
                      {
                          main();
                      }
                    else
                      {
                          break;
                      }
                  }
                 else if(rt<at)
                  {
                      System.out.println("Now the cooler is on");
                      System.out.println("Now the car temperature will decrease by 1 degree in 2 hours");
                      System.out.println("Do you want to switch on the turbo effect?");
                      System.out.println("Press yes or no");
                      String ans=nn.readLine();
                      System.out.println("Do you want to switch on the timer or sleep function");
                      System.out.println("Press yes or no");
                      String chhh=nn.readLine();
                      if(chhh.equalsIgnoreCase("yes"))
                      {
                          System.out.println("Please set the time period you want ");
                          ti=Integer.parseInt(nn.readLine())*2;
                      }
                      if(ans.equalsIgnoreCase("yes"))
                      {    
                          AirConditioner mm=new AirConditioner(rt);                
                          c=2000;
                          try
                          {
                              System.out.println("Press enter"); 
                              for( ; ; )
                              {
                                  System.out.println("Do you want to switch off the AC?");
                                  System.out.println("Press yes or no");
                                  String gq=nn.readLine();
                                  Thread.sleep(2000);
                                  if(gq.equalsIgnoreCase("yes"))
                                    break;
                              }    
                          }
                          catch(InterruptedException f)
                          {}
                      }
                      else
                      {    
                          AirConditioner mm=new AirConditioner(rt);
                          c=4000;
                          try
                          {
                              System.out.println("Press enter"); 
                              for( ; ; )
                              {
                                System.out.println("Do you want to switch off the AC?");
                                System.out.println("Press yes or no");
                                String gq=nn.readLine();
                                Thread.sleep(2000);
                                if(gq.equalsIgnoreCase("yes"))
                                    break;
                              }    
                           }
                           catch(InterruptedException f)
                           {}
                       }                                   
                    System.out.println("Thank You for using our Air Conditioner");
                    System.out.println("Do you want the Air Conditioner to start from the beginning again ?");
                    System.out.println("Press yes or no");
                    answer=nn.readLine();
                    if(answer.equalsIgnoreCase("yes"))
                      {
                          main();
                      }
                    else
                      {
                          break;
                      }
                   }
                 case 2:
                    System.out.println("Thank You for using our Air Conditioner");
                    break;
                 default:
                    System.out.println("You have given the wrong input");
                    System.out.println("Do you want to use it again ?");
                    System.out.println("Press yes or no");
                    answer=nn.readLine();
                    if(answer.equalsIgnoreCase("yes"))
                      {
                          main();
                      }
                    else
                      {
                          break;
                      }
                 }
                 AirConditioner dd=new AirConditioner();
                 dd.display();
            } 
        }