package Patterns_Programs;

// to print the pattern as in output
class Pattern1
{
   public static void main()
   {
       int i,j;
       for(i=1;i<=5;i++)
       {
           for(j=1;j<=i;j++)
           {
               System.out.print(j);
            }
            System.out.println();
        }
    }
}
