import java.io.*;
class ArrayExc
{
    public static void main()throws IOException
    {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int a[]=new int[5];
        int i;
    try
    {    
        for(i=0;i<10;i++)
        {
            System.out.println("Enter Integer");
            a[i]=Integer.parseInt(br.readLine());
        }
    }
    catch(ArrayIndexOutOfBoundsException E)
    {
        System.out.println("Exception caught: Array Index Out Of Bounds");
    }
}
}