package Array_Programs;

import java.io.*;
class Multiply
 {
     public static void main () throws IOException
      {
          BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
          System.out.println ("Enter dimensions");
          int n = Integer.parseInt (in.readLine());
          int ar1[][] = new int [n][n];
          int ar2[][] = new int [n][n];
          int ar3[][] = new int [n][n];
          int x=0,y=0;
          System.out.println ("Enter Matrix 1");
          for (int i=0;i<n;i++)
           {
               for (int j=0;j<n;j++)
                {
                    ar1[i][j] = Integer.parseInt (in.readLine());
                }
            }
          System.out.println ("Enter Matrix 2");
          for (int i=0;i<n;i++)
           {
               for (int j=0;j<n;j++)
                {
                    ar2[i][j] = Integer.parseInt (in.readLine());
                }
            }
          for (int i=0;i<n;i++)
           {
               for (int j=0;j<n;j++)
                {
                    for (int k=0;k<n;k++)
                     {
                         ar3[i][j] = ar3[i][j] + (ar1[i][k]*ar2[k][j]);
                        }
                    }
                }
          for (int i=0;i<n;i++)
            {
               for (int j=0;j<n;j++)
                {
                    System.out.print (ar3[i][j]+" ");
                }
               System.out.println ();
            }
        }
    }

