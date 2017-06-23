package Series_Programs;
class Series
{
   public static void main(int x, int n)
   {
       int i,j; double ac=0.0; int d=0; double nu=0;
       for(i=1;i<=n;i++)
       {
           nu=Math.pow(x,i);
           for(j=1;j<=i;j++)
           {
               d=d+j;
            }
            ac=ac+(nu/d);
        }
        System.out.println(ac);
    }
}

       
        