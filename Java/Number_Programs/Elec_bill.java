package Number_Programs;

//to find da electricity bill from a meter
class Elec_bill
{
   public static void main(double i, double f)
   {
       double ec=f-i;
       double pr=(ec*1.40);
       System.out.println("Total charge= Rs."+pr);
    }
}
