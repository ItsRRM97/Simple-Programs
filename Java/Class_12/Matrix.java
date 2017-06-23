package Class_12;
import java.io.*;
class Matrix
{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   int m,n; 
   int i,j;
   Matrix(int mm, int nn)
   {
       m=mm;
       n=nn;
    }
   int arr[][]=new int[m][n];
   void fillarray()throws IOException
   {
       System.out.println("Enter Elements");
       for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=Integer.parseInt(br.readLine());
            }
        }
    }
   Matrix SubMat(Matrix A)
    {
       Matrix B=new Matrix(m,n);
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                B.arr[i][j]=arr[i][j]-A.arr[i][j];
            }
        }
        return B;
    }
        void display()
        {
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
        }
    }
    public static void main(int x, int y)throws IOException
    {
        Matrix A=new Matrix(x,y);
        Matrix B=new Matrix(x,y);
        Matrix C=new Matrix(x,y);
        A.fillarray();
        B.fillarray();
        C=A.SubMat(B);
        C.display();
    }
}