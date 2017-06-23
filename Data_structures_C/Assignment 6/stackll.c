#include<stdio.h>
#include<malloc.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
}*top=NULL;
void push(int item)
{
    struct node* new=(struct node*)malloc(sizeof(struct node));
    new->data=item;
    new->next=NULL;

    new->next=top;
    top=new;

}
struct node* pop()
{
    struct  node *temp=top;
    if(top==NULL)
    {
        printf("underflow");
        exit (0);
    }
    else
    {   temp =top;
        top=top->next;
        free(temp);
        return top;

    }return ;
}
void display()
{
    struct node *t;
      t= pop();
        printf("%d",t->data);
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
