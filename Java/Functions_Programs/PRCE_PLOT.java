// to find da price of a plot per sq.feet and discount also net price
class PRCE_PLOT
{
  public static void main(int l, int b)
  {
      int a=l*b;
      int p=150*a;
      int ntp=p-((10*p)/100);
      System.out.println("Total cost="+p);
      System.out.println("Net cost="+ntp);
    }
}

      
      