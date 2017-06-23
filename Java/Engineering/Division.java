import java.io.*;
class Division {
  public static void main(String[] args)throws IOException
  {
  int a, b, result;
  // try block
  try 
  {
  BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
  System.out.println("Input two integers");
  a = Integer.parseInt(br.readLine());
  b = Integer.parseInt(br.readLine());
  result  = a / b;
  System.out.println("Result = " + result);
  }
  // catch block
  catch (ArithmeticException e) 
  {
   System.out.println("Exception caught: Division by zero.");
  }
  catch (NumberFormatException e)
  {
    System.out.println("Exception caught: Number Format Exception");  
  }
}
}
