package String_Programs;

// to shift the character by 3 places
class Charshift
{
   public static void main()
   {
       String a="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; int e=0;
       int i; char ch,nc=' '; int l=a.length();
       for(i=0;i<l;i++)
       {
           ch=a.charAt(i);
           int asc=ch;
           int p=asc+3;
           if(p>90)
           {
           e=p-91;
           p=65+e;
        }
           nc=(char)p;
           System.out.print(nc); 
        }
        
    }
}

           
       