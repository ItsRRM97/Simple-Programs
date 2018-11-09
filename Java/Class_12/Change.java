 
// ISC Question Using Recursion
import java.io.*;
class Change
{
   String str, newstr;
   static int len; char x;
   static Change ob=new Change();
   BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
   Change()
   {
       str=newstr="";
       len=0;
    }
    void inputWord()throws IOException
    {
	  	System.out.println("Enter Word");
	  	str=br.readLine();
	  	str=str.trim(); str=" "+str;
	  	len=str.length();
     }
     char caseConvert(char ch)
     {
         if(ch==' ') return x;
         else if(Character.isUpperCase(ch)==true)
         {
             return Character.toLowerCase(ch);
            }
            else
            {
                return Character.toUpperCase(ch);
            }
        }
        void recchange(int l)
        {
            if(l>=1)
            {
                char ch1=str.charAt(l-1);
                newstr=caseConvert(ch1)+newstr;
                recchange(l-1);
            }
        }
        void display()
        {
            System.out.println("Original Word ="+str);
            System.out.println("Toggled Case Word="+newstr);
        }
        public static void main()throws IOException
        {
            ob.inputWord();
            ob.recchange(len);
            ob.display();
        }
    }

            
         

   