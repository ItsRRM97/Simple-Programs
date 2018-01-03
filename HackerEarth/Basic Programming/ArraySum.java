/* 
	You are given an array of integers of size . You need to print the sum of the elements in the array, keeping in mind that some of those integers may be quite large.

Input Format

The first line of the input consists of an integer . The next line contains space-separated integers contained in the array.

Output Format

Print a single value equal to the sum of the elements in the array.

Constraints

1<=N<=10 0<=a[i]<=10^10

*/

//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class ArraySum {
    public static void main(String args[] ) throws Exception {
        
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        long arr[] = new long[N];
        int i; long sum=0L;
        String s= br.readLine(); s=s.trim();
        
        Scanner sc = new Scanner(s).useDelimiter("\\s");
        for(i=0;i<N;i++) {
            arr[i]=sc.nextLong();
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
