// WAP to input a number and print its octal equivalent
class Octal_Equi
{
   public static void main(int n)
   {
       int i; String y="";
       while(n!=0)
       {
           int d=n%8;
           String x=Integer.toString(d);
           y=x+y;
           n=n/8;
        }
        System.out.println("Octal Equivalent="+y);
    }
}
    