// WAP to find are of a square rectngle nd triangle also circle using the concept of function overloading
package Functions_Programs;

import java.io.*;
class Area
    {
    
       void area(int s)
       {
           int a=s*s;
           System.out.println("AREA of the square is="+a);
        }
        void area(int l,int b)
        {
            int ar=(l*b);
            System.out.println("AREA of rectangle is="+ar);
        }
        void area(long ba,long h)
        {
            double are=(ba*h)/2;
            System.out.println("AREA of triangle="+are);
        }
        void area(double r)
        {
            double area=3.14*r*r;
            System.out.println("AREA of circle="+area);
        }
public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Side Of a Square");
        int a=Integer.parseInt(br.readLine());
        System.out.println("Enter Length and Breadth of a rectngle");
        int l1=Integer.parseInt(br.readLine());
        int b2=Integer.parseInt(br.readLine());
        System.out.println("Enter base and heigght of a triangle");
        long bz=Long.parseLong(br.readLine());
        long h1=Long.parseLong(br.readLine());
        System.out.println("Enter radius of a circle");
        double r1=Double.parseDouble(br.readLine());
        Area o=new Area();
        o.area(a);
        o.area(l1,b2);
        o.area(bz,h1);
        o.area(r1);
    }
}

        