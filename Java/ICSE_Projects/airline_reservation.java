package ICSE_Projects;

import java.io.*;
class airline_reservation
{


  static BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
  static int farein[]={5908,7190,7796,8299};
  static int faresp[]={5687,5311,5975};
  static int fareind[]={4619,4808,5439};
  static int farejet[]={2790,7546,6039,6289};
  static int farekf[]={3248,3329,6239};
  static int farekfi[]={18108,24001};
  static int fareg[]={35782};
  static int fareem[]={32707,29008,39363};
  static int fareai[]={32467,71544};




  static String name;static int ch12;
     
  static void menu()throws IOException
  {
      for(int i=0;i<1; )
      {
          System.out.println("................................... WELCOME TO"+" "+name+" ..............................");
          System.out.println("1.Online air ticket reservation");
          System.out.println("2.flight schedule");
         
          System.out.println("3.feedback about the airlines");
          
          System.out.println("4.log out");
          
           ch12=Integer.parseInt(k.readLine());
          switch(ch12)
          {
              case 1:reserve();break;
              case 2:schedule();break;
              case 3:feedback();break;
              case 4:logout();break;
              default: System.out.println("wrong choice");
              
            }
            if(ch12!=4){System.out.println("to know more information about "+name+" press 1 else press 2 if you want to choose flights again");
            BufferedReader pp=new BufferedReader(new InputStreamReader(System.in));
            int n=Integer.parseInt(k.readLine());
        
            if(n==1){i=0;}
            
            else {runprog();}}
        else if(ch12==4){i++;}
        }
    }
    static void runprog()throws IOException
    {
        BufferedReader pp=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("******--------||------------------------------------------------------------------|||-----******");
        System.out.println("******--------|-----WELCOME TO BHUBANESWAR ONLINE AIRTICKET RESERVATION CENTRE-----||-----******");
        System.out.println("******--------||------------------------------------------------------------------|||-----******");
        System.out.println();
        System.out.println("Press 1 for domestic flights & press 2 for international flights");
        int n=Integer.parseInt(pp.readLine());int g=2;
       do{ 
         if(g==0){System.out.println("plz select valid flight name");}
            g=0;
            if(n==1){
            System.out.println("======================================================================================");
            System.out.println("select any 1 domestic flight for enquiry");
            System.out.println("Kingfisher");
            System.out.println("Jet airways");
            System.out.println("Indian airlines");
            System.out.println("Indigo");
            System.out.println("Spice Jet");
            System.out.println("======================================================================================");
        }
        else if(n==2)
        {
            System.out.println("======================================================================================");
            System.out.println("Select any 1 international flight for enquiry");
            System.out.println("Fly Emirates");
            System.out.println("Air India");
            System.out.println("Gulf Airways");
            System.out.println("Kingfisher International");
            System.out.println("======================================================================================");
        }
        name =pp.readLine();
        if(n==1){if(name.equalsIgnoreCase("indian airlines")||name.equalsIgnoreCase("kingfisher")||name.equalsIgnoreCase("jet airways")||name.equalsIgnoreCase("indigo")||name.equalsIgnoreCase("spice jet"))
        {g=1;menu(); }}
          if(n==2){if(name.equalsIgnoreCase("air india")||name.equalsIgnoreCase("kingfisher international")||name.equalsIgnoreCase("gulf airways")||name.equalsIgnoreCase("fly emirates"))
        {g=1;menu(); } } 
            
           }while(g==0);
    }
    static void reserve()throws IOException
    {
        int i;
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         double tot=0,fr=0,d=0;
         String ch="no";
         do
         { System.out.println("Today's date ?(dd then mm then yy)");
             int dt2[]=new int[3];
             for(i=0;i<3;i++)
             dt2[i]=Integer.parseInt(br.readLine());
             System.out.println("--------WELCOME TO ONLINE BOOKING-----");
             System.out.println("Departure date ?(dd then mm then yy)");
             int dt1[]=new int[3];
             for(i=0;i<3;i++)
             dt1[i]=Integer.parseInt(br.readLine()); 
             
            if((dt1[1]>dt2[1]))
            {  if((dt1[2]==dt2[2]))
             {i=0;
             System.out.println("--------WELCOME TO ONLINE BOOKING-----");
             System.out.println("select flights");
             System.out.println("Here are flights & fares available on the requested dates.Fares are inclusive of taxes.Select your flight of choice");
             
             int sno=schedule();
              if(name.equalsIgnoreCase("kingfisher"))
             {fr=farekf[sno];}
             else if(name.equalsIgnoreCase("Indian Airlines"))
             {fr=farein[sno];}
             else if(name.equalsIgnoreCase("spice jet"))
             {fr=faresp[sno];}
             else if(name.equalsIgnoreCase("Indigo"))
             {fr=fareind[sno];}
             else if(name.equalsIgnoreCase("Jet airways"))
             {fr=farejet[sno];}
             else if(name.equalsIgnoreCase("Kingfisher international"))
             {fr=farekfi[sno];}
             else if(name.equalsIgnoreCase("Gulf Airlines"))
             {fr=fareg[sno];}
             else if(name.equalsIgnoreCase("Fly Emirates"))
             {fr=fareem[sno];}
             else if(name.equalsIgnoreCase("Air India"))
             {fr=fareai[sno];}
             
             System.out.println("Enter number of adults flying");
             int a=Integer.parseInt(br.readLine());
             System.out.println("Enter number of children flying(1-17)20% discount");
             int c=Integer.parseInt(br.readLine());
             
             tot=a*fr;
             d=(80*fr)/100.0;
             tot+=(c*d);
              System.out.println("================================================================================================================");
             System.out.println("FARE FOR ADULTS=........"+"Rs"+(a*fr));
             System.out.println("FARE FOR CHILDREN=..... "+"Rs"+(c*d));
             System.out.println("TOTAL FARE= ............"+"Rs"+tot);
              System.out.println("================================================================================================================");
             System.out.println("Type yes to continue booking");
             ch=br.readLine();i++;
            }}
            if(i!=1) {if((dt1[0]-dt2[0]>=8)&&(dt1[1]<dt2[1])&&(dt1[2]==dt1[2]))
                {System.out.println("--------WELCOME TO ONLINE BOOKING-----");
             System.out.println("select flights");
             System.out.println("Here are flights & fares available on the requested dates.Fares are inclusive of taxes.Select your flight of choice");
             
             int sno=schedule();
              if(name.equalsIgnoreCase("kingfisher"))
             {fr=farekf[sno];}
             else if(name.equalsIgnoreCase("Indian Airlines"))
             {fr=farein[sno];}
             else if(name.equalsIgnoreCase("spice jet"))
             {fr=faresp[sno];}
             else if(name.equalsIgnoreCase("Indigo"))
             {fr=fareind[sno];}
             else if(name.equalsIgnoreCase("Jet airways"))
             {fr=farejet[sno];}
             else if(name.equalsIgnoreCase("Kingfisher international"))
             {fr=farekfi[sno];}
             else if(name.equalsIgnoreCase("Gulf Airlines"))
             {fr=fareg[sno];}
             else if(name.equalsIgnoreCase("Fly Emirates"))
             {fr=fareem[sno];}
             else if(name.equalsIgnoreCase("Air India"))
             {fr=fareai[sno];}
             
             System.out.println("Enter number of adults flying");
             int a=Integer.parseInt(br.readLine());
             System.out.println("Enter number of children flying(1-17)20% discount");
             int c=Integer.parseInt(br.readLine());
             
             tot=a*fr;
             d=(80*fr)/100.0;
             tot+=(c*d);
              System.out.println("================================================================================================================");
             System.out.println("FARE FOR ADULTS=........"+"Rs"+(a*fr));
             System.out.println("FARE FOR CHILDREN=..... "+"Rs"+(c*d));
             System.out.println("TOTAL FARE= ............"+"Rs"+tot);
              System.out.println("================================================================================================================");
             System.out.println("Type yes to continue booking");
             ch=br.readLine();i++;
            }}
            if(i!=1)
            System.out.println("PLZ ENTER A VALID DATE FOR RESERVATION");            
        
            
          
            
            }while(ch.equalsIgnoreCase("no"));
            System.out.println("Your ticket is booked");
            System.out.println("---------THANKS FOR BOOKING-----YOUR SEAT IS CONFIRMED--------");
            System.out.println("---------*WISHING U A SAFE JOURNEY*-------");
             System.out.println("---------need mor information--------");
              ch=br.readLine();
              if(ch.equalsIgnoreCase("yes"))
              runprog();
              if(ch.equalsIgnoreCase("NO"))
              System.out.println("---------*THANKS FOR UR VISIT*-------");
            
        }
            
            
             static int schedule()throws IOException
            {
                 int i,k=100,r,c,g=0,b,z;
                 BufferedReader pk=new BufferedReader(new InputStreamReader(System.in));
                  System.out.println("schedule & cost");
                   System.out.println("sno\t\torigin\t\t\tdestination\t\tmodel\t\ttime\t\tcost");
                 if(name.equalsIgnoreCase("indian airlines"))
                 {    i=1;while(i==1)
                        { 
                    
                     String desti[][]={{"1","Bhubaneswar","Delhi","IC-263","7:00","5908"},
                     {"2","Bhubaneswar","dELHI","IC-265","17:00","7190"},
                     {"3","Bhubaneswar","mUMBAI","IC-676","19:00","7796"},
                     {"4","Bhubaneswar","Mumbai","IC-273","6:00","8299"}};
                     for(r=0;r<4;r++)
                     {         for(c=0;c<6;r++)
                        {
                             System.out.print(desti[r][c]+"\t\t");
                            }
                         System.out.println();
                        }
                        
                       if(ch12==2){   System.out.println("press 1 to get mor info about the choosen flight else press 2 to choose new flight");
                        
                           int sid=Integer.parseInt(pk.readLine());
                           if(sid==1)menu();
                           else if(sid>1)runprog();
                        }
                           
                    if(ch12!=2){
                       
                           System.out.println("Enter the sno of the flights chosen");
                            String s=pk.readLine();
                            for(b=0;b<4;b++)
                            {
                                if( desti[b][0].equalsIgnoreCase(s))
                                {
                                    System.out.println("Schedule of selected");
                                    for(c=0;c<6;c++)
                                    {g++;
                                        r=b;
                                          System.out.println(desti[b][c]+" ");
                                        }
                                        
                                    } } if(g==0)
                                    {
                                        System.out.println("Wrong choice----SORRY");
                                        System.out.println("Continue to choose press 1 else press 2");
                                        i=Integer.parseInt(pk.readLine()); 
                                    }if(i==2) {runprog();}
                                    return r;
                                }}}
                    else if(name.equalsIgnoreCase("kingfisher"))
                    {   i=1;
                       while(i==1){
                      String desti[][]={{"1","Bhubaneswar","kolkata","IT-2501","7:10","3248"},
                      {"2","Bhubaneswar","Kolkata","IT-2503","8:45","3329"},
                      {"3","Bhubaneswar","Bengaluru","IT-3439","6:50","6239"}};
                      for(r=0;r<3;r++)
                      {
                          for(c=0;c<6;c++)
                          {
                           System.out.print(desti[r][c]+"\t\t");
                            }System.out.println();
                        }
                          if(ch12==2){   System.out.println("press 1 to get mor info about the choosen flight else press 2 to choose new flight");
                        
                           int sid=Integer.parseInt(pk.readLine());
                           if(sid==1)menu();
                           else if(sid>1)runprog();
                        }
                           
                    if(ch12!=2){  
                            
                      
                            System.out.println("Enter the sno of the flights chosen");
                            String s=pk.readLine();
                            for(b=0;b<3;b++)
                            {
                                if( desti[b][0].equalsIgnoreCase(s))
                                {
                                    System.out.println("Schedule of selected");
                                    for(c=0;c<6;c++)
                                    {g++;
                                        r=b;
                                          System.out.println(desti[b][c]+" ");
                                        }
                                        
                                    } } if(g==0)
                                    {
                                        System.out.println("Wrong choice----SORRY");
                                        System.out.println("Continue to choose press 1 else press 2");
                                        i=Integer.parseInt(pk.readLine()); 
                                    }if(i==2) {runprog();}
                                    return r;
                                }}}
                    else if(name.equalsIgnoreCase("indigo"))
                    {i=1; while(i==1){
                        String desti[][]={{"1","Bhubaneswar","Chennai","6E-275","6:30","4619"},
                        {"2","Bhubaneswar","Lucknow","6E-341","10:00","4808"},
                        {"3","Bhubaneswar","Bengaluru","IT-3439","6:50","6239"}};
                        
                        for(r=0;r<3;r++)
                        {
                            for(c=0;c<6;c++)
                            {
                            
                           System.out.print(desti[r][c]+"\t\t");
                        }
                        System.out.println();
                       }
                        if(ch12==2){   System.out.println("press 1 to get mor info about the choosen flight else press 2 to choose new flight");
                        
                           int sid=Integer.parseInt(pk.readLine());
                           if(sid==1)menu();
                           else if(sid>1)runprog();
                        }
                           
                    if(ch12!=2){
                       
                      
                             System.out.println("Enter the sno of the flights chosen");
                            String s=pk.readLine();
                            for(b=0;b<3;b++)
                            {
                                if( desti[b][0].equalsIgnoreCase(s))
                                {
                                    System.out.println("Schedule of selected");
                                    for(c=0;c<6;c++)
                                    {g++;
                                        r=b;
                                          System.out.println(desti[b][c]+" ");
                                        }
                                        
                                    } } if(g==0)
                                    {
                                        System.out.println("Wrong choice----SORRY");
                                        System.out.println("Continue to choose press 1 else press 2");
                                        i=Integer.parseInt(pk.readLine()); 
                                    }if(i==2) {runprog();}
                                    return r;
                                }}}
                    else if(name.equalsIgnoreCase("spice jet"))
                    { i=1; while(i==1);{
                        String desti[][]={{"1","Bhubaneswar","Chennai","SG-329","16:50","5687"},
                        {"2","Bhubaneswar","Mumbai","SG-803","8:00","5311"},
                        {"3","Bhubaneswar","Bengaluru","SG-529","16:00","5957"}};
                        for(r=0;r<3;r++)
                        
                        {
                            for(c=0;c<6;c++)
                            {
                                
                            System.out.print(desti[r][c]+"\t\t");
                        } 
                        System.out.println(); 
                    } if(ch12==2){   System.out.println("press 1 to get mor info about the choosen flight else press 2 to choose new flight");
                        
                           int sid=Integer.parseInt(pk.readLine());
                           if(sid==1)menu();
                           else if(sid>1)runprog();
                        }
                           
                    if(ch12!=2){
                         System.out.println("Enter the sno of the flights chosen");
                            String s=pk.readLine();
                            for(b=0;b<3;b++)
                            {
                                if( desti[b][0].equalsIgnoreCase(s))
                                {
                                    System.out.println("Schedule of selected");
                                    for(c=0;c<6;c++)
                                    {g++;
                                        r=b;
                                          System.out.println(desti[b][c]+" ");
                                        }
                                        
                                    } } if(g==0)
                                    {
                                        System.out.println("Wrong choice----SORRY");
                                        System.out.println("Continue to choose press 1 else press 2");
                                        i=Integer.parseInt(pk.readLine()); 
                                    }if(i==2) {runprog();}
                                    return r;
                                }}}
                                else if(name.equalsIgnoreCase("jet airways"))
                    {i=1;while(i==1){
                        String desti[][]={{"1","Bhubaneswar","kolkata","9W-2850","18:45","2790"},
                        {"2","Bhubaneswar","delhi","9W-2278","6:30","7546"},
                        {"3","Bhubaneswar","lucknow","9W-2461","11:00","6039"},
                        {"4","Bhubaneswar","chennai","9W-844","10:30","6289"}};
                        for(r=0;r<4;r++)
                        
                        {
                            for(c=0;c<6;c++)
                            {
                                
                            System.out.print(desti[r][c]+"\t\t");
                        } 
                        System.out.println(); 
                    }
                        if(ch12==2){   System.out.println("press 1 to get mor info about the choosen flight else press 2 to choose new flight");
                        
                           int sid=Integer.parseInt(pk.readLine());
                           if(sid==1)menu();
                           else if(sid>1)runprog();
                        }
                           
                    if(ch12!=2){
                              System.out.println("Enter the sno of the flights chosen");
                            String s=pk.readLine();
                            for(b=0;b<4;b++)
                            {
                                if( desti[b][0].equalsIgnoreCase(s))
                                {
                                    System.out.println("Schedule of selected");
                                    for(c=0;c<6;c++)
                                    {g++;
                                        r=b;
                                          System.out.println(desti[b][c]+" ");
                                        }
                                        
                                    } } if(g==0)
                                    {
                                        System.out.println("Wrong choice----SORRY");
                                        System.out.println("Continue to choose press 1 else press 2");
                                        i=Integer.parseInt(pk.readLine()); 
                                    }if(i==2) {runprog();}
                                    return r;
                                }}}
                                
              else if(name.equalsIgnoreCase("gulf airways"));
                    {i=1;while(i==1){
                        String desti[][]={{"1","Bhubaneswar","London","GF-131","5:30","35782"}};
                        for(r=0;r<1;r++)
                        
                        {
                            for(c=0;c<6;c++)
                            {
                                
                            System.out.print(desti[r][c]+"\t\t");
                        } 
                        System.out.println(); 
                    }if(ch12==2){   System.out.println("press 1 to get mor info about the choosen flight else press 2 to choose new flight");
                        
                           int sid=Integer.parseInt(pk.readLine());
                           if(sid==1)menu();
                           else if(sid>1)runprog();
                        }
                           
                    if(ch12!=2){
                          System.out.println("Enter the sno of the flights chosen");
                            String s=pk.readLine();
                            for(b=0;b<1;b++)
                            {
                                if( desti[b][0].equalsIgnoreCase(s))
                                {
                                    System.out.println("Schedule of selected");
                                    for(c=0;c<6;c++)
                                    {g++;
                                        r=b;
                                          System.out.println(desti[b][c]+" ");
                                        }
                                        
                                    } } if(g==0)
                                    {
                                        System.out.println("Wrong choice----SORRY");
                                        System.out.println("Continue to choose press 1 else press 2");
                                        i=Integer.parseInt(pk.readLine()); 
                                    }if(i==2) {runprog();}
                                    return r;
                                }}}
                   if(name.equalsIgnoreCase("air india"))
                    {i=1;while(i==1){
                        String desti[][]={{"1","Bhubaneswar","London","AI-111","10:00","32469"},
                            {"2","Bhubaneswar","New York","AI-101","19:35","71256"}};
                        for(r=0;r<1;r++)
                        
                        {
                            for(c=0;c<6;c++)
                            {
                                
                            System.out.print(desti[r][c]+"\t\t");
                        } 
                        System.out.println(); 
                    } if(ch12==2){   System.out.println("press 1 to get mor info about the choosen flight else press 2 to choose new flight");
                        
                           int sid=Integer.parseInt(pk.readLine());
                           if(sid==1)menu();
                           else if(sid>1)runprog();
                        }
                           
                    if(ch12!=2){
                          System.out.println("Enter the sno of the flights chosen");
                            String s=pk.readLine();
                            for(b=0;b<2;b++)
                            {
                                if( desti[b][0].equalsIgnoreCase(s))
                                {
                                    System.out.println("Schedule of selected");
                                    for(c=0;c<6;c++)
                                    {g++;
                                        r=b;
                                          System.out.println(desti[b][c]+" ");
                                        }
                                        
                                    } } if(g==0)
                                    {
                                        System.out.println("Wrong choice----SORRY");
                                        System.out.println("Continue to choose press 1 else press 2");
                                        i=Integer.parseInt(pk.readLine()); 
                                    }if(i==2) {runprog();}
                                    return r;
                                }}}
                    else if(name.equalsIgnoreCase("Fly Emirates"))
                    {i=1;while(i==1){ 
                        String desti[][]={{"1","Bhubaneswar","Tokyo","EK-757","12:00","32707"},
                            {"2","Bhubaneswar","Paris","EK-509","22:25","29008"},
                            {"3","Bhubaneswar","Paris","EK-76","21:05","39363"}};
                       for(r=0;r<1;r++)
                        
                        {
                            for(c=0;c<6;c++)
                            {
                                
                            System.out.print(desti[r][c]+"\t\t");
                        } 
                        System.out.println(); 
                    }
                    if(ch12==2){   System.out.println("press 1 to get mor info about the choosen flight else press 2 to choose new flight");
                        
                           int sid=Integer.parseInt(pk.readLine());
                           if(sid==1)menu();
                           else if(sid>1)runprog();
                        }
                           
                    if(ch12!=2){
                        System.out.println("Enter the sno of the flights chosen");
                            String s=pk.readLine();
                            for(b=0;b<3;b++)
                            {
                                if( desti[b][0].equalsIgnoreCase(s))
                                {
                                    System.out.println("Schedule of selected");
                                    for(c=0;c<6;c++)
                                    {g++;
                                        r=b;
                                          System.out.println(desti[b][c]+" ");
                                        }
                                        
                                    } } if(g==0)
                                    {
                                        System.out.println("Wrong choice----SORRY");
                                        System.out.println("Continue to choose press 1 else press 2");
                                        i=Integer.parseInt(pk.readLine()); 
                                    }if(i==2) {runprog();}
                                    return r;
                                }}}
                    else if(name.equalsIgnoreCase("Kingfisher International"))
                    {i=1;while(i==1){
                        String desti[][]={{"1","Bhubaneswar","Singapore","IT-29","23:25","18102"},
                        {"2","Bhubaneswar","Singapore","IT-30","18:10","24005"}};
                         for(r=0;r<1;r++)
                        
                        {
                            for(c=0;c<6;c++)
                            {
                                
                          System.out.print(desti[r][c]+"\t\t");
                        } 
                        System.out.println(); 
                    }
                    if(ch12==2){   System.out.println("press 1 to get mor info about the choosen flight else press 2 to choose new flight");
                        
                           int sid=Integer.parseInt(pk.readLine());
                           if(sid==1)menu();
                           else if(sid>1)runprog();
                        }
                           
                    if(ch12!=2){
                        System.out.println("Enter the sno of the flights chosen");
                            String s=pk.readLine();
                            for(b=0;b<2;b++)
                            {
                                if( desti[b][0].equalsIgnoreCase(s))
                                {
                                    System.out.println("Schedule of selected");
                                    for(c=0;c<6;c++)
                                    {g++;
                                        r=b;
                                          System.out.println(desti[b][c]+" ");
                                        }
                                        
                                    } } if(g==0)
                                    {
                                        System.out.println("Wrong choice----SORRY");
                                        System.out.println("Continue to choose press 1 else press 2");
                                        i=Integer.parseInt(pk.readLine()); 
                                    }if(i==2) {runprog();}
                                    return r;
                                }}}
                                  
                                   
                              
                                else {
                                
                                    System.out.println("SORRY................wrong flight chosen..................");
                                    runprog();
                                }return k;
                            }
                               public static void main()throws IOException
                                 {
                                               runprog();
                                     }
                                 
            
             
                       static void feedback()throws IOException
                       {
                           BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
                           
                           System.out.println("Thanks you for flying "+name+". To improve our service in a way that truly makes a difference to your flying experience, we need to know your views about your fligh.");
                           System.out.println("Please spare a few minutes to fill this form. Let us assure you that we will not only consider your views but act on them as well.");
                           System.out.println("_______________________________________________________________________");
                           System.out.println("Rank the given services on a scale of 1 to 5");
                           System.out.println("(1 being the highest and 5 being the lowest");
                           System.out.println("RESERVATIONS");
                           System.out.println("Enter choice 1 to 5");
                           String ch=buf.readLine();
                           System.out.println("CHECK-IN");
                           System.out.println("Enter choice 1 to 5");
                           String ch2=buf.readLine();
                           System.out.println("BAGGAGE");
                           System.out.println("Enter choice 1 to 5");
                           String ch3=buf.readLine();
                           System.out.println("FACILITATION");
                           System.out.println("Enter choice 1 to 5");
                           String ch4=buf.readLine();
                           System.out.println("Thanks for your valuable feedback");


 
                           System.out.println("Enter your email-id");
                           String eid=buf.readLine();
                           System.out.println("Enter your name");
                           String nma=buf.readLine();
                        }
                    static void logout()throws IOException
                    {


                         System.out.println("byeeeeeeeeeeeeeeee");
                        }
                    }
                
              
          
