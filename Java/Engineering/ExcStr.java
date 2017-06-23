class ExcStr
{
    public static void main()
    {
        try
        {
            String s=null;
            System.out.println(s.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("Exception caught: Size of String is null");
        }
}
}