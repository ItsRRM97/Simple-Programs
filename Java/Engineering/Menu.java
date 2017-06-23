import java.io.*;
class Menu
{
    static double a,b;
    void add()
    {
        System.out.println("Sum is : "+(a+b));
    }
    void substract()
    {
        System.out.println("Difference is : "+(a-b));
    }
    void multi()
    {
        System.out.println("Product is : "+(a*b));
    }
    void divide()
    {
        System.out.println("Division is : "+(a/b));
    }
    public static void main(String args[])throws IOException
    {
        int ch;
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter Two Numbers");
        a=Double.parseDouble(br.readLine());
        b=Double.parseDouble(br.readLine());
        Menu obj= new Menu();
        System.out.println("Enter Choice 1 for Add, 2 for Substract, 3 for Multiplication, 4 for Division");
        ch=Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1: obj.add(); break;
            case 2: obj.substract(); break;
            case 3: obj.multi(); break;
            case 4: obj.divide(); break;
            default: System.out.println("Wrong Choice");
        }
    }
}

         