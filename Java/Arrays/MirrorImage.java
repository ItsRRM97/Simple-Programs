package Array_Programs;

import java.io.*;
class MirrorImage
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
          System.out.println ("Mirror Image of Matrix :");
          for (int i=0;i<x;i++)
           {
               for (int j=y-1;j>=0;j--)
                {
                    System.out.print (ar[i][j]+" ");
                }
               System.out.println ();
            }
        }
    }
