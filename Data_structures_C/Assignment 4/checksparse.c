#include<stdio.h>
int i,m,j,n;
//check if sparse 
  int check(int a1[5][3],int m1,int n1)
    {   
       int c=0;
         for(i=0;i<m1;i++)
          {for(j=0;j<n1;j++)
            {if(a1[i][j]==0)
              c++;
            }
          }
        if(c>(m1*n1)/2)
         { return 1;
         
         }
        else
         return 0;
    }
// convert into three tuple format
  void convert(int a2[5][3],int m2,int n2)
 { int c=0;int x=1;int o,p;int count=0;int b[100][3];
     
       for(i=0;i<m2;i++)
          {for(j=0;j<n2;j++)
           { if(a2[i][j]!=0)
              { b[x][0]=i;
                b[x][1]=j;
                 b[x][2]=a2[i][j];
                x++;
                count++;
              }
            }
          }b[0][0]=m2;
           b[0][1]=n2;
           b[0][2]=count;
        for(o=0;o<=count;o++)
          { for(p=0;p<3;p++)
           { printf("%d",b[o][p]);
           }printf("\n");
          }
           
void transpose(int b1[][3],int b2[][3])
{
    int i,j,k,n;
    b2[0][0]=b1[0][1];
    b2[0][1]=b1[0][0];
    b2[0][2]=b1[0][2];
    
    k=1;
    n=b1[0][2];
    
    for(i=0;i<b1[0][1];i++)
    {
        for(j=1;j<=n;j++)
        {
		
            //if a column number of current triple==i then insert the current triple in b2
            if(i==b1[j][1])
            {
                b2[k][0]=i;
                b2[k][1]=b1[j][0];
                b2[k][2]=b1[j][2];
                k++;
            }
}
}
}
void main()
{int i,j,m,n;
 printf("enter size of matrix");
  scanf("%d%d",&m,&n);
  int a[m][n];
  printf("enter the matrix to be checked");
  for(i=0;i<m;i++)
  {for(j=0;j<n;j++)
    {scanf("%d\t",&a[i][j]);
    }
    printf("\n");
  }
   int x=check(a,m,n);
  if(x==1)
  { printf("its a sparse matrix");
  }
   else
  { printf("not sparse");
  }
   
 convert(a,m,n);
        

}


