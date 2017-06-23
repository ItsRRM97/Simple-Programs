package Number_Programs;

// calculating the electricity bill using SLAB METHOD
class Electricbill
{
  public static void main(int u)
  {
      double bl=0.0d;
      if(u<=50)
      {
          bl=u*2.60;
          System.out.println("Bill="+bl);
        }
        if((u>50)&&(u<=150))
        {
            bl=((50*2.60)+((u-50)*3.90));
            System.out.println("Bill="+bl);
        }
        if(u>150)
        {
            bl=((50*2.60)+(100*3.90)+((u-150)*5.80));
            System.out.println("Bill="+bl);
        }
    }
}
