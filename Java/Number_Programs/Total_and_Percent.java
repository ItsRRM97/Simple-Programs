package Number_Programs;

// to print marks in 5 subjects and total and pecent
class Total_and_Percent
{
  public static void main(int m1, int m2, int m3, int m4, int m5)
  {
     double tot=m1+m2+m3+m4+m5;
     System.out.println("Total marks in 5 subjects are="+tot);
     double avg=tot/5;
     System.out.println("Average="+avg);
     double percent=(avg/80)*100;
     System.out.println("Percentage="+percent);
    }
}

      