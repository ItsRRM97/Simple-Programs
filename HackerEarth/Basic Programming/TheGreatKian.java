/*
    The great Kian is looking for a smart prime minister. He's looking for a guy who can solve the OLP (Old Legendary Problem). OLP is an old problem (obviously) that no one was able to solve it yet (like P=NP).

But still, you want to be the prime minister really bad. So here's the problem:

Given the sequence a1, a2, ..., an find the three values a1 + a4 + a7 + ..., a2 + a5 + a8 + ... and a3 + a6 + a9 + ... (these summations go on while the indexes are valid).

Input
The first line of input contains a single integer n (1 ≤ n ≤ 105).

The second line contains n integers a1, a2, ..., an separated by space (1 ≤ ai ≤ 109).

Output
Print three values in one line (the answers).
*/
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
 
class TheGreatKian {
    public static void main(String args[] ) throws Exception {
        
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine()); long a=0L; long b=0L; long c=0L; int m=0;
        if(N%3==1){ m=2; }
        if(N%3==2) { m=1; }
        long t=N+m;
        long arr[] = new long[N+m];
        int i,j,k; long sum=0L;
        String s= br.readLine(); s=s.trim();
        
        Scanner sc = new Scanner(s).useDelimiter("\\s");
        for(i=0;i<N;i++) {
            arr[i]=sc.nextLong();
        }
        if (m==2) {
            arr[N]=0L; arr[N+1]=0L;
        }
        else {
            arr[N]=0L;
        }
        for(i=0,j=1,k=2;i<N;i=i+3,j=j+3,k=k+3) {
            a = a+arr[i];
            b = b+arr[j];
            c = c+arr[k];
        }
        System.out.println(a+" "+b+" "+c);
    }
}