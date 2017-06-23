
import java.io.*;
public class megafile
{  String x,y,z,d;
	  String g1,f1;
	  boolean k;
	  int a,c,b;
	  InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
    RandomAccessFile obj1,obj,o;
    RandomAccessFile obj2;
	public void file()
	{
	  try
	  {//Sytem.out
	    System.out.println("Enter the file u want to read from:");
	    x=br.readLine();
	    String a=new String("io");

	    File f=new File(x+".txt");
		  k=f.exists();
		  if(k)
		   {
					System.out.println("file exists \r\n");
		      obj1=new RandomAccessFile(x+".txt","rw");
           long k=obj1.length();
           int pp=(int)k;
           byte b[]=new byte[pp];

           obj1.read(b,0,pp);
		       System.out.println(new String(b));
		       obj1.close();
		       z=new String(b);
		       RandomAccessFile o=new RandomAccessFile("kunman.txt","rw");
		       o.write(z.getBytes());
		       copy1();
		   }
		  else
		   {
				 create2();
		 }
		}
		catch(Exception e)
		{
		}

 }
//create 2 for creating the file
		public void create2()
		{
			try
		 {
		    System.out.println("file does not exists! do u want to create it?(y=1/n=0)");
		    g1=br.readLine();
	      a=Integer.parseInt(g1);
		    b=1;
		    if(a==b)
               {System.out.println("Please enter data into the file:\r\n");
								 z=br.readLine();
							   obj=new RandomAccessFile(x+".txt","rw");
                 obj.write(z.getBytes());
                 obj.close();
                 copy2();
							 }
	     else
		          {
                System.out.println("Bye");
				     }
		  }
		  catch(Exception eu)
		  {}
		}
     //for existing file
     public void copy1() throws Exception
     {String g,f;
			 System.out.println("do u want to copy the data into another file(y=1/n=0)");
       g=br.readLine();
  	 	 int  a=Integer.parseInt(g);
		   int  b=1;
		   if(a==b)
		    {	System.out.println("Where do u want to copy");
			 	    f=br.readLine();
					  obj2=new RandomAccessFile(f+".txt","rw");
					  obj2.write(z.getBytes());
					   System.out.println("The file has been copied and its content are:\r\n"+z);
				 }
		 }
  //copy2 for created file
  public void copy2() throws Exception
  {String g,f;
			 System.out.println("do u want to copy the data into another file(y=1/n=0)");
       g=br.readLine();

			 	     //System.out.println("file ="+y);
			 int		    a=Integer.parseInt(g);
			 		    //System.out.println("file ="+a);
		   int  b=1;
		   if(a==b)
		    {	System.out.println("Where do u want to copy");
			 	    f=br.readLine();
					  System.out.println("The file has been copied and its content are:\r\n"+z);
					  obj2=new RandomAccessFile(f+".txt","rw");
					  obj2.write(z.getBytes());
				 }
	}
		public static void main(String args[])
		{
	    megafile ff=new megafile();
	    ff.file();
		}
}