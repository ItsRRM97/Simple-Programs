 

// WAP to accept numbers and print it average using scanner class
import java.util.*;
class ScanNum
{
   public static void main(String x) // always accepts input as string
   {
       Scanner sc= new Scanner(x);
       int n; int c=0; int s=0;
       while(sc.hasNextInt()) //here it checks after a deliminatior if any integer exists
       {
           n=sc.nextInt(); // here it is storing the integer into n
           c=c+1; s=s+n;
        }
        int av=s/c;
        System.out.print("Average="+av);
        sc.close();
        }   
    }