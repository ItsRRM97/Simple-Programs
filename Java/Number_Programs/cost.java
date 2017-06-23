package Number_Programs;

// to input item rate and find quantity and cost also da discount if price is above 1000
class cost
{
   public static void main(int r, int q)
   {
       int cost=q*r;
       double pr;
       if (cost>1000)
       pr=(90*cost)/100;
       else 
       pr=cost;
       System.out.println("Total cost="+pr);
       
   }
}

       