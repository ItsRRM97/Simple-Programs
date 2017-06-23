// wap to input a string and a substring and print how many times the given substring occours in a string 
class SubString
{
   public static void main(String x, String subs)
   {
       x=x.trim(); subs=subs.trim(); int i; int f=0;
       int lst=x.length(); int start=0;
       int lsub=subs.length();
       for(i=0;i<lst;i++)
       {
           String str=x.substring(start,lsub);
           if(str.equalsIgnoreCase(subs))
           {
               f++; str=""; start=i;
            }
        }
System.out.println("Frequency of Substring="+f); 
}
}