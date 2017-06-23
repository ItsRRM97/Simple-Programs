//wap to assign values to a 2 dimensionl array and print them
package Array_Programs;

class Array
{
   public static void main()
   {
       int i; int j;
       int ar[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
       for(i=0;i<5;i++)
       {
           for(j=0;j<4;j++)
           {
               System.out.print(ar[i][j]+"\t");
            }
            System.out.println();
        }
    }
}