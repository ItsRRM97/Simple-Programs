import java.io.*;
class Q2{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter string : ");
        String str = br.readLine().trim();
        System.out.print("Sorted string : ");
        for(int i=0;i<26;i++)
            for(int j=0;j<str.length();j++)
                if(str.charAt(j)==('A'+i)||str.charAt(j)==('a'+i))
                    System.out.print(str.charAt(j));
    }
}