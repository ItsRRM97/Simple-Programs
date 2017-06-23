package Number_Programs;

class Factors
{
   public static void main(int a)
   {
       int i;
       for(i=2;i<=a;i++)
       {
           if(a%i==0) 
           System.out.println(i);
        }
    }
}