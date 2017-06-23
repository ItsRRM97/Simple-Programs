package Number_Programs;

// to print the reverse of a number
class Reverse_number
{
  public static void main(int n)
  {
      int d=0,a=0;
      while(n!=0)
      {
          a=n%10;
          d=(d*10)+a;
          n=n/10;
        }
        
    System.out.println(d);
}
}

