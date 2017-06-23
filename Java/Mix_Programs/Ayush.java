import java.io.*;
    class Ayush
    {
        double bill;
        public static void main() throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            Ayush obj = new Ayush();
            System.out.println("********************Welcome to Hotel 'Q'sh********************");
            obj.welcome();
            System.out.println("Thanks for visiting... Hope So You Liked Our Service");
            
        }
          
     void welcome()throws IOException
    {
        BufferedReader kk=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What are you interested in doing?");
        System.out.println();
        System.out.println("1.Lodging");
        System.out.println("2.Resturant");
        System.out.println("3.Ice cream parlour");
        System.out.println("4.Creamy Custard");
        System.out.println("5.Pastry Plaza");
        System.out.println("6.Refreshing Beverages");
        System.out.println("7.Hall Booking");
        System.out.println("8.Other Interest");
        System.out.println("9.Bill");
        System.out.println();
        System.out.println("Input Your Choice?");
        int a=Integer.parseInt(kk.readLine());
        switch(a)
        {
            case 1:
            lodging();
            break;
            
            
            case 2:
            resturant();
            break;
            
            case 3:
            icecream();
            break;
            
            case 4:
            creamy_custard();
            break;
            
            case 5:
            pastry_plaza();
            break;
            
            case 6:
            beverages();
            break;
            
                        
            case 7:
            hall_booking();
            break;
            
            case 8:
            other_interest();
            break;
            
            
            case 9:
            bill();
            break;
            
            default:
            System.out.println("Sorry facility not available!>>>>>>>>>>choose again!");
            welcome();
            
        }
    }
    void lodging()throws IOException
    {
        BufferedReader kk= new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Choose your lodging style");
        System.out.println();
        System.out.println("1-A/c deluxe suit room- Rs 4500 per day ");
        System.out.println("2-A/c suit- Rs 4000 per day");
        System.out.println("3-Cottage- Rs 3800 per day");
        System.out.println("4-Non A/c room- Rs 3200 per day");
        System.out.println();
        System.out.println("Enter your choice");
        int a=Integer.parseInt(kk.readLine());
        switch(a)
        {
            case 1:
            System.out.println("A/c deluxe suit room");
            System.out.println("for how many days?");
            n=Integer.parseInt(kk.readLine());
            System.out.println();
            bill=bill+(4500*n);
            break;
            
            case 2:
            System.out.println("A/c suit room");
            System.out.println("for how many days?");
            n=Integer.parseInt(kk.readLine());
            System.out.println();
            bill=bill+(4000*n);
            break;
            
            case 3:
            System.out.println("Cottage");
            System.out.println("For how many days");
            n=Integer.parseInt(kk.readLine());
            System.out.println();
            bill=bill+(bill*n);
            break;
            
            case 4:
            System.out.println("Non A/c room");
            System.out.println("For how many days?");
            n=Integer.parseInt(kk.readLine());
            System.out.println();
            bill=bill+(bill*n);
            break;
            
            default:
            System.out.println("sorry invalid choice!.....please input again!");
            lodging();
            break;
        }
        welcome();
    }
    void resturant()throws IOException
    {
        BufferedReader kk=new BufferedReader(new InputStreamReader(System.in));
        int a;
        System.out.println("WELCOME TO 'Q'sh RESTURANT");
        System.out.println();
        System.out.println("Which type of food would you prefer?");
        System.out.println("1.Indian");
        System.out.println("2.Chineese");
        System.out.println("3.Thai");
        System.out.println("4.Mexcian");
        System.out.println();
        System.out.println("Enter your Choice ");
        a=Integer.parseInt(kk.readLine());
        switch(a)
        {
            case 1:
            indian();
            break;
            
            case 2:
            chineese();
            break;
            
            case 3:
            thai();
            break;
            
            case 4:
            mexican();
            break;
            
            default:
            System.out.println("sorry invalid choice!.......input again!");
            resturant();
        }
    }
    void indian()throws IOException
    {
        BufferedReader kk=new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("What would you like to have?");
        System.out.println();
        System.out.println("0.To End The Order");
        System.out.println("1-Kesar Pulao-Rs 80");
        System.out.println("2-Coconut Rice -Rs 65");
        System.out.println("3-Mutton Biryani-Rs 250");
        System.out.println("4-Chicken  Biryani-Rs 210");
        System.out.println("5-Dal Nawabi-Rs 45");
        System.out.println("6-Chana Dal Payasam-Rs 45");
        System.out.println("7-Kulcha-Rs 7");
        System.out.println("8-Butter naan-Rs 14");
        System.out.println("9-Malai Kofta-Rs 65");
        System.out.println("10-Fish dopiaza-Rs 80");
        System.out.println("11-Palak paneer-Rs 70");
        System.out.println("12-Chicken Butter Masala-Rs 130");
        System.out.println("13-Paneer Butter Masala-Rs 110");
        System.out.println();
        int a=1;
        while(a!=0)
        {
        System.out.println("Enter Your Choice");
        a=Integer.parseInt(kk.readLine());
        switch(a)
        {
            case 0:
            break;
            
            case 1:
            System.out.println("Kesar Pulao");
            System.out.println("Enter number of plates");
            n=Integer.parseInt(kk.readLine());
            System.out.println();
            bill=bill+(n*80);
            break;
            
            case 2:
            System.out.println("Coconut Rice ");
            System.out.println("Enter number of plates");
            n=Integer.parseInt(kk.readLine());
            System.out.println();
            bill=bill+(n*65);
            break;
            
            case 3:
            System.out.println("Mutton Biriyani");
            System.out.println("Enter number of plates");
            n=Integer.parseInt(kk.readLine());
            System.out.println();
            bill=bill+(n*250);
            break;
            
            case 4:
            System.out.println("Chicken Biriyani");
            System.out.println("Enter number of plates");
            n=Integer.parseInt(kk.readLine());
            System.out.println();
            bill=bill+(n*210);
            break;
            
            case 5:
            System.out.println("Dal Nawabi");
            System.out.println("Enter number of plates");
            n=Integer.parseInt(kk.readLine());
            System.out.println();
            bill=bill+(n*45);
            break;
            
            case 6:
            System.out.println("6-Chana Dal Payasam");
            System.out.println("Enter number of plates");
            n=Integer.parseInt(kk.readLine());
            System.out.println();
            bill=bill+(n*45);
            break;
            
            case 7:
            System.out.println("Kulcha");
            System.out.println("How many do you want");
            n=Integer.parseInt(kk.readLine());
            System.out.println();
            bill=bill+(n*7);
            break;
            
            case 8:
            System.out.println("Butter naan");
            System.out.println("How many do you want?");
            n=Integer.parseInt(kk.readLine());
            System.out.println();
            bill=bill+(n*14);
            break;
            
            case 9:
            System.out.println("Malai Kofta");
            System.out.println("Enter number of plates");
            n=Integer.parseInt(kk.readLine());
            System.out.println();
            bill=bill+(n*65);
            break;
            
            case 10:
            System.out.println("Fish Do-piaza");
            System.out.println("Enter number of plates");
            n=Integer.parseInt(kk.readLine());
            System.out.println();
            bill=bill+(n*80);
            break;
            
            case 11:
            System.out.println("Palak paneer ");
            System.out.println("Enter number of plates");
            n=Integer.parseInt(kk.readLine());
            System.out.println();
            bill=bill+(n*70);
            break;
            
            case 12:
            System.out.println("Chicken Butter masala");
            System.out.println("Enter number of plates");
            n=Integer.parseInt(kk.readLine());
            System.out.println();
            bill=bill+(n*130);
            break;
            
            case 13:
            System.out.println("Paneer Butter Masala");
            System.out.println("Enter number of plates");
            n=Integer.parseInt(kk.readLine());
            System.out.println();
            bill=bill+(n*110);
            break;
            
            default:
            System.out.println("sorry invalid choice!..............choose again!");
            System.out.println();
            indian();
        }
    }
    welcome();
}
     void chineese()throws IOException
    {
        BufferedReader kk=new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Welcome to Tangy Chinese");
        System.out.println();
        System.out.println("Enter your choice");
        System.out.println();
        System.out.println("0.End your order");
        System.out.println("1-Veg fried rice-Rs 55");
        System.out.println("2-Chicken fried rice-Rs 75");
        System.out.println("3-Veg Chowmin-Rs 65");
        System.out.println("4-Chicken Chowmin-Rs 85");
        System.out.println("5-Chilli paneer-Rs 70");
        System.out.println("6-Paneer 65-Rs 70");
        System.out.println("7-Chilli chicken-Rs 75");
        System.out.println("8-Garlic chicken-Rs 80");
        System.out.println("9-Chilli prawn-Rs 85");
        System.out.println("10-Prawn Hongkong-Rs 95");
        int a=1;
        while(a!=0)
        {
            System.out.println("Enter your choice");
            a=Integer.parseInt(kk.readLine());
            switch(a)
            {
                case 0:
                break;
                
                case 1:
                System.out.println("Veg fried rice");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*55);
                break;
                
                case 2:
                System.out.println("Chicken Fried Rice");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*75);
                break;
                
                case 3:
                System.out.println("Veg Chowmin ");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*65);
                break;
                
                case 4:
                System.out.println("Chicken Chowmin");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*85);
                break;
                
                case 5:
                System.out.println("Chilli Paneer ");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*70);
                break;
                
                case 6:
                System.out.println("Paneer 65");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*70);
                break;
                
                case 7:
                System.out.println("Chilli Chicken");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*75);
                break;
                
                case 8:
                System.out.println("Garlic Chicken");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*80);
                break;
                
                case 9:
                System.out.println("Chilli Prawn");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*85);
                break;
                
                case 10:
                System.out.println("Prawn HongKong ");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*95);
                break;
                
                default:
                System.out.println("sorry invalid choice!........choose again!");
                System.out.println();
                chineese();
            }
        }
        welcome();
    }
         void thai()throws IOException
        {
            BufferedReader kk=new BufferedReader(new InputStreamReader(System.in));
            int n;
        System.out.println("Welcome to Thai section");
        System.out.println();
        System.out.println("Enter your choice");
        System.out.println("0.End your order");
        System.out.println("1-Thai Red Curry-Rs 120");
        System.out.println("2-Chicken Satay-Rs 125");
        System.out.println("3-Thai Chicken and Rice Soup-Rs 110");
        System.out.println("4-Thai Fried Rice-Rs 105");
        System.out.println("5-Mushroom Thai Pulao-Rs 100");
        System.out.println("6-Spicy Minced Chicken with Mint and Toasted Rice-Rs 140");
        System.out.println("7-Thai Noodle Salad-Rs 80");
        int a=1;
        while(a!=0)
        {
            System.out.println("Enter your choice");
            a=Integer.parseInt(kk.readLine());
            switch(a)
            {
                case 0:
                break;
                
                case 1:
                System.out.println("Thai red curry");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*120);
                break;
                
                case 2:
                System.out.println("Chicken satay");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*125);
                break;
                
                case 3:
                System.out.println("Thai chicken & rice soup");
                System.out.println("Enter number of bowls");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*110);
                break;
                
                case 4:
                System.out.println("Thai fried rice");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*105);
                break;
                
                case 5:
                System.out.println("Thai mushroom pulao");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*100);
                break;
                
                case 6:
                System.out.println("Spicy minched chicken with mint and roasted  rice");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*140);
                break;
                
                case 7:
                System.out.println("Thai noodle salad");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*80);
                break;
                
                default:
                System.out.println("sorry ivalid choice!>>>>>>>>choose again!");
                System.out.println();
                thai();
            }
        }
        welcome();
    }
    void mexican()throws IOException
    {
        BufferedReader kk=new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Welcome to Mexican Meals");
        System.out.println();
        System.out.println("Enter your choice");
        System.out.println("0-End your order");
        System.out.println("1-Mexican Beans and Rice-Rs 75");
        System.out.println("2-Nachos with Mustard Cheese Sauce-Rs 105");
        System.out.println("3-Enchiladas-Rs 95");
        System.out.println("4-Mexican Tacos-Rs 115");
        System.out.println("5-Tasty Lentil Tacos-Rs 120");
        System.out.println("6-Smothered Mexican Lasagna-Rs 90");
        System.out.println("7-Absolute Mexican Cornbread-Rs 75");
        System.out.println("8-Acapulco Chicken-Rs 130");
        System.out.println("9-Albondigas-Rs 135");
        System.out.println("10-Albuquerque Delight-Rs 155");
        int a=1;
        while(a!=0)
        {
            System.out.println("Enter your choice");
            a=Integer.parseInt(kk.readLine());
            switch(a)
            {
                case 0:
                break;
                
                case 1:
                System.out.println("Mexican Beans & Rice");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*75);
                break;
                
                case 2:
                System.out.println("Nachos with Mustard Cheese Sauce");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*105);
                break;
                
                case 3:
                System.out.println("Enchiladas");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*95);
                break;
                
                case 4:
                System.out.println("Mexican Tacos");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*115);
                break;
                
                case 5:
                System.out.println("Tasty Lentil Tacos");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*120);
                break;
                
                case 6:
                System.out.println("Smothered Mexican Lasagma");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*90);
                break;
                
                case 7:
                System.out.println("Absolute Mexican Corn Bread");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*75);
                break;
                
                case 8:
                System.out.println("Acapulco Chicken ");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*130);
                break;
                
                case 9:
                System.out.println("Albondigas");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*135);
                break;
                
                case 10:
                System.out.println("Albuquerque Delight");
                System.out.println("Enter number of plates");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*155);
                break;
                
                default:
                System.out.println("sorry invalid choice !>>>>>>>>>>>>choose again!");
                System.out.println();
                mexican();
            }
        }
        welcome();
    }
      void icecream() throws IOException
    {
        BufferedReader kk=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to 'Q' sh Ice-Cream parlour");
        System.out.println();
        System.out.println("Which ice-cream would you like to take and please mention number scoops ?");
        System.out.println("0.END of order");
        System.out.println("1.Butterscotch");
        System.out.println("2.Chocolate");
        System.out.println("3.Blackcurrent");
        System.out.println("4.Kesar Pista");
        System.out.println();
        
        int a=1;int n;
        while(a!=0)
        {
           System.out.println("Enter your choice");
            a=Integer.parseInt(kk.readLine());
            switch(a)
            {
                case 0 : break;
                case 1:
                System.out.println("Butterscotch");
                System.out.println("No. of scoops?");
                n= Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(50*n);break;
                
                case 2 : 
                System.out.println("Chocolate");
                System.out.println("No. of scoops?");
                n= Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(50*n);break;
                
                case 3 : 
                System.out.println("Blackcurrent");
                System.out.println("No. of scoops?");
                n= Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(50*n);break;
                
                case 4 :
                System.out.println("Kesar Pista");
                System.out.println("No. of scoops?");
                n= Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(50*n);
                break;
                
                default :
                System.out.println("Wrong choice .. . pls enter again");
                System.out.println();
                icecream();
            }
        }
        welcome();
    }
     void creamy_custard()throws IOException
    {
        BufferedReader kk=new BufferedReader(new InputStreamReader(System.in));
        int a,n;
        System.out.println("Welcome to Creamy custards");
        System.out.println();
        System.out.println("0.End of order");
        System.out.println("1-Strawberry-Rs 80");
        System.out.println("2-Chocolate-Rs 90");
        System.out.println("3.Banana split-Rs105");
        System.out.println("4.'Q'sh special custard-Rs 120");
        System.out.println();
         a=1;
        while(a!=0)
        {
        System.out.println("Enter your choice");
            a=Integer.parseInt(kk.readLine());
        switch(a)
        {
            case 0:
            break;
            
            case 1:
            System.out.println("Strawberry");
            System.out.println("Enter number of bowls");
            n=Integer.parseInt(kk.readLine());
            System.out.println();
            bill=bill+(n*80);
            break;
            
            case 2:
            System.out.println("Chocolate");
            System.out.println("Enter number of bowls");
            n=Integer.parseInt(kk.readLine());
            System.out.println();
            bill=bill+(n*90);
            break;
            
            case 3:
            System.out.println("Banana split");
            System.out.println("Enter number of bowls");
            n=Integer.parseInt(kk.readLine());
            System.out.println();
            bill=bill+(n*105);
            break;
            
            case 4:
            System.out.println("'Q' sh special custard");
            System.out.println("Enter number of bowls");
            n=Integer.parseInt(kk.readLine());
            System.out.println();
            bill=bill+(n*120);
            break;
            
            default:
            System.out.println("sorry invalid choice!>>>>>>>>>>>>>choose again!");
            System.out.println();
            creamy_custard();
        }
    }
            welcome();
        }
         void pastry_plaza()throws IOException
        {
            BufferedReader kk=new BufferedReader(new InputStreamReader(System.in));
            int a,n;
            System.out.println("Welcome to Pastry Plaza");
            System.out.println();
            System.out.println("0.end of order");
            System.out.println("1-Choco balls-Rs 37");
            System.out.println("2-Black forest-Rs 40");
            System.out.println("3-Strawberry stream-Rs 50");
            System.out.println("4.Dark chocolate-Rs 56");
            System.out.println();
            a=1;
            while(a!=0)
            {
            System.out.println("Enter your choice");
            a=Integer.parseInt(kk.readLine());
            switch(a)
            {
                case 0:
                break;
                
                case 1:
                System.out.println("Choco balls");
                System.out.println("How many do you want?");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*37);
                break;
                
                case 2:
                System.out.println("Black forest");
                System.out.println("How many do you want?");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*40);
                break;
                
                case 3:
                System.out.println("Strawberry stream");
                System.out.println("How many do you want?");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*50);
                break;
                
                case 4:
                System.out.println("Dark chocolate");
                System.out.println("How many do you  want?");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*56);
                break;
                
                default:
                System.out.println("sorry invalid choice!<<<<<<<<<<<<<choose again!");
                System.out.println();
                pastry_plaza();
            }
        }
            welcome();
        }
         void beverages()throws IOException
        {
            BufferedReader kk=new BufferedReader(new InputStreamReader(System.in));
            int a,n;
            System.out.println("Welcome to Beans beverages");
            System.out.println();
            System.out.println("0.End of order");
            System.out.println("1-Sprite-Rs 18");
            System.out.println("2-Diet-coke-Rs 57");
            System.out.println("3-Scotch-Rs 1080");
            System.out.println("4-Sparkling White Vine-Rs 1399");
            System.out.println("5-Cream Tea-Rs 25");
            System.out.println("6-Capuccino-Rs 72");
            System.out.println();
            a=0;
            while(a!=0)
            {
            System.out.println("Enter your choice");
            a=Integer.parseInt(kk.readLine());
            switch(a)
            {
                case 0:
                break;
                
                case 1:
                System.out.println("Sprite");
                System.out.println("How many?");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*18);
                break;
                
                case 2:
                System.out.println("Diet-coke");
                System.out.println("How mnay?");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*57);
                break;
                
                case 3:
                System.out.println("Scotch");
                System.out.println("How many?");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*1080);
                break;
                
                case 4:
                System.out.println("Sparkling White vine");
                System.out.println("How many ?");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*1399);
                break;
                
                case 5:
                System.out.println("Cream-tea");
                System.out.println("How many cup?");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*25);
                break;
                
                case 6:
                System.out.println("Capuccino");
                System.out.println("How many ?");
                n=Integer.parseInt(kk.readLine());
                System.out.println();
                bill=bill+(n*72);
                break;
                
                default:
                System.out.println("sorry invalid choice!.............choose again!");
                System.out.println();
                beverages();
            }
            }
            welcome();
        }
         void hall_booking()throws IOException
        {
            BufferedReader kk=new BufferedReader(new InputStreamReader(System.in));
            int n;
            System.out.println("Welcome to hall booking counter");
            System.out.println("Which Hall Do You Want To Book");
            System.out.println();
            System.out.println("0-Exit");
            System.out.println("1-conventional hall 1 -Rs12000per day");//for conference and meetings
            System.out.println("2-conventional hall 2 -Rs10000per day");//for conference and meetings
            System.out.println("3-saturn hall-Rs7000per day");//for  parites
            System.out.println("4-Garden-Rs 6500 per day");//for parties
            System.out.println("5-jupiter hall-Rs 6000per day");//for parties
            System.out.println();
            System.out.println("Enter your choice");
            int a=Integer.parseInt(kk.readLine());
            switch(a)
            {
                case 0:
                break;
                
                case 1:
                System.out.println("Conventional hall 1");
                System.out.println("For how many days?");
                n=Integer.parseInt(kk.readLine());
                bill=bill+(n*12000);
                break;
                
                case 2:
                System.out.println("Conventional hall 2");
                System.out.println("For how many days?");
                n=Integer.parseInt(kk.readLine());
                bill=bill+(n*10000);
                break;
                
                case 3:
                System.out.println("Staurn hall");
                System.out.println("For how many days?");
                n=Integer.parseInt(kk.readLine());
                bill=bill+(n*7000);
                break;
                
                case 4:
                System.out.println("Garden");
                System.out.println("For how many days?");
                n=Integer.parseInt(kk.readLine());
                bill=bill+(n*6500);
                break;
                
                case 5:
                System.out.println("Juptier hall");
                System.out.println("for how many days?");
                n=Integer.parseInt(kk.readLine());
                bill=bill+(n*6000);
                break;
                
                default:
                System.out.println("sorry invalid choice !>>>>>>>>>>>>>>choose again!");
                System.out.println();
                hall_booking();
            }
            welcome();
        }
        void other_interest()throws IOException
        {
            BufferedReader kk=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("If you are delighted by our service then you can have more fun with the following activities");
            System.out.println();
            System.out.println("1-Swimming");
            System.out.println("2-Fittness Gym");
            System.out.println("3-Spa");
            System.out.println("4-Night Club");
            System.out.println("0-exit");
            System.out.println();
            System.out.println("Enter your choice ");
            int a=Integer.parseInt(kk.readLine());
            switch(a)
            {
                case 1:
                swimming();
                break;
                
                case 2:
                gym();
                break;
                
                case 3:
                spa();
                break;
                
                case 4:
                club();
                break;
                
                case 0:
                break;
                
                default :
                System.out.println("sorry invalid choice ! >>>>>>>>>>>>choose again!");
                System.out.println();
                other_interest();
                break;
            }
        }
        void swimming()throws IOException
        {
            BufferedReader kk=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("1.Rs. 150 for 1 day");
        System.out.println("2.Rs.1200 for 10 days");
        System.out.println("Enter your choice");
        int a= Integer.parseInt(kk.readLine());
        switch(a)
        {
            case 1 : 
            System.out.println("Enter number of people");
            int n=Integer.parseInt(kk.readLine());
            bill=bill+(n*150);
            break;
            
            case 2 :
            System.out.println("Enter number of people");
            n=Integer.parseInt(kk.readLine());
            bill=bill+(n*1200);
            break;
            
            default :
            System.out.println("Wrong choice");
            swimming();
        }
        welcome();
    }
     void gym() throws IOException
    {
       BufferedReader kk=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1.Rs. 100 for 1 day");
        System.out.println("2.Rs.950 for 10 days");
        System.out.println("Enter your choice");
        int a= Integer.parseInt(kk.readLine());
        switch(a)
        {
            case 1 :
            System.out.println("Enter number of people");
            int n=Integer.parseInt(kk.readLine());
            bill=bill+(n*150);
            break;
            
            case 2 :
            System.out.println("Enter number of people");
            n=Integer.parseInt(kk.readLine());
            bill=bill+(n*1200);
            break;
            
            default :
            System.out.println("Wrong choice");
            gym();
        }
        welcome();
    }
     void spa()throws IOException
    {
        BufferedReader kk=new BufferedReader(new InputStreamReader(System.in));
        int a,n;
        System.out.println("Welcome to Soothing Spa");    
        System.out.println("1-Thermal Spa-Rs 3000");
        System.out.println("2-Ayurveda Spa-Rs 3200");
        System.out.println("3-Medical Spa-Rs 2800");
        System.out.println("4-Thalassotherapy Spa-Rs 3500");
        System.out.println("5-Relaxation and Pampering Spa-Rs 2500");
        System.out.println();
        System.out.println("Enter your choice");
        a=Integer.parseInt(kk.readLine());
        switch(a)
        {
            case 1:
            System.out.println("Enter number of people");
            n=Integer.parseInt(kk.readLine());
            bill=bill+(n*3000);
            break;
            
            case 2:
            System.out.println("Enter number of people");
            n=Integer.parseInt(kk.readLine());
            bill=bill+(n*3200);
            break;
            
            case 3:
            System.out.println("Enter number of people");
            n=Integer.parseInt(kk.readLine());
            bill=bill+(n*2800);
            break;
            
            case 4:
            System.out.println("Enter number of people");
            n=Integer.parseInt(kk.readLine());
            bill=bill+(n*3500);
            break;
            
            case 5:
            System.out.println("Enter number of people");
            n=Integer.parseInt(kk.readLine());
            bill=bill+(n*2500);
            break;
            
            default:
            System.out.println("sorry invalid choice!..............choose again!");
            spa();
        }
        welcome();
    }
     void club()throws IOException
    {
        BufferedReader kk=new BufferedReader(new InputStreamReader(System.in));
        int a,n;
        System.out.println("WELCOME TO TDS");
        System.out.println();
        System.out.println("1-Disco-Rs 1000");
        System.out.println("2-Disco with unlimited beer-Rs 2500");
        System.out.println("3-Disco with unlimited beer and kebab-Rs 5000");
        System.out.println();
        System.out.println("Enter your choice");
        a=Integer.parseInt(kk.readLine());
        switch(a)
        {
            case 1:
            System.out.println("Enter number of people");
            n=Integer.parseInt(kk.readLine());
            bill=bill+(n*1000);
            break;
            
            case 2:
            System.out.println("Enter number of people");
            n=Integer.parseInt(kk.readLine());
            bill=bill+(n*2500);
            break;
            
            case 3:
            System.out.println("Enter number of people");
            n=Integer.parseInt(kk.readLine());
            bill=bill+(n*5000);
            break;
            
            default:
            System.out.println("sorry invalid choice!>>>>>>>>>>>>choose again!");
            club();
        }
        welcome();
    }
     void bill()
    {
        if(bill==0)
        {
            System.out.println("Thanks for visiting ............Do visit again");
        }
        else
        {
            bill=bill+(0.10*bill);
            System.out.println("Your total expenses amounts to :: " + bill);
        }
    }
}
        
