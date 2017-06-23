#include<stdio.h>
void swap(int,int);
void main()
{
 int x,y;
 printf("enter two no.");
 scanf("%d %d",&x,&y);
 swap(x,y);
}

void swap(int a, int b)
{
   int c;
  printf("before swapping the no. are x=%d and y=%d",a,b);
   c=a;
   a=b;
   b=c;
  printf("after swapping the no. are x=%d and y=%d",a,b);
}
   
