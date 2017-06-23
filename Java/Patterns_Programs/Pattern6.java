package Patterns_Programs;

// to print the pattern as in void main
class Pattern6
{
public static void main()
    {int i; int j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(j%2==0)
                {
                System.out.print("#");
            }else
            {
              System.out.print("*");   
            }}
        System.out.println();
    }
    }
}

