/*A shopping store which allows its customer to shop from its various showrooms*/
import java.io.*;
class Big
 {
   static double bill;
   static void Bigbazaar()throws IOException
    {
     String c;
     BufferedReader nn=new BufferedReader(new InputStreamReader(System.in));
     do
     {
       System.out.println("Welcome to the world of shopping");
       System.out.println("Take a look at the grand new stores of the complex");
       System.out.println("*********************************");
       System.out.println("********************\n\t 1.Garments\n**********************");
       System.out.println("*********************\n\t 2.Stationary items\n**************\n******************\n\t***************** 3.jewellery\n***************\n4.sports corner**************\n5.nokia gallary");
       System.out.println("Type the corresponding number for buying items...................1/2/3/4/5...."); 
       int ch;
       ch = Integer.parseInt(nn.readLine());
       if(ch==1)
       gar();
       if(ch==2)
       sta();
       else if(ch==3)
       jew();
       else if(ch==4)
       sports();
       else if(ch==5)
       cell();
       else
       System.out.println("wrong choice");
       System.out.println("to continue shopping....type'cont'.....or else ‘no’");
       c=nn.readLine();
       }while(c.equalsIgnoreCase("cont"));
       System.out.println("pay rs.........."+bill);
      }
       static void gar()throws IOException
       {
         BufferedReader nn=new BufferedReader(new InputStreamReader(System.in));
         String choice;
         int c;
        int n,r;
         do
         {
           System.out.println("Welcome to the world of garments");
           System.out.println("Enter 1 to buy ladies wear");
           System.out.println("Enter 2 to buy gents wear");
           
          System.out.println("enter choice");
           c=Integer.parseInt(nn.readLine());
           if(c==1)
          {System.out.println("1.cotton saree.............2.salwar suits");
        r=Integer.parseInt(nn.readLine());
        System.out.println("enter ur choice");
          if(r==1)
          {
            
           System.out.println("Each piece cost rs 800");
         System.out.println("how many pieces u want");
         n=Integer.parseInt(nn.readLine());
        if(n>200)
        System.out.println("So many items are not avilable");  
        else
        {System.out.println("You pay rs."+(n*800)+"for the saree a");
         bill=bill+800*n;
         System.out.println("Item has been added to your shopping list");
        }}
        else if(r==2)
        {
          System.out.println("Each piece cost rs 1000");
         System.out.println("how many pieces u want");
         n=Integer.parseInt(nn.readLine());
        if(n>200)
        System.out.println("So many items are not avilable");  
        else
        {System.out.println("You pay rs."+(n*1000)+"for the saree a");
         bill=bill+1000*n;
         System.out.println("Item has been added to your shopping list");
        }} } 
        else if(c==2)
        { System.out.println("1.jeans and shirts.............2.trousers and t-shirts");
        r=Integer.parseInt(nn.readLine());
        System.out.println("enter ur choice");
          if(r==1)
          {
         System.out.println("Each piece cost rs 1000");
         System.out.println("How many pieces you want");
n=Integer.parseInt(nn.readLine());
        if(n>200)
        System.out.println("So many items are not avilable");  
        else
        {System.out.println("You pay rs."+(n*1000)+"for the item");
         bill=bill+1000*n;
         System.out.println("Item has been added to your shopping list");
        }}
     if(r==2)
          {
         System.out.println("Each piece cost rs 2000");
         System.out.println("How many pieces you want");
n=Integer.parseInt(nn.readLine());
        if(n>200)
        System.out.println("So many items are not avilable");  
        else
        {System.out.println("You pay rs."+(n*2000)+"for the item");
         bill=bill+2000*n;
         System.out.println("Item has been added to your shopping list");
        }}
       }
       else
       System.out.println("Sorry, items ordered by you is not available");
       System.out.println("Press 3 to contiue buying garments...or else type 10");
       c=Integer.parseInt(nn.readLine()); 
        }while(c==3);
    }
static void sta()throws IOException
         {
          BufferedReader nn=new BufferedReader(new InputStreamReader(System.in));
           String choice;
           int c;
           do
            {
             int s;
             int n;
             System.out.println("Welcome to the world of stationary items");
             System.out.println("Enter 1 to buy perfume");
             System.out.println("Enter 2 to buy hair conditioners or shampoo");
             System.out.println("Enter your choice");
             s=Integer.parseInt(nn.readLine());
             if(s==1)
{
System.out.println("Each piece cost rs 200"); 
System.out.println("How many pens you need");

n=Integer.parseInt(nn.readLine());
        if(n>200)
        System.out.println("So many items are not avilable");  
        else
        {System.out.println("You pay rs."+(n*200)+"for the item");
         bill=bill+200*n;
         System.out.println("Item has been added to your shopping list");
        }}
else if(s==2)
{
System.out.println("Each piece cost rs 30");
System.out.println("How many pieces you want");
n=Integer.parseInt(nn.readLine());
        if(n>200)
        System.out.println("So many items are not avilable");  
        else
        {System.out.println("You pay rs."+(n*30)+"for the item");
         bill=bill+30*n;
         System.out.println("Item has been added to your shopping list");
        }}
System.out.println("Sorry, items ordered by you is not available");
System.out.println("Press 3 to contiue buying stationary items...or else type 10");
c=Integer.parseInt(nn.readLine());
}while(c==3);
}


static void jew()throws IOException
{

BufferedReader nn=new BufferedReader(new InputStreamReader(System.in));
int s;
do{
int c;
double n;
System.out.println("Welcome to the world of jewllery");
System.out.println("Enter 1 to buy gold earing");
System.out.println("Enter 2 to buy platinum chain");
System.out.println("enter choice");
c=Integer.parseInt(nn.readLine());
if(c==1)
{
System.out.println("Each piece cost rs 10000");
System.out.println("how many pieces u want");
n=Integer.parseInt(nn.readLine());
        if(n>200)
        System.out.println("So many items are not avilable");  
        else
        {System.out.println("You pay rs."+(n*10000)+"for the item");
         bill=bill+10000*n;
         System.out.println("Item has been added to your shopping list");
        }}

else if(c==2)
{
System.out.println("Each piece cost rs 30000");
System.out.println("how many pieces u want");
n=Integer.parseInt(nn.readLine());
        if(n>200)
        System.out.println("So many items are not avilable");  
        else
        {System.out.println("You pay rs."+(n*30000)+"for the item");
         bill=bill+30000*n;
         System.out.println("Item has been added to your shopping list");
        }}

else
System.out.println("Sorry, items ordered by you is not available");
System.out.println("Press 3 to contiue buying jewelleries ...or else type 10");
s=Integer.parseInt(nn.readLine());
}while(s==3);
}

static void sports()throws IOException
{
BufferedReader nn=new BufferedReader(new InputStreamReader(System.in));
int s;
do{
int c;
int n;
System.out.println("Welcome to the kids corner");
System.out.println("Enter 1 to buy bat/cricket ball/stump/gloves/helmet");
System.out.println("Enter 2 to buy football/shoes/gloves");
System.out.println("enter 3 to buy hockey sticks/rubber ball");
System.out.println("enter choice");
c=Integer.parseInt(nn.readLine());
if(c==1)
{
System.out.println("Each item cost rs 1000");
System.out.println("how many items u want");
n=Integer.parseInt(nn.readLine());
        if(n>200)
        System.out.println("So many items are not avilable");  
        else
        {System.out.println("You pay rs."+(n*1000)+"for the item");
         bill=bill+1000*n;
         System.out.println("Item has been added to your shopping list");
        }}

else if(c==2)
{
System.out.println("Each item cost rs 300");
System.out.println("how many item u want");
n=Integer.parseInt(nn.readLine());
        if(n>200)
        System.out.println("So many items are not avilable");  
        else
        {System.out.println("You pay rs."+(n*300)+"for the item");
         bill=bill+300*n;
         System.out.println("Item has been added to your shopping list");
        }}
else if(c==3)
{
System.out.println("Each item cost rs 400");
System.out.println("how many item u want");

n=Integer.parseInt(nn.readLine());
        if(n>200)
        System.out.println("So many items are not avilable");  
        else
        {System.out.println("You pay rs."+(n*400)+"for the item");
         bill=bill+400*n;
         System.out.println("Item has been added to your shopping list");
        }}

else
System.out.println("Sorry, items ordered by you is not available");
System.out.println("Press 4 to contiue buying sports items ...or else type10");
s=Integer.parseInt(nn.readLine());
}while(s==4);
}

static void cell()throws IOException
{
BufferedReader nn=new BufferedReader(new InputStreamReader(System.in));
int s;
do{
int c;
double n;
System.out.println("Welcome to the world of mobiles");
System.out.println("Enter 1 to buy nokia 5324 model,express music");
System.out.println("Enter 2 to buy nokia n8 model and nokia 1202 ");
System.out.println("enter 3 to buy nokia e63 and nokia n9 ");
System.out.println("enter choice");
c=Integer.parseInt(nn.readLine());
if(c==1)
{
System.out.println("Each cell cost rs 10000");
System.out.println("how many cell u want");
n=Integer.parseInt(nn.readLine());
        if(n>200)
        System.out.println("So many items are not avilable");  
        else
        {System.out.println("You pay rs."+(n*10000)+"for the item");
         bill=bill+10000*n;
         System.out.println("Item has been added to your shopping list");
        }}

else if(c==2)
{
System.out.println("Each cell cost rs 30000");
System.out.println("how many cell u want");
n=Integer.parseInt(nn.readLine());
        if(n>200)
        System.out.println("So many items are not avilable");  
        else
        {System.out.println("You pay rs."+(n*30000)+"for the item");
         bill=bill+30000*n;
         System.out.println("Item has been added to your shopping list");
        }}

else if(c==3)
{
System.out.println("Each cell cost rs 40000");
System.out.println("how many cell u want");
n=Integer.parseInt(nn.readLine());
        if(n>200)
        System.out.println("So many items are not avilable");  
        else
        {System.out.println("You pay rs."+(n*40000)+"for the item");
         bill=bill+40000*n;
         System.out.println("Item has been added to your shopping list");
        }}

else
System.out.println("Sorry, cell ordered by you is not available");
System.out.println("Press 4 to contiue buying  ...or else type 10");
s=Integer.parseInt(nn.readLine());
}while(s==4);
}
}