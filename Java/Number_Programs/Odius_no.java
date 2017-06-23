// WAP to input a number and check if it is an Odious Number
class Odius_no
{
   public static void main(int n)
   {
       String y=""; int c=0;
       while(n!=0)
       {
           int d=n%2;
           String x=Integer.toString(d);
           y=x+y;
           n=n/2;
        }
        System.out.println(y);
        char ch; int i; int l=y.length();
        for(i=0;i<l;i++)
        {
            ch=y.charAt(i);
            if(ch=='1')
            {
                c++;
            }
        }
            if(c%2==0)
            {
                System.out.println("It is not an odious no");
            }
            else if(c%2==1)
            {
                 System.out.println("It is an odious no");
                }
            }
        }
    
    
           
       