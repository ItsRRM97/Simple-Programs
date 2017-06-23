package Array_Programs;

import java.io.*;
class Transpose
 {
     public static void main () throws IOException
      {
          BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
          System.out.println ("Enter dimensions");
          int x = Integer.parseInt (in.readLine());
          int y = Integer.parseInt (in.readLine());
          int ar[][] = new int [x][y];
          System.out.println ("Enter Matrix ");
          for (int i=0;i<x;i++)
           {
               for (int j=0;j<y;j++)
                {
                    ar[i][j] = Integer.parseInt (in.readLine());
                }
            }
          System.out.println ("Transpose of Matrix :");
          for (int i=0;i<y;i++)
           {
               for (int j=0;j<x;j++)
                {
                    System.out.print (ar[j][i]+" ");
                }
               System.out.println();
            }
        }
    }
