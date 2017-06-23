package Series_Programs;

// to print da series 1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5+...n)
class Series1
{
   public static void main(int n)
  {
      int i,j,s=0;
      for(i=1;i<=n;i++)
      {
          for(j=1;j<=i;j++)
          {
              s=s+j;
            }
        }
    System.out.println("Answer="+s);
    }
}

      