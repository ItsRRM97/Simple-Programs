// WAP to print the pattern as in output
class Pattern7
{
   public static void main()
   {
       int i,j,k; int z=0;
       for(i=5;i>=1;i--)
       {
           z++;
           for(j=1;j<=i;j++)
           {
               System.out.print(" ");
            }
            for(k=1;k<=z;k++)
            {
                System.out.print(z+" ");
            }
            System.out.println();
        }
    }
}
