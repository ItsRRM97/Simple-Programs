package Number_Programs;

class LCM
{
   public static void main()
   {
       int a=12; int b=15; int c=20;
       int LCM=0; int i; int m; 
       for(i=1;;i++)
       {
           m=a*i;
           if(m%a==0&&m%b==0&&m%c==0)
           {
               LCM=m; break;
            }
        }
        System.out.println("LCM="+LCM);
    }
}