package Patterns_Programs;

// to print the pattern as follows as in output...using charAt
class chatAt_pattern2
{
   public static void main()
   {
       String a="LOYOLA SCHOOL";
       int l=a.length();
       int i,j; char ch;
       {
           for(i=0;i<l;i++)
           {
               for(j=l-1;j>=i;j--)
                   {
                       ch=a.charAt(j);
                       System.out.print(ch);
                    }
                    System.out.println();
                }
            }
        }
    }
