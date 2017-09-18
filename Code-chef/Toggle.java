import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public.
You have been given a String S consisting of uppercase and lowercase
 English alphabets. You need to change the case of each alphabet in 
 this String. That is, all the uppercase letters should be converted 
 to lowercase and all the lowercase letters should be converted to 
 uppercase. You need to then print the resultant String to output. */
class Toggle
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String S = br.readLine();
		String toggle = "";
		S = S.trim();
		char ch; int i;
		for (i = 0; i < S.length(); i++) {
		    ch = S.charAt(i);
		    if(ch >= 65 && ch <= 90)
		    {
		        char c = Character.toLowerCase(ch);
		        toggle = toggle + c;
		    }
		    else
		    {
		        char c = Character.toUpperCase(ch);
		        toggle = toggle + c;
		    }
		}
		System.out.println(toggle);
	}
}
 