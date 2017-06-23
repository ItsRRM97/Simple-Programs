package Number_Programs;

// to print the fiest 30 elements of tribonacci series
class Tribonacci
{
    public static void main()
    {
        int i;
        int a=0,b=1,c=1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        for(i=1;i<=27;i++)
        {
        int d=a+b+c;
        System.out.println(d);
        a=b;
        b=c;
        c=d;
    }
}
}
