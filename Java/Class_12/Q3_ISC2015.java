 
/**
* The class Q3_ISC2015 inputs a sentence, converts the first letter of each word to
* uppercase and find the number of vowels and consonants
* @author : www.guideforschool.com
* @Program Type : BlueJ Program - Java
* @Question Year : ISC Practical 2015 Question 3
*/
  
import java.util.*;
class Q3_ISC2015
{
    int countVowel(String s) // Function to count no. of vowels in a word
    {
        s = s.toUpperCase();
        int count = 0;
        char ch;
        for(int i=0; i<s.length(); i++)
        {
            ch = s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                count++;
            }
        }
        return count;
    }
      
    String convert(String s) // Function to convert 1st character to UpperCase
    {
        char ch = s.charAt(0); // Extracting the first character
        ch = Character.toUpperCase(ch); // Converting that character to UpperCase
        String f = ch + s.substring(1); // Adding it with the rest of the string
        return f;
    }
     
    String addSpace(String s, int max) // Function for addng extra space to make every word equal in length
    {
        int x = max-s.length();
        for(int i=1; i<=x; i++)
        {
            s = s+" ";
        }
        return s;
    }
      
    public static void main(String args[])
    {
        Q3_ISC2015 ob = new Q3_ISC2015();
        Scanner sc=new Scanner(System.in);
          
        System.out.print("Enter a sentence : ");
        String s=sc.nextLine();
        int l = s.length();
        char last = s.charAt(l-1); // Extracting the last character
           
        /* Checking whether the sentence ends with '.' or '?' or not */
        if(s.endsWith(".")==false || s.endsWith("?")==false)
        {
            System.out.println("Invalid Input. End a sentence with either '.' or '?'");
        }
        else
        {
            StringTokenizer str = new StringTokenizer(s," .?");
            int x = str.countTokens();
            String ans="";
            String word[]=new String[x];
            int vow, con, max=0;
              
            for(int i=0; i<x; i++)
            {
                word[i] = str.nextToken(); // Extracting words and saving them in an array
                ans = ans + " " + ob.convert(word[i]);
                if(word[i].length()>max)
                {
                    max = word[i].length();
                }
            }
            System.out.println("Sentence = "+ans.trim());
             
            String y=ob.addSpace("Word",max);
            System.out.println(y+"\tVowels\tConsonant");
            for(int i=0; i<x; i++)
            {
                vow = ob.countVowel(word[i]);
                con = word[i].length()-vow; // Consonant = Length - Vowel
                y = ob.addSpace(word[i],max);
                System.out.println(y+"\t"+vow+"\t"+con);
            }
        }
    }
}

