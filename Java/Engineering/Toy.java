import java.io.*;
public class Toy
{
    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
    String item_name="";
    double price=0.0;
    int qty=0;
    double total=0.0;
    public void input()throws IOException
    {
        System.out.println("Enter Item You want to purchase");
        item_name=br.readLine();
        System.out.println("Enter Item Price");
        price=Double.parseDouble(br.readLine());
        System.out.println("Enter Item Quantity");
        qty=Integer.parseInt(br.readLine());
    }
    public double calculate()throws IOException
    {
        total=qty*price;
        return total;
    }
        public void display()
    {
        System.out.println("Item Name : "+item_name);
        System.out.println("Item Quantity :"+qty);
        System.out.println("Item Price :"+price);
        System.out.println("Total Price :"+total);
    }
    public static void main()throws IOException
    {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter No of Items You want to Purchase");
        int n;
        n=Integer.parseInt(br.readLine());
        double grand=0.0;
        Toy obj[]=new Toy[n];
        for(int i=0;i<n;i++)
        {
            obj[i]=new Toy();
            obj[i].input();
            grand=grand+obj[i].calculate();
            obj[i].display();
        }
        System.out.println();
        System.out.println("Grand Total :"+grand);
    }
}


    

    
    