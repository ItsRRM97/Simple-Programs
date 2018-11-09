 
//program to generate tribonacci series upto n terms using recursive technique 
class Tribo
{
    static int c;
    static int trib(int n) //Recursive function generating the 'nth' term of tribonacci Series
    {
        if(n<=1) return 0;
        else if(n==2) return 0;
        else if(n==3) return 1;
        else return (trib(n-1)+trib(n-2)+trib(n-3));
    }
    public static void main(int num) //Function generating all the tribonacci Series numbers upto 'n' terms 
    { 
        System.out.println("The Fibonacci Series is:");
        for(int i=1;i<=num;i++) 
        {
            c=trib(i); 
            System.out.print(c+" ");
        }
    }
}