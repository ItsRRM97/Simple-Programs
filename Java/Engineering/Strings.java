import java.io.*;

class Strings
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String str1=br.readLine();
        System.out.println("Enter another String");
        String str2=br.readLine();
        if(str1.equalsIgnoreCase(str2))
        {
           System.out.println("True");
        }
        else
        {
             System.out.println("False");
        }
        String s="";
        int lstr1=str1.length();
        int lstr2=str2.length();
        // assuming lstr1>lstr2
        for(int i=0;i<lstr1-lstr2;i++)
        s=str1.substring(i,lstr2);
        if(s.equalsIgnoreCase(str2))
        {
            System.out.println(str2+" is present in"+str1);
        }
        else
        {
            System.out.println("Not present");
        }
        char ch; System.out.println(str1=" "+str1);
        for(int i=0;i<lstr1;i++)
        {
            ch=str1.charAt(i);
            if(ch==32)
            {
                ch++;
                System.out.println(ch);
            }
        }
        System.out.println(str1+" "+str2);
        s=str1.substring(2,5);
        System.out.println(s);
    }
}

    