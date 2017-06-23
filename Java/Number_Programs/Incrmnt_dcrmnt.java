// to find da output of da following
class Incrmnt_dcrmnt
{
  public static void main()
  {
      int a=5;
      int b=7;
      boolean a4=a++ * b++ > b++ - a++;
      boolean a5=a-- * b-- > --b +a;
      char m='A';
      int n=8;
      System.out.println(a++ + b++ + ++b + ++a);
      System.out.println(a++ - --a + b-- + ++b);
      System.out.println(--a + --b + b++ + a++ +7);
      System.out.println(a+=a++ + b++ - --a + --b +b);
      System.out.println(a4);
      System.out.println(a5);
      System.out.println(b-=b++ - --b + b-- + a++);
      System.out.println(a++ + b-- - --b + --a + b++);
      System.out.println(a++ + b-- + b++ + ++a -b);
      System.out.println(a++ + b++ - b-- + b++ +a);
      System.out.println(a++ * b++ + a++ - --a);
      System.out.println(--b + b-- + a++ - --a +b);
      System.out.println(a++ - --a + b++ - b--);
      System.out.println(b-- + --b + a++ - --b +7);
      System.out.println(7+ a++ -5 + b++ -a);
      System.out.println(m+n);
      System.out.println(a++ +8 + b++ + --b +10);
      System.out.println(++a - b++ - --b + ++a);
      System.out.println(a++ - b-- +8 - --b +a);
      System.out.println(a++ + b++ +7 - --b +7);
      System.out.println(a-- - --b + b++ + b++);
      System.out.println(a-- + b++ + b++ - --b + a++ + b++ + a++);
      System.out.println(a+=2+ a++ + 2 * b++ + b++);
      System.out.println(a++ +8 + b++ * 2 + b--);
      System.out.println(--a + b++ - --a +17);
    }
}
