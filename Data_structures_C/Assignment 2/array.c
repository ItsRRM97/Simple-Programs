#include<stdio.h>
void sum(int arr[],int p)
{
  int x,i,avg;
  for(i=0;i<p;i++)
 {
   x=x+arr[i];
  }
 avg=x/p;
 printf("sum and average of all d elements are %d %d",x,avg); 
}
 void main()
{
 int n,i;
 printf("enter the no. of elements");
 scanf("%d",&n);
 int a[10];
 printf("enter input for array");
 for(i=0;i<n;i++)
  scanf("%d",&a[i]);
 
 sum(a,n);
}
 
