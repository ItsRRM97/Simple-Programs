//Write a program to input a number and print its Roman Equivalent
class Roman_No
{
   public static void main(int n)
   {
       int i; int df;
       if(n>0&&n<=10)
       {
          if(n>=1&&n<=3)
          {
               for(i=1;i<=n;i++)
               {
                   System.out.print("I");
                }
            }
            else if(n>3&&n<=5)
                {
                    df=5-n;
                    for(i=1;i<=df;i++)
                    {
                    System.out.print("I");
                }
                    System.out.print("V");
                }
            else if(n>5&&n<9)
                {
                    System.out.print("V");
                    df=n-5;
                    for(i=1;i<=df;i++)
                    {
                        System.out.print("I");
                    }
                }
           else if(n>8&&n<=10)
              {
                  df=10-n;
                  for(i=1;i<=df;i++)
                  {
                      System.out.print("I");
                    }
                    System.out.print("X");
                }
            }
        }
    }
    
           
                
                
                
                   
                   
                