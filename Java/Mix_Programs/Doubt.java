class Doubt
{
   public static void main()
   {
       String x="RoshanRajMishra"; String a=x.toUpperCase();
       char ch[]=a.toCharArray();
       int i; char temp;
       for(i=0;i<a.length();i++)
       {
           if(ch[i]>=ch[i+1])
           {
               temp=ch[i];
               ch[i]=ch[i+1];
               ch[i+1]=temp;
        }
    }
     for(i=0;i<a.length();i++)
     {
         System.out.println(ch[i]);
}
}
}