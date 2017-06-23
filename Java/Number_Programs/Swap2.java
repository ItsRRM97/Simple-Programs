// swapping without using a third variable
class Swap2
{
public static void main()
{
int a=5;
int b=10;
a=a+b;
b=a-b;
a=a-b;
System.out.println("a="+a);
System.out.println("b="+b);
}
}