package Number_Programs;

// to find da price of an article
class Price
{
   public static void main(int i, int r, int q)
   {
       int a=r*q;
       double nt=a-((10*a)/100);
       System.out.println("Item No. is "+a);
       System.out.println("Rate=Rs "+r);
       System.out.println("Quantity="+q);
       System.out.println("Price="+a);
       System.out.println("Netprice is "+nt);
    }
}
