package Functions_Programs;

import java.io.*;
class Choices
{
  void Area()throws IOException
      {       
          BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
          System.out.println("Enter Length");
          int l=Integer.parseInt(br.readLine());
          System.out.println("Enter Breadth");
          int b=Integer.parseInt(br.readLine());
          int A=l*b;
          System.out.println("Area="+A);
        }
       
void Perimeter()throws IOException
    {     
        BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter Length");
        int l1=Integer.parseInt(br.readLine());
        System.out.println("Enter Breadth");
        int b1=Integer.parseInt(br.readLine());
        int P=2*(l1+b1);
        System.out.println("Perimeter="+P);
       }
void Diagonal()throws IOException
{
  BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
  System.out.println("Enter Length");
  int l2=Integer.parseInt(br.readLine());
  System.out.println("Enter Breadth");
  int b2=Integer.parseInt(br.readLine());
  double d=Math.sqrt((l2*l2)+(b2*b2));
  System.out.println("Diagonal="+d);
}
public static void main()throws IOException
{
  Choices o= new Choices();
  System.out.println("Enter 1 to print area");
  System.out.println("Enter 2 to print perimeter");
  System.out.println("Enter 3 to print diagonal");
  {
    BufferedReader br=new BufferedReader( new InputStreamReader(System.in)); 
    int ch=Integer.parseInt(br.readLine());
    switch(ch)
      {
      case 1:o.Area();
      break;
      case 2:o.Perimeter();
      break;
      case 3:o.Diagonal();
      break;
      default:System.out.println("Wrong Choice");
      break;
    }
}
}
}
