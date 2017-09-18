/* Anu has been given N numbers consisting of positive 
integers. He has to find and print the product of all 
the number in this array Modulo 10^9+7. You have to help 
Anu to find the product and print it. */

import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    long prod = 1L;
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    int N = Integer.parseInt(br.readLine());
	    int arr[] = new int[N];
	    int i;
	   for(i=0; i < N; i++)
	   {
	       arr[i] = Integer.parseInt(br.readLine());
	   }
	  for(i=0; i <N; i++)
	   {
	       prod = prod * arr[i];
	   }
	  long out = prod%(long)(Math.pow(10,9)+7);
	  System.out.println(out);
	}
}

 