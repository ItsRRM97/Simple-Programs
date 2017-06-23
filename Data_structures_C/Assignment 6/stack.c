#include<stdio.h>
#include<stdlib.h>
#define max 100
int stack[max];int top=-1;
/*void accept()
{
    printf("enter the elements of stack ");
    for(i=0;i<100;i++)
    {
       scanf("%d",&stack[i]);

    }

}*/
void push(int item)
{
     if(top==max-1)
     {
         printf("overflow");

     }
     else
     {
         top++;
         stack[top]=item;
     }
}
int pop()
{   int x;
    if(top==-1)
    {
        printf("underflow");
        exit (0);
    }
    else
    {
        x=stack[top];
        top--;
        return x;
    }
    return 0;
}
void display()
{   int x;
    x=pop();
    printf("%d",x);
    display();
}
void main()
{
    push(2);
    push(3);
    push(4);
    push(5);
    display();

}
