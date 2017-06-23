#include<stdio.h>

int i,m,j,k,l,n;
void merge(int a[],int b[],int m1,int n1)
{   int z=m1+n1;
    int c[z];
    for(i=0;i<m1;i++)
  
     {c[i]=a[i];
     }
   
 for(k=0;k<n1;k++)
  { c[i++]=b[k];
  } printf("the concatenated array is");
  for(l=0;l<z;l++)
  {
  printf("%d \t",c[l]);
  }
}
void main()
{ printf("enter the size of arrays");
   scanf("%d%d",&m,&n);
   int a[m];int b[n];
  printf("enter two arrays ");
  for(i=0;i<m;i++)
   {scanf("%d",&a[i]);
   }
  for(j=0;j<n;j++)
  {scanf("%d",&b[j]);
  }
  merge(a,b,m,n);
}
  
