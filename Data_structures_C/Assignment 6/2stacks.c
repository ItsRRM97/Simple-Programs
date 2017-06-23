#include<stdio.h>
#include<stdlib.h>
#define max 10

int top1=-1;
int top2=max;
int s[max];

void push1(int item)
{ if(top1==top2-1)
   {
       printf("overflow");

   }
   else
   {
       top1=top1+1;
       s[top1]=item;
   }
}
void push2(int item)
{
    if(top2==top1+1)
    {
        printf("stack overflow");

    }
    else
    {
        top2=top2-1;
        s[top2]=item;
    }
}
int pop1()
{int x;
  if(top1==-1)
  {
    printf("underflow");
    return -1;
  }


  else
  {
      x=s[top1];
      top1=top1-1;

  }
}
int pop2()
{int x;
  if(top2==max)
  {
    printf("underflow");
    return -1;
  }


  else
  {
      x=s[top2];
      top2=top2+1;

  }
}
void print_stack1 ()
{
  int i;
  for (i = top1; i >= 0; --i)
  {
    printf ("%d ", s[i]);
  }
  printf ("\n");
}
void print_stack2 ()
{
  int i;
  for (i = top2; i<max; ++i)
  {
    printf ("%d ", s[i]);
  }
  printf ("\n");
}
void main()
{
int s[max];int i;
printf("push not more than 10 elements");
for (i = 1; i <= 6; ++i)
  {
    push1(i);
    printf ("Value Pushed in Stack 1 is %d\n", i);
  }
  for (i = 1; i <= 4; ++i)
  {
    push2(i);
    printf ("Value Pushed in Stack 2 is %d \n", i);
  }
   print_stack1 ();
  print_stack2 ();
int  num_of_ele = top1 + 1;
  while (num_of_ele)
  {
    int x=pop1();
    printf("value popped is %d \n",x);

    --num_of_ele;
  }
}
