import java.io.*;
class InvMarks extends Exception
{
public void message()
{
System.out.println("Invalid Marks");
}
}
class Students
{
public static void main(String as[])throws Exception
{
BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
int m=0;
try
{
System.out.println("Enter Marks:");
m=Integer.parseInt(br.readLine());
if(m>100 || m<0)
{
throw new InvMarks();
}
System.out.println("Your Marks:"+m);
}
catch(InvMarks e)
{
e.message();
}
}
}