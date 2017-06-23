package Number_Programs;

// printing the first ten numbers of the fibonacci series 
class Fibonacci
{
  public static void main()
  {
      int a=0;
      int b=1;
      int c=0;
      int i;
      System.out.println(a);
      System.out.println(b);
      for(i=3;i<=10;i++)
      {
         c=a+b;
         System.out.println(c);
         a=b;
         b=c;
        }
    }
}

      