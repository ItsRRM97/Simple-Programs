package Array_Programs;

import java.io.*;
class CircularMatrix
    {
        public static void main()throws IOException
        {
            BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
            System.out.print("Enter the number of elements : ");
            int n = Integer.parseInt(in.readLine());
            int ar[][]=new int[n][n];
            int k=1, c1=0, c2=n-1, r1=0, r2=n-1;
            while(k<=n*n)
                {
                    for(int i=c1;i<=c2;i++)
                     
                        ar[r1][i]=k++;
                     
                    for(int j=r1+1;j<=r2;j++)
                     
                        ar[j][c2]=k++;
                     
                    for(int i=c2-1;i>=c1;i--)
                     
                        ar[r2][i]=k++;
                     
                    for(int j=r2-1;j>=r1+1;j--)
                     
                        ar[j][c1]=k++;
                     
                    c1++;
                    c2--;
                    r1++;
                    r2--;
                }
            System.out.println("The Circular Matrix is:");
            for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)
                        {
                            System.out.print(ar[i][j]+ "\t");
                        }
                    System.out.println();
                }
          }
    }
