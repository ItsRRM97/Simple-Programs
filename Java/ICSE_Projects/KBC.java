package ICSE_Projects;

// Importing Packages
import java.lang.*; //DEFAULT PACKAGE
import java.io.*;   //IO package...stands for input output                   
class KBC // Class Name
  {   
      // Gobal Variables are the ones declared below, for convenience only
      // "static" keyword is used here because a non static variable cannot be referred from a static context
      static int f=0; // no. of times a FLIP lifeline is used
      static int e=0;  // no. of times DOUBLE DIP lifeline is used
      static int q =0; // condition for each question to appear, gets incremented if answered correcty to print the next question
      static double money =0; // TO print the cash won after wrong answer
      static String ca="Correct Answer!!!!! Congratulations!!!! "; // printing statement for correct or wrong answer respectively
      static String wa="Wrong Answer....Sorry ";
      static char answer[]={'C','B','B','C','D','B','A','C','D','B','A','A','D'}; // THE ANSWER key for the 13 below questions that shall be asked
      static double score[]={5000,10000,20000,40000,80000,160000,320000,640000,1250000,2500000,5000000,10000000,50000000}; // The cashprice serial
      static int k=0; //to  print the minimum cash you have selected after checking the condition
      public static void main()throws IOException                                   // main program
      { 
          long i; long j; // used as variables for generating time gap 
          int mincash1=0;// for fixing the stage which when crosed returns the selected amount called "Manchaha Padaw" in Hindi KBC
          double mincash=0.0; //to set the minimum cash.
          int min;// min is used here above to run the loop to check the mincash 
          BufferedReader br=(new BufferedReader(new InputStreamReader(System.in)));  // Input Statement, to turn the Terminal window to Input Screen also 
          // For Loop is used here just to create time gap between two printing statements.
          // The stars used..ie The special Character is just for decoration purpose
          // The time gap is created by running I loop for seconds, and J loop for 60 crores times
          // Since 60 crores === 1 second
          System.out.println("\t\t\t^^^^^^^^^^^^^^^^*             *   * * * *  *           * * *     * * *    *      *  * * * *        ^^^^^^^^^^^^^^^^");
          for(i=1;i<=30000000;i++){}
          System.out.println("\t\t\t^^^^^^^^^^^^^^^  *          *     *        *         *          *     *   * *  * *  *             ^^^^^^^^^^^^^^^^^");
          for(i=1;i<=30000000;i++){}
          System.out.println("\t\t\t^^^^^^^^^^^^^^    *   *   *       * * *    *        *          *       *  *   *  *  * * *          ^^^^^^^^^^^^^^^^^^^");
          for(i=1;i<=30000000;i++){}
          System.out.println("\t\t\t^^^^^^^^^^^^^^     * * * *        *        *         *          *     *   *      *  *              ^^^^^^^^^^^^^^^^");
          for(i=1;i<=30000000;i++){}
          System.out.println("\t\t\t^^^^^^^^^^^^^       *   *         * * * *  * * * *     * * *     * * *    *      *  * * * *        ^^^^^^^^^^^^^^^^^"); 
          for(i=1;i<=30000000;i++){}
          // WELCOME is being printed above
          System.out.println();
          System.out.println();
          for(i=1;i<=30000000;i++){}
          System.out.println("\t\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^     * * * * *    * * *  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^  "); 
          for(i=1;i<=30000000;i++){}
          System.out.println("\t\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^     *       *     *  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");
          for(i=1;i<=30000000;i++){}
          System.out.println("\t\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^      *      *       * ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");
          for(i=1;i<=30000000;i++){}
          System.out.println("\t\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^     *       *     *  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");
          for(i=1;i<=30000000;i++){}
          System.out.println("\t\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ *        * * *   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");
          // TO is being printed here
          System.out.println();
          System.out.println();
          for(i=1;i<=30000000;i++) {}
          System.out.println("\t\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ *     *    * * *        * * *   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
          for(i=1;i<=30000000;i++){}
          System.out.println("\t\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ *   *      *     *    *         ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");
          for(i=1;i<=30000000;i++){}
          System.out.println("\t\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ * *        * * *     *          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");
          for(i=1;i<=30000000;i++){}
          System.out.println("\t\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ *   *      *     *    *         ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");
          for(i=1;i<=30000000;i++){}
          System.out.println("\t\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ *     *    * * *        * * *    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
          // KBC is being printed here
          System.out.println();
          System.out.println();
          System.out.println();
          for(i=1;i<=30000000;i++){}
          System.out.println(" \t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
          for(i=1;i<=30000000;i++){}
          System.out.println(" \t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
          for(i=1;i<=30000000;i++) {}
          System.out.println(" \t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
          System.out.println();
          System.out.println();
          for(i=1;i<=30000000;i++){}
          System.out.println(" Welcome To KAUN BANEGA CROREPATI!!!!");
          for(i=1;i<=30000000;i++){}
          System.out.println("How are you feeling now... you have qualified in the FASTEST FINGER FIRST CONTEST!!!");
          String feelings=br.readLine();                  // Just for question purpose String to be entered not any logical use
          for(i=1;i<=30000000;i++){}
          System.out.print("Enter your Name - ");
          String name=br.readLine();
          int l=name.length();
          while(l==0)            // incase user enters nothing
          {
            System.out.println("Enter your name again, you are not nameless!!!!??? Rite?");
            name=br.readLine();
            l=name.length();
          }
          System.out.print(" Okay!!! "+name+" You are currently sitting on the hot seat!!!");
          System.out.println();
          System.out.println(" My question to you... What will you do if you win 5 crores????");        // Just for question purpose String to be entered
          String purpose=br.readLine();
          System.out.println(" Woah!!! Thats Great!!! We wish that you certainly take 5 Crores from here!!!!!!");
          for(i=1;i<=30000000;i++){}
          System.out.println("\u000c");
          // the above is the unicode character for clearscreen
          // the printing lines following thereafter are the rules
          System.out.println("BEFORE WE START LET ME TELL THE RULES FOR YOU!!!");
          for(i=1;i<=30000000;i++){}
          System.out.println(" * There will be 13 questions with 4 options for each out of which only 1 is correct" );
          for(i=1;i<=30000000;i++){}
          System.out.println(" * The scoring scheme is :-");         // Marking scheme per question
          for(i=1;i<=1;i++){for(j=1;j<=30000000;j++){}}
          System.out.println("   Q#1 - Rs "+score[0] );
          System.out.println("   Q#2 - Rs "+score[1] );
          System.out.println("   Q#3 - Rs "+score[2] );
          System.out.println("   Q#4 - Rs "+score[3] );
          System.out.println("   Q#5 - Rs "+score[4] );
          System.out.println("   Q#6 - RS "+score[5] );
          System.out.println("   Q#7 - Rs "+score[6] );
          System.out.println("   Q#8 - RS "+score[7] );
          System.out.println("   Q#9 - Rs "+score[8] );
          System.out.println("   Q#10- Rs "+score[9]);
          System.out.println("   Q#11- Rs "+score[10]);
          System.out.println("   Q#12- Rs 10000000.0");
          System.out.println("   Q#13- Rs 50000000.0");
          for(j=1;j<=3;j++){for(i=1;i<=30000000;i++){}}
          System.out.println(" *First you have to set the minimuum cash you wanna take from here!");
          System.out.println(" *if you give correct answers and reach your mark you will"); 
          System.out.println("  take minimum that amount from here.");
          for(i=1;i<=30000000;i++){}
          System.out.println(" *Make sure that your caps lock key is on before you give your choice");
          System.out.println();
          System.out.println(" *Dont enter options other than A/B/C/D as it will result in wrong answer");
          System.out.println();
          System.out.println(" * If you want to quit anytime press 'Q'");
          System.out.println(" * You have got 2 lifelines, namely, double dip and flip, each can be called only once,");
          System.out.println(" * To use double dip press E and for fip press F");
          for(i=1;i<=30000000;i++){}
          System.out.println();
          System.out.println();
          System.out.println("Thats all about the rules of this Game!!!!");
          System.out.println();
          System.out.println();
          System.out.println("Please tell us the minimum amount of cash you would like to take....");
          System.out.println("Your menu is here.....");
          System.out.println("5000,10000,20000,40000,80000,160000,320000,640000,1250000,2500000,5000000,10000000,50000000");
          for(i=0;k==0;i++)          // incase user enters inappropriate minimum cash
           {
           mincash1=Integer.parseInt(br.readLine());
          switch (mincash1)
          {
              case 5000:k=5000; break;
              case 10000:k=10000; break;
              case 20000:k=20000; break;
              case 40000:k=40000; break;
              case 80000:k=80000; break;
              case 160000:k=160000; break;
              case 320000:k=320000; break;
              case 640000:k=640000; break;
              case 1250000:k=1250000; break;
              case 2500000:k=2500000; break;
              case 5000000:k=5000000; break;
              case 10000000:k=10000000; break;
              case 50000000:k=50000000; break;
              default : System.out.println("Enter value again"); break; 
           }
       }
          KBC obj=new KBC();     //object creation
          System.out.println("\u000c"); // CLEARSCREEN command of unicode character
          System.out.println("So Your minimum cash you will take is Rs."+k);
          System.out.println("LETS BEGIN!!!!");
          for(i=1;i<=30000000;i++){}
          System.out.println();
          System.out.println();
          if(q==0)                 // The questions will be executed only if "q" is incremented, "q" will be incremented only if answers are correct
          {
          System.out.println("Your First Question is of Rs."+score[q]);
          for(i=1;i<=30000000;i++){}
          System.out.println("Q1. Which bird is the fastest on two legs?");
          for(i=1;i<=30000000;i++){}
          System.out.println("A) Dodo");
          for(i=1;i<=30000000;i++){}
          System.out.println("B) Sparrow");
          for(i=1;i<=30000000;i++){}
          System.out.println("C) Ostrich");
          for(i=1;i<=30000000;i++) {}
          System.out.println("D) Bat");
          for(i=1;i<=30000000;i++){}
          System.out.println();
          System.out.println("Enter 'E' for doube dip lifeline and 'F' for Flip IF YOU ARE not sure"); 
          System.out.println("DON'T USE LIFELINE IF YOU HAVE ALREADY USED IT as it will result in WRONG answer!");
          System.out.println("Lifeline(s) remaining-");
          if((e==0)&&(f==0))
          {
           System.out.println("Both");
           }
          if(e==0)
          {
           System.out.println("Double dip");
           }
          if(f==0)
          {
           System.out.println("Flip");
           }
           else
           {
            System.out.println("None");
            }
          char ch2=Character.toUpperCase(((char)br.read()));// for input of answer
          switch(ch2)
          {
              case 'A': System.out.println(wa);obj.option(); System.out.println("Your have won Rs NOTHING!!!");obj.total(); break;
              case 'B': System.out.println(wa);obj.option(); System.out.println("Your have won Rs NOTHING!!!");obj.total(); break;
              case 'C': System.out.println(ca); q++; break;
              case 'D': System.out.println(wa);obj.option(); System.out.println("Your have won Rs NOTHING!!!");obj.total(); break;
              case 'F': obj.Flip(); break;
              case 'E': obj.Dip(); break;
              case 'Q': System.out.println(" You Have Quitted the game, Thanks for playing KBC!!!!"); obj.total();  break;
              default : System.out.println(" You entered some other option! You lost the game!");obj.total(); break;
            }
        }
        System.out.println(); 
        System.out.println();
        if(q==1)
          {
        System.out.println("Your Second Question is of Rs."+score[q]);
          System.out.println("Q2. What is the capital of Australia?");
          for(i=1;i<=30000000;i++){}
          System.out.println("A) Sydney");
          for(i=1;i<=30000000;i++){}
          System.out.println("B) Cannabera");
          for(i=1;i<=30000000;i++){}
          System.out.println("C) Perth");
          for(i=1;i<=30000000;i++){}
          System.out.println("D) Tasmania");
          for(i=1;i<=30000000;i++){}
          System.out.println();
          System.out.println("Enter 'E' for doube dip lifeline and 'F' for Flip IF YOU ARE not sure"); 
          System.out.println("DON'T USE LIFELINE IF YOU HAVE ALREADY USED IT as it will result in WRONG answer!");
          System.out.println("Lifeline(s) remaining-");
          if((e==0)&&(f==0))
          {
           System.out.println("Both");
           }
          if(e==0)
          {
           System.out.println("Double dip");
           }
          if(f==0)
          {
           System.out.println("Flip");
           }
           else
           {
            System.out.println("None");
            }
           char cha1=Character.toUpperCase(((char)br.read()));
          char ch3=Character.toUpperCase(((char)br.read()));   // for input of answer
          switch(ch3)
          {
              case 'A': System.out.println(wa);obj.option();obj.total(); break;
              case 'B': System.out.println(ca); q++;  break;
              case 'C': System.out.println(wa);obj.option();obj.total(); break;
              case 'D': System.out.println(wa);obj.option();obj.total(); break;
              case 'F': obj.Flip(); break;
              case 'E': obj.Dip(); break;
              case 'Q':  System.out.println(" You Have Quitted the game, Thanks for playing KBC!!!!");  break;
              default : System.out.println(" You entered some other option! You lost the game!");obj.total(); break;
            }}
            if(q==2)
          {
          System.out.println("Your Third Question is of Rs. "+score[q]);
          System.out.println("Q3. Which album hods the record the worlds best selling album currenty(English)?");
          for(i=1;i<=30000000;i++){}
          System.out.println("A) Minutes to midnight-Linkin Park");
          for(i=1;i<=30000000;i++){}
          System.out.println("B) Thriller-Michael Jackson");
          for(i=1;i<=30000000;i++){}
          System.out.println("C) Eighteen till I die-Bryan Adams");
          for(i=1;i<=30000000;i++){}
          System.out.println("D) Insonamiac-Enrique Iglesiaus");
          for(i=1;i<=30000000;i++){}
          System.out.println();
          System.out.println("Enter 'E' for doube dip lifeline and 'F' for Flip IF YOU ARE not sure"); 
          System.out.println("DON'T USE LIFELINE IF YOU HAVE ALREADY USED IT as it will result in WRONG answer!");
          System.out.println("Lifeline(s) remaining-");
          if((e==0)&&(f==0))
          {
           System.out.println("Both");
           }
          if(e==0)
          {
           System.out.println("Double dip");
           }
          if(f==0)
          {
           System.out.println("Flip");
           }
           else
           {
            System.out.println("None");
            }
           char cha2=Character.toUpperCase(((char)br.read()));
          char ch4=Character.toUpperCase(((char)br.read()));  // for input of answer
          switch(ch4)
          {
              case 'A': System.out.println(wa);obj.option();obj.total(); break;
              case 'B': System.out.println(ca); q++;  break;
              case 'C': System.out.println(wa);obj.option();obj.total(); break;
              case 'D': System.out.println(wa);obj.option();obj.total(); break;
              case 'F': obj.Flip(); break;
              case 'E': obj.Dip(); break;
              case 'Q':  System.out.println(" You Have Quitted the game, Thanks for playing KBC!!!!"); obj.total();  break;
              default : System.out.println(" You entered some other option! You lost the game!");obj.total(); break;
            }}
            if(q==3)
          {
          System.out.println("Your Fourth Question is of Rs. "+score[q]);
          System.out.println("Q4. Which is the most recent country to get independence?"); // question
          for(i=1;i<=30000000;i++){}
          System.out.println("A) Yugoslavia");
          for(i=1;i<=30000000;i++){}
          System.out.println("B) Taiwan");
          for(i=1;i<=30000000;i++){}
          System.out.println("C) South Sudan");
          for(i=1;i<=30000000;i++){}
          System.out.println("D) South Korea");
          for(i=1;i<=30000000;i++){}
          System.out.println();
          System.out.println("Enter 'E' for doube dip lifeline and 'F' for Flip IF YOU ARE not sure"); 
          System.out.println("DON'T USE LIFELINE IF YOU HAVE ALREADY USED IT as it will result in WRONG answer!");
          System.out.println("Lifeline(s) remaining-");
          if((e==0)&&(f==0))
          {
           System.out.println("Both");
           }
          if(e==0)
          {
           System.out.println("Double dip");
           }
          if(f==0)
          {
           System.out.println("Flip");
           }
           else
           {
            System.out.println("None");
            }
           char cha3=Character.toUpperCase(((char)br.read()));
          char ch5=Character.toUpperCase(((char)br.read()));     // for input of answer
          switch(ch5)
          {
              case 'A': System.out.println(wa);obj.option();obj.total(); break;
              case 'B': System.out.println(wa);obj.option();obj.total(); break;
              case 'C': System.out.println(ca); q++; break;
              case 'D': System.out.println(wa);obj.option();obj.total(); break;
              case 'F': obj.Flip(); break;
              case 'E': obj.Dip(); break;
              case 'Q':  System.out.println(" You Have Quitted the game, Thanks for playing KBC!!!!"); obj.total();  break;
              default : System.out.println(" You entered some other option! You lost the game!");obj.total(); break;
            }}
            if(q==4)
          {
          System.out.println("Your Fifth Question is of Rs. "+score[q]);
          System.out.println("Q5. Which is the highest man made structure on earth?");// question
          for(i=1;i<=30000000;i++){}
          System.out.println("A) World Trade Centres");
          for(i=1;i<=30000000;i++){}
          System.out.println("B) Burj Khalifa");
          for(i=1;i<=30000000;i++){}
          System.out.println("C) Great wall of china");
          for(i=1;i<=30000000;i++){}
          System.out.println("D) Tokyo Sky Tree");
          for(i=1;i<=30000000;i++){}
          System.out.println();
          System.out.println("Enter 'E' for doube dip lifeline and 'F' for Flip IF YOU ARE not sure"); 
          System.out.println("DON'T USE LIFELINE IF YOU HAVE ALREADY USED IT as it will result in WRONG answer!");
          System.out.println("Lifeline(s) remaining-");
          if((e==0)&&(f==0))
          {
           System.out.println("Both");
           }
          if(e==0)
          {
           System.out.println("Double dip");
           }
          if(f==0)
          {
           System.out.println("Flip");
           }
           else
           {
            System.out.println("None");
            }
           char cha4=Character.toUpperCase(((char)br.read()));
          char ch6=Character.toUpperCase(((char)br.read()));    // for input of answer
          switch(ch6)
          {
              case 'A': System.out.println(wa); break;
              case 'B': System.out.println(wa); break;
              case 'C': System.out.println(wa); break;
              case 'D': System.out.println(ca); q++; break;
              case 'F': obj.Flip(); break;
              case 'E': obj.Dip(); break;
              case 'Q':  System.out.println(" You Have Quitted the game, Thanks for playing KBC!!!!"); obj.total();  break;
              default : System.out.println(" You entered some other option! You lost the game!");obj.total(); break;
            }}
            if(q==5)
          {
          System.out.println("Your Sixth Question is of Rs."+score[q]);
          System.out.println("Q6. How many states does the United States have?");// question
          for(i=1;i<=30000000;i++){}
          System.out.println("A) 27");
          for(i=1;i<=30000000;i++){}
          System.out.println("B) 50");
          for(i=1;i<=30000000;i++){}
          System.out.println("C) 48");
          for(i=1;i<=30000000;i++){}
          System.out.println("D) 32");
          for(i=1;i<=30000000;i++){}
          System.out.println();
          System.out.println("Enter 'E' for doube dip lifeline and 'F' for Flip IF YOU ARE not sure"); 
          System.out.println("DON'T USE LIFELINE IF YOU HAVE ALREADY USED IT as it will result in WRONG answer!");
          System.out.println("Lifeline(s) remaining-");
          if((e==0)&&(f==0))
          {
           System.out.println("Both");
           }
          if(e==0)
          {
           System.out.println("Double dip");
           }
          if(f==0)
          {
           System.out.println("Flip");
           }
           else
           {
            System.out.println("None");
            }
           char cha5=Character.toUpperCase(((char)br.read()));
          char ch7=Character.toUpperCase(((char)br.read()));   // for input of answer
          switch(ch7)
          {
              case 'A': System.out.println(wa);obj.option();obj.total(); break;
              case 'B': System.out.println(ca);q++; break;
              case 'C': System.out.println(wa);obj.option();obj.total(); break;
              case 'D': System.out.println(wa);obj.option();obj.total(); break;
              case 'F': obj.Flip(); break;
              case 'E': obj.Dip(); break;
              case 'Q':  System.out.println(" You Have Quitted the game, Thanks for playing KBC!!!!"); obj.total();  break;
              default : System.out.println(" You entered some other option! You lost the game!");obj.total(); break;
            }}
            if(q==6)
          {
          System.out.println("Your Seventh Question is of Rs."+score[q]);
          System.out.println("Q7. Which country is the third greatest country in terms of population?");// question
          for(i=1;i<=30000000;i++){}
          System.out.println("A) U.S.A");
          for(i=1;i<=30000000;i++){}
          System.out.println("B) Japan");
          for(i=1;i<=30000000;i++){}
          System.out.println("C) Russia");
          for(i=1;i<=30000000;i++){}
          System.out.println("D) Brazil");
          for(i=1;i<=30000000;i++){}
          System.out.println();

          System.out.println("Enter 'E' for doube dip lifeline and 'F' for Flip IF YOU ARE not sure"); 
          System.out.println("DON'T USE LIFELINE IF YOU HAVE ALREADY USED IT as it will result in WRONG answer!");
          System.out.println("Lifeline(s) remaining-");
          if((e==0)&&(f==0))
          {
           System.out.println("Both");
           }
          if(e==0)
          {
           System.out.println("Double dip");
           }
          if(f==0)
          {
           System.out.println("Flip");
           }
           else
           {
            System.out.println("None");
            }
           char cha6=Character.toUpperCase(((char)br.read()));
          char ch8=Character.toUpperCase(((char)br.read()));
          switch(ch8) // switch case for inputing answer check
          {
              case 'A': System.out.println(ca);q++; break;
              case 'B': System.out.println(wa);obj.option();obj.total(); break;
              case 'C': System.out.println(wa); obj.total();break;
              case 'D': System.out.println(wa);obj.option();obj.total(); break;
              case 'F': obj.Flip(); break;
              case 'E': obj.Dip(); break;
              case 'Q':  System.out.println(" You Have Quitted the game, Thanks for playing KBC!!!!"); obj.total();  break;
              default : System.out.println(" You entered some other option! You lost the game!");obj.total(); break;
            }}
            if(q==7)
          {
          System.out.println("Your Eight Question is of Rs."+score[q]);
          System.out.println("Q8. Who is the youngest president ever of India?");// question
          for(i=1;i<=30000000;i++){}
          System.out.println("A) Rajendra Prassad");
          for(i=1;i<=30000000;i++){}
          System.out.println("B) Pranav Mukharjee");
          for(i=1;i<=30000000;i++){}
          System.out.println("C) Maulana Abdul Kalam Azad");
          for(i=1;i<=30000000;i++){}
          System.out.println("D) A.P.J Abdul Kalam");
          for(i=1;i<=30000000;i++){}
          System.out.println();
          System.out.println("Enter 'E' for doube dip lifeline and 'F' for Flip IF YOU ARE not sure"); 
          System.out.println("DON'T USE LIFELINE IF YOU HAVE ALREADY USED IT as it will result in WRONG answer!");
          System.out.println("Lifeline(s) remaining-");
          if((e==0)&&(f==0))
          {
           System.out.println("Both");
           }
          if(e==0)
          {
           System.out.println("Double dip");
           }
          if(f==0)
          {
           System.out.println("Flip");
           }
           else
           {
            System.out.println("None");
            }
           char cha7=Character.toUpperCase(((char)br.read()));
          char ch9=Character.toUpperCase(((char)br.read()));
          switch(ch9)
          {
              case 'A': System.out.println(wa);obj.option();obj.total(); break;
              case 'B': System.out.println(wa);obj.option();obj.total(); break;
              case 'C': System.out.println(ca);q++; break;
              case 'D': System.out.println(wa);obj.option();obj.total(); break;
              case 'F': obj.Flip(); break;
              case 'Q':  System.out.println(" You Have Quitted the game, Thanks for playing KBC!!!!"); obj.total();  break;
              case 'E': obj.Dip(); break;
              default : System.out.println(" You entered some other option! You lost the game!");obj.total(); break;
            }}
            if(q==8)
          {
          System.out.println("Your Ninth Question is of Rs."+score[q]);
          System.out.println("Q9. Who is the producer of the cartoon show, Tom and Jerry?");// question
          for(i=1;i<=30000000;i++){}
          System.out.println("A) Dave Bautista");
          for(i=1;i<=30000000;i++){}
          System.out.println("B) Man of Action");
          for(i=1;i<=30000000;i++){}
          System.out.println("C) Oscar Wildle");
          for(i=1;i<=30000000;i++){}
          System.out.println("D) Fred Quimby");
          for(i=1;i<=30000000;i++){}
          System.out.println();
          System.out.println("Enter 'E' for doube dip lifeline and 'F' for Flip IF YOU ARE not sure"); 
          System.out.println("DON'T USE LIFELINE IF YOU HAVE ALREADY USED IT as it will result in WRONG answer!");
          System.out.println("Lifeline(s) remaining-");
          if((e==0)&&(f==0))
          {
           System.out.println("Both");
           }
          if(e==0)
          {
           System.out.println("Double dip");
           }
          if(f==0)
          {
           System.out.println("Flip");
           }
           else
           {
            System.out.println("None");
            }
          char ch10=Character.toUpperCase(((char)br.read()));
          switch(ch10)
          {
              case 'A': System.out.println(wa);obj.option();obj.total(); break;
              case 'B': System.out.println(wa);obj.option();obj.total(); break;
              case 'C': System.out.println(wa); obj.total();break;
              case 'D': System.out.println(ca);q++; break;
              case 'F': obj.Flip(); break;
              case 'E': obj.Dip(); break;
              case 'Q':  System.out.println(" You Have Quitted the game, Thanks for playing KBC!!!!"); obj.total();  break;
              default : System.out.println(" You entered some other option! You lost the game!");obj.total(); break;
            }}

            if(q==9)
          {
          System.out.println("Your Tenth Question is of Rs. 2500000");
          System.out.println("Q10. Which car has the title of being the costliest and fastest car of the world?");// question
          for(i=1;i<=30000000;i++){}
          System.out.println("A) Mercedes Benz SLR 500");
          for(i=1;i<=30000000;i++){}
          System.out.println("B) Bugatti Veryon");
          for(i=1;i<=30000000;i++){}
          System.out.println("C) Aston Martin DB9");
          for(i=1;i<=30000000;i++){}
          System.out.println("D) Lambourghini Gallardo");
          for(i=1;i<=30000000;i++){}
          System.out.println();
          System.out.println("Enter 'E' for doube dip lifeline and 'F' for Flip IF YOU ARE not sure"); 
          System.out.println("DON'T USE LIFELINE IF YOU HAVE ALREADY USED IT as it will result in WRONG answer!");
          System.out.println("Lifeline(s) remaining-");
          if((e==0)&&(f==0))
          {
           System.out.println("Both");
           }
          if(e==0)
          {
           System.out.println("Double dip");
           }
          if(f==0)
          {
           System.out.println("Flip");
           }
           else
           {
            System.out.println("None");
            }
           char cha9=Character.toUpperCase(((char)br.read()));
          char ch11=Character.toUpperCase(((char)br.read()));
          switch(ch11)
          {
              case 'A': System.out.println(wa);obj.option();obj.total(); break;
              case 'B': System.out.println(ca);q++; break;
              case 'C': System.out.println(wa);obj.option();obj.total(); break;
              case 'D': System.out.println(wa);obj.option();obj.total(); break;
              case 'F': obj.Flip(); break;
              case 'E': obj.Dip(); break;
              case 'Q':  System.out.println(" You Have Quitted the game, Thanks for playing KBC!!!!"); obj.total();  break;
              default : System.out.println(" You entered some other option! You lost the game!");obj.total(); break;
            }}

            if(q==10)
          {
          System.out.println("Your Eleventh Question is of Rs."+score[q]);
          System.out.println("Q11. When was the battle of Plassey fought(year)?");// question
          for(i=1;i<=30000000;i++){}
          System.out.println("A) 1757");
          for(i=1;i<=30000000;i++){}
          System.out.println("B) 1847");
          for(i=1;i<=30000000;i++){}
          System.out.println("C) 1557");
          for(i=1;i<=30000000;i++){}
          System.out.println("D) 1947");
          for(i=1;i<=30000000;i++){}
          System.out.println();

          System.out.println("Enter 'E' for doube dip lifeline and 'F' for Flip IF YOU ARE not sure"); 
          System.out.println("DON'T USE LIFELINE IF YOU HAVE ALREADY USED IT as it will result in WRONG answer!");
          System.out.println("Lifeline(s) remaining-");
          if((e==0)&&(f==0))
          {
           System.out.println("Both");
           }
          if(e==0)
          {
           System.out.println("Double dip");
           }
          if(f==0)
          {
           System.out.println("Flip");
           }
           else
           {
            System.out.println("None");
            }
           char cha10=Character.toUpperCase(((char)br.read()));
          char ch12=Character.toUpperCase(((char)br.read()));
         switch(ch12)
          {
              case 'A': System.out.println(ca);q++; break;
              case 'B': System.out.println(wa);obj.option();obj.total(); break;
              case 'C': System.out.println(wa);obj.option();obj.total(); break;
              case 'D': System.out.println(wa);obj.option();obj.total(); break;
              case 'F': obj.Flip(); break;
              case 'E': obj.Dip(); break;
              case 'Q':  System.out.println(" You Have Quitted the game, Thanks for playing KBC!!!!"); obj.total();  break;
              default : System.out.println(" You entered some other option! You lost the game!");obj.total(); break;
            }}

            if(q==11)
          {
          System.out.println("Your Twelveth Question is of Rs. "+score[q]);
          System.out.println("Q12. Name the first artificially created element on earth?");// question
          for(i=1;i<=30000000;i++){}
          System.out.println("A) Technicium");
          for(i=1;i<=30000000;i++){}
          System.out.println("B) Darmstadium");
          for(i=1;i<=30000000;i++){}
          System.out.println("C) Neobium");
          for(i=1;i<=30000000;i++){}
          System.out.println("D) Ununilium");
          for(i=1;i<=30000000;i++){}
          System.out.println();

          System.out.println("Enter 'E' for doube dip lifeline and 'F' for Flip IF YOU ARE not sure"); 
          System.out.println("DON'T USE LIFELINE IF YOU HAVE ALREADY USED IT as it will result in WRONG answer!");
          System.out.println("Lifeline(s) remaining-");
          if((e==0)&&(f==0))
          {
           System.out.println("Both");
           }
          if(e==0)
          {
           System.out.println("Double dip");
           }
          if(f==0)
          {
           System.out.println("Flip");
           }
           else
           {
            System.out.println("None");
            }
           char cha11=Character.toUpperCase(((char)br.read()));
          char ch13=Character.toUpperCase(((char)br.read()));
          switch(ch13)
          {
              case 'A': System.out.println(ca);q++; break;
              case 'B': System.out.println(wa);obj.option();obj.total(); break;
              case 'C': System.out.println(wa);obj.option();obj.total(); break;
              case 'D': System.out.println(wa);obj.option();obj.total(); break;
              case 'F': obj.Flip(); break;
              case 'E': obj.Dip(); break;
              case 'Q':  System.out.println(" You Have Quitted the game, Thanks for playing KBC!!!!"); obj.total();  break;
              default : System.out.println(" You entered some other option! You lost the game!");obj.total(); break;
            }}
            if(q==12)
          {
          System.out.println("Your Thirteenth Question is of Rs. "+score[q]);
          System.out.println("Q13. On which date did Urie Gagarin visit space?");// question
          for(i=1;i<=30000000;i++){}
          System.out.println("A) 12th September 1889");
          for(i=1;i<=30000000;i++){}
          System.out.println("B) 15th July 1999");
          for(i=1;i<=30000000;i++){}
          System.out.println("C) 1st October 1976");
          for(i=1;i<=30000000;i++){}
          System.out.println("D) 12th April 1967");
          for(i=1;i<=30000000;i++){}
          System.out.println();

          System.out.println("Enter 'E' for doube dip lifeline and 'F' for Flip IF YOU ARE not sure"); 
          System.out.println("DON'T USE LIFELINE IF YOU HAVE ALREADY USED IT as it will result in WRONG answer!");
          System.out.println("Lifeline(s) remaining-");
          if((e==0)&&(f==0))
          {
           System.out.println("Both");
           }
          if(e==0)
          {
           System.out.println("Double dip");
           }
          if(f==0)
          {
           System.out.println("Flip");
           }
           else
           {
            System.out.println("None");
            }
           char cha12=Character.toUpperCase(((char)br.read()));
          char ch14=Character.toUpperCase(((char)br.read()));
          switch(ch14)
          {
              case 'A': System.out.println(wa);obj.option();obj.total(); break;
              case 'B': System.out.println(wa);obj.option();obj.total(); break;
              case 'C': System.out.println(wa);obj.option();obj.total(); break;
              case 'D': System.out.println(ca);q++; break;
              case 'F': obj.Flip(); break;
              case 'E': obj.Dip(); break;
              case 'Q':  System.out.println(" You Have Quitted the game, Thanks for playing KBC!!!!"); obj.total();  break;
              default : System.out.println(" You entered some other option! You lost the game!");obj.total(); break; 
            }
        }
        
        else
        {
            System.out.println("Thank You!!!!!!!!!!!! Play Again!!!!!!!!!");
            System.out.println("Your have won Rs."+score[q-1]);
        }
    }
    void Dip()throws IOException          // function double dip
     {
     
           BufferedReader br=(new BufferedReader(new InputStreamReader(System.in)));  // Input Statement, to turn the Terminal window to Input Screen also 
                if (e<1)
               {
                   System.out.println("ENTER FIRST CHOICE");
                   char ch1=(char)br.read();
                   System.out.println();
                   
                   if(answer[q]==ch1)
                   {
                       System.out.println(ca);
                       
               q++;
            }
           else  {System.out.println("incorrect option");
            System.out.println("ENTER SECOND CHOICE");
             char ch20=(char)br.read();
            char ch2=(char)br.read();
                    if(answer[q]==ch2)
                   {
                       System.out.println(ca);
                       
               q++;
            }
        
            else
            {
            System.out.println(wa);
        }
        e++;//count
    }}
    else
    {
        System.out.println("You have used this option once");
    }
} 
   
    void Flip()throws IOException     // function flip
    {
     BufferedReader br=(new BufferedReader(new InputStreamReader(System.in)));  // Input Statement, to turn the Terminal window to Input Screen also 
          if (f<1)
          {
           System.out.println("  Who was the first person to born in Antarctica ");
           System.out.println(" A. Emino Palmer");
           System.out.println(" B. Mark Butcher");
           System.out.println(" C. Robert Edwin Perry");
           System.out.println(" D. Dave Bautista");
           char ans=(char)br.read();
           if(ans=='A')
           {
               System.out.println(ca);
               q++;
            }
            else
            {
                System.out.println(wa);
            }
        f++;//count
    }
    else
    {
         System.out.println("You have used this option once");
            }}
        void total() // to calcuate the cashprice won after quitting or wrong annswer 
         {
             if(score[q]<k)
             {
                  money=0; 
                
                }
                if(score[q]>=k)
                {
                   money=k;  // minimum cash=k
                }
            }
       void option() // function to print he correct option of each question
        {
         System.out.println("The correct option is"+answer[q]);
         }

        }
                
       
 



   
