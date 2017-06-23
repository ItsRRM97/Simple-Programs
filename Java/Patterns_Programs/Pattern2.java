package Patterns_Programs;

// to print the pattern as given in output
class Pattern2
{
   public static void main()
   {
       int i,j;
       for(i=1;i<=5;i++)
       {
           for(j=5;j>=i;j--)
           {
               System.out.print(j);
            }
            System.out.println();
        }
    }
}
