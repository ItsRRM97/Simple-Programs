 

class seriesSum
{
  int x ;
  int n ;
  double sum;
   seriesSum(int xx,int nn)
  {
  x =xx;
  n=nn;
  sum=0.0;
  }
double findfact (int m )
{ double fac=0.0 ;
if( m>2)
{
fac=m*findfact(m-1);
return fac ;
}
else return 1;
}
double findpower ( int a,int y )
{  double pow=0 ;
if( y >0)
{
pow = a *findpower (a, y-1 );
return pow;
}else return 1;
}
void calculate ()
{double xp ,xf;
while(n>1)
{
xp = findpower (x,n);
xf = findfact (n-1);
n =n-2;
sum =sum+xp/xf;
}
}
void display ()
{
System.out.println("sum ="+ sum ) ;
}
public static void main ( int l , int m )
{ seriesSum o=new seriesSum(l,m);
o.calculate();
o.display();
}
}







