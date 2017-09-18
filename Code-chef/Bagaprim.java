/*
Baga boy who works under Jethalel is bad in mathematics which is not good for Jethalel's business.
 So Mr. Bhide , a school teacher, decided to teach him prime numbers. After teaching all about 
 prime numbers Mr. Bhide gave Baga a task which is as follows : Bhide will give Baga a range 
 [ L , R ] and Baga has to answer the count of all the prime numbers lying in that range. 
 Help Baga find the number of prime numbers lying in the given range. */

 import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int i; long j,k; int flag = 0; int count = 0;
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    long L[] = new long[T];
	    long R[] = new long[T];
	    for(i = 0; i < T; i++) {
	        L[i] = Long.parseLong(br.readLine());
	        R[i] = Long.parseLong(br.readLine());
	    }
	    for( i = 0; i < T; i++)
	    {
	        for ( j = L[i]; j <= R[i]; j ++)
	        {
	            for ( k = 2; k < j; k ++) {
	                if(j % k == 0)
	                {
	                    flag = 1;
	                    break;
	                }
	            }
	            if (flag == 0)
	            {
	                count++;
	                
	            }
	            else {
	                flag = 0;
	            }
	        }
	        System.out.println(count);
	        count = 0;
	    }
	}
} 