//eror
import java.io.*;
class C7Q1
{
   public static void main()throws IOException
   {
       int i; int j; String tmp="",tem="";
       BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
       String st[]=new String[28];  String cap[]=new String[28];
       for(i=0;i<28;i++)
       {     
           System.out.println("Enter State and city name");
           st[i]=br.readLine();
           cap[i]=br.readLine();
        }
       System.out.println("Enter 1 to enter state name and search city capital and 2 for city name and state search");
       int ch=Integer.parseInt(br.readLine());
       switch(ch)
       {
           case 1: System.out.println("Enter the State Name");
           String s=br.readLine();
           for(i=0;i<28;i++)
                   {
                       if(s.equalsIgnoreCase(st[i]))
                       {
                           System.out.println(cap[i]);
                        }
                    }
                    break;
           case 2: String temp="";
           for(i=0;i<27;i++)
           {
               for(j=0;j<27;i++)
               {
                   if(st[j].compareTo(st[j+1])>0)
                   {
                       tmp=st[j];    tem=cap[j];
                       st[j]=st[j+1]; cap[j]=cap[j+1];
                       st[j+1]=tmp;  cap[j]=tem;
                    }
                }
           System.out.println("Enter city name"); int pos=-1;
           String c=br.readLine(); int mid=0; int lb=0,ub=27; mid=(ub+lb)/2;
           while((lb<=ub)&&pos==-1);
           {
               if(c.equalsIgnoreCase(cap[mid]))
               {
                  pos=mid+1;
                  System.out.println(st[i]);
                }
                else if(c.compareTo(cap[mid])>0)
                {
                   lb=mid+1;
                }
                else
                {
                    ub=mid-1;
                }
            }
            }
            break;
        }
    }
}
       