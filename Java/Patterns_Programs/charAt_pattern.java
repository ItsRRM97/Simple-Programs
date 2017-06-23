package Patterns_Programs;

// To print a string pattern as in output.. library function
class charAt_pattern
{
   public static void main()
   {
       String a="LOYOLA SCHOOL";
       int i,j; char ch;
       int l=a.length();
       {
           for(i=0;i<l;i++)
           {
               for(j=0;j<=i;j++)
               {
                   ch=a.charAt(j);
                   System.out.print(ch);
                }
                System.out.println();
            }
        }
    }
}
              