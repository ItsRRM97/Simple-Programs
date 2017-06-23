class TypeCast
{
    public static void main()
    {
        int a=10;
        double b=10.25;
        float c=30.1234f;
        short d=12345;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        //type casting
        System.out.println((double)a);
        System.out.println((int)b);
        System.out.println((int)c);
        System.out.println((double)d);
        //type promotion
        System.out.println(a+b+c+d);
    }
}