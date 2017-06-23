#include<stdio.h>
#include<stdlib.h>

typedef struct node
{
    int data;
    struct node *next;
}NODE;

NODE *create_list(NODE *);
NODE *concat( NODE *start1,NODE *start2);
NODE *add_at_beg(NODE *start, int data);
NODE *add_at_end(NODE *start,int data);
void display(NODE *start);

int main()
{
    NODE *start1=NULL,*start2=NULL;
    printf("\nsingle linked list-1\n================");
    start1=create_list(start1);
    printf("\nsingle linked list-2\n================");
    start2=create_list(start2);
    printf("\nFirst list is  : ");
    display(start1);
    printf("\nSecond list is  : ");
    display(start2);
    start1=concat(start1, start2);
    printf("\nConcatenated list is  : ");
    display(start1);
    getch();
    return 0;
}

NODE *concat( NODE *start1,NODE *start2)
{
    NODE *ptr;
    if(start1==NULL)
    {
        start1=start2;
        return start1;
    }
    if(start2==NULL)
        return start1;
    ptr=start1;
    while(ptr->next!=NULL)
        ptr=ptr->next;
    ptr->next=start2;
    return start1;
}
NODE *create_list(NODE *start)
{
    int i,n,data;
    printf("\nEnter the number of nodes : ");
    scanf("%d",&n);
    start=NULL;
    if(n==0)
        return start;

    printf("Enter the element to be inserted : ");
    scanf("%d",&data);
    start=add_at_beg(start,data);

    for(i=2;i<=n;i++)
    {
        printf("Enter the element to be inserted : ");
        scanf("%d",&data);
        start=add_at_end(start,data);
    }
    return start;
}

void display(NODE *start)
{
    NODE *p;
    if(start==NULL)
    {
        printf("\nList is empty\n");
        return;
    }
    p=start;
    while(p!=NULL)
    {
        printf("%d ", p->data);
        p=p->next;
    }
    printf("\n");
}

NODE *add_at_beg(NODE *start,int data)
{
    NODE *tmp;
    tmp=(NODE *)malloc(sizeof(NODE));
    tmp->data=data;
    tmp->next=start;
    start=tmp;
    return start;
}

NODE *add_at_end(NODE *start, int data)
{
    NODE *p,*tmp;
    tmp= (NODE *)malloc(sizeof(NODE));
    tmp->data=data;
    p=start;
    while(p->next!=NULL)
        p=p->next;
    p->next=tmp;
    tmp->next=NULL;
    return start;
}
