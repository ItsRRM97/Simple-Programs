import java.io.*;
class Q1{
    public static void main(String args[])throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int ctr=0;
        System.out.print("Enter first string : ");
        String s1 = br.readLine().trim();
        System.out.print("Enter second string : ");
        String s2 = br.readLine().trim();
        System.out.println("1. Is the strings equal? "+ s1.equals(s2));
        for(int i=0;i<s1.length()-s2.length();i++)
                if(s1.substring(i,s2.length()).equals(s2))
                    ctr++;
        if(ctr!=0)
            System.out.println("2. Does contain");
        else
            System.out.println("2. Does not contain");
        System.out.print("3. Initials are : ");
        for(int i=0;i<s1.length();i++)
            if(s1.charAt(i)==' ')
                System.out.print(s2.charAt(i+1)+" ");
        System.out.println();
        System.out.println("4. Concated string : " + s1+s2);
        String a=s1.substring(2, 5);
        System.out.println("5. Cut string : "+ a);
    }
}