 

class perimeter
{
static double a ,b ;
perimeter (double aa,double bb )
{
a=aa;
b=bb;
}
static double peri ;
static double calculate( )
{peri = 2*(a+b);
return peri;
}
void show ()
{
System.out.println("lengt ="+a);
System.out.println("breadth="+b);
System.out.println( "perimeter="+peri);
}
}

public class area extends perimeter
{ double h; double ar;
area(double l ,double br ,double hh)
{
super (l,b);
h=hh;
b=br; ar=0.0;
}
double pe;
void doarea ()
{ pe = calculate();
  ar =b*h;
}
void show ()
{
super.show ();
System.out.println( "height ="+h);
System .out.println ( "area=" +ar );
}
}
