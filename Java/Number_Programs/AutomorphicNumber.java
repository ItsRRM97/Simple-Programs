// to print and check if a given number is automorphic or not
class AutomorphicNumber
{
    public static void main(int n)
    {
        double c=1;
        int s=n*n;
        int i;
        for(i=1;i<=n;i++)
        {
        double t=(Math.pow(10,c));
        if(s%t==n)
        {
              System.out.println("It is a automorphic number");
              break;
          }
          else
          {
           System.out.println("It is not a automorphic number");    
         c++;
        }
        break;
    }
}
}