package Class_12;

import java.io.*;
class Record //superclass
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String name[];
        int rnk[];
        
        Record()
        {
            name = new String[50];
            rnk = new int[50];
        }
        
        void readvalues()throws IOException
        {
            System.out.println("*** Inputting The Names And Ranks ***");
            for(int i=0;i<50;i++)
            {
                System.out.print("Enter name of student "+(i+1)+" : ");
                name[i]=br.readLine();
                System.out.print("Enter his rank : ");
                rnk[i]=Integer.parseInt(br.readLine());
            }
        }
        
        void display()
        {
            System.out.println("NamettRank");
           System.out.println("-------tt-------"); //this is just for styling the output. You can skip it !
            for(int i=0;i<50;i++)
            {
                System.out.println(name[i]+"tt"+rnk[i]);
            }
        }
    } //end of superclass Record
 
class Rank extends Record //subclass
    {
        int index;
        
        Rank()
        {
            super(); //invoking the constructor of superclass
            index = 0;
        }
        
        void highest()
        {
            int min = rnk[0];
            for(int i=0;i<50;i++)
            {
                if(rnk[i]<min)
                {
                    index = i;
                }
            }
        }
        
        void display()
        {
            super.display(); //calling the superclass function display()
            System.out.println("nTop most rank = "+rnk[index]);
            System.out.println("Student with topmost rank = "+name[index]);
        }
    } //end of subclass Rank
 
 
public class Demo
    {
        public static void main()throws IOException
        {
            Rank ob=new Rank(); //creating object of subclass
            ob.readvalues(); //calling radvalues() function of superclass to input the names and ranks
            ob.highest(); //calling the function highest() for finding index of topmost rank
            System.out.println("*** Output ***");
            ob.display(); //calling display() function of subclass
        }
    }
