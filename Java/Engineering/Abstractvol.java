//this prog shows the use of abstract class
import java.io.*;
abstract class p9
{double x;double y;
 
 p9(double m,double n)
{x=m;y=n;
}
abstract double volume();
}
class cone extends p9
{ cone(double a,double b)
	{ super(a,b);
	}
 
 double volume()
 {System.out.println("volume of cuboid");
  return 1.33*3.14*x*x*y;
 }
}
class cylinder extends p9
{ cylinder(double a,double b)
    {super(a,b);
	}
 
 double volume()
 {System.out.println("volume of cylinder");
  return 3.14*x*x*y;
 }
}
class Abstractvol
{   public  static void main(String[] args) 
	{//p9 s=new p9(5,10)
	cone c1=new cone(5.22,7.89);
    cylinder c2=new cylinder(1.22,5.89);
    p9 s;
    s=c1;
    System.out.println("volume " +s.volume());
    s=c2;
    System.out.println("volume " +s.volume());
 }
}
 