// TO CALCULATE THE SALARY OF A PERSON
class Salarycalculus
{
  public static void main( int sal)
  {
      double da=(sal*40)/100;
      double hra=(sal*25)/100;
      double pf=(sal*12)/100;
      double ntsal=(sal+hra+da)-pf;
      System.out.println("Name is Roshan");
      System.out.println("Net Salary="+ntsal);
    }
}
