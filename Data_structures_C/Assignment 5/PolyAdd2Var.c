/* P3.10 Program of polynomial addition and multiplication using linked list */
#include<stdio.h>
#include<stdlib.h>

struct node
{
    float coef;
    int expX;
    int expY;
    struct node *link;
};

struct node *create(struct node *); // for creating each polynomial
struct node *insert_s(struct node *,float,int,int);
struct node *insert(struct node *,float,int,int);
void display(struct node *ptr);
void poly_add(struct node *,struct node *);
void poly_mult(struct node *,struct node *);


int main( ) //main function
{
    struct node *start1=NULL,*start2=NULL;
   
    printf("Enter polynomial 1 :\n");
    start1=create(start1);

    printf("Enter polynomial 2 :\n");
    start2=create(start2);

    printf("Polynomial 1 is :  ");
    display(start1);
    printf("Polynomial 2 is :  ");
    display(start2);
       
    poly_add(start1, start2);
    poly_mult(start1, start2);
    return 0;
}/*End of main()*/

struct node *create(struct node *start) //creates a polynomial of n terms
{
    int i,n,exX,exY;
    float co;
    printf("Enter the number of terms : ");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        printf("Enter coeficient for term %d : ",i);
        scanf("%f",&co);
        printf("Enter exponent for term X%d : ",i);
        scanf("%d",&exX);
        printf("Enter exponent for term X%d : ",i);
        scanf("%d",&exY);
        start=insert_s(start,co,exX,exY);
    }
    return start;
}/*End of create()*/

struct node *insert_s(struct node *start,float co,int exX, int exY) //allocates memory and stores data creates poly
{
    struct node *ptr,*tmp;
    tmp=(struct node *)malloc(sizeof(struct node));
    tmp->coef=co;
    tmp->expX=exX;
    tmp->expY=exY;
    /*list empty or exp greater than first one */
    if(start==NULL || exX > start->expX) //The highest Exponent of X will be the first term
    {
        tmp->link=start;
        start=tmp;
    }
    else   
    {
        ptr=start;
        while(ptr->link!=NULL && ptr->link->expX >= exX)
        {
            ptr=ptr->link;
        }
        tmp->link=ptr->link;
        ptr->link=tmp;
    }
    return start;
}/*End of insert()*/
   
struct node *insert(struct node *start,float co,int exX, int exY)
{
    struct node *ptr,*tmp;
    tmp=(struct node *)malloc(sizeof(struct node));
    tmp->coef=co;
    tmp->expo=ex;
    /*If list is empty*/
    if(start==NULL)
    {
        tmp->link=start;
        start=tmp;
    }
    else    /*Insert at the end of the list*/
    {
        ptr=start;
        while(ptr->link!=NULL)
            ptr=ptr->link;
        tmp->link=ptr->link;
        ptr->link=tmp;
    }
    return start;
}/*End of insert()*/

void display(struct node *ptr) // to print the polynomial
{
    if(ptr==NULL)
    {
        printf("Zero polynomial\n");
        return;
    }
    while(ptr!=NULL)
    {
        printf("(%.1fx^%dy^%d)", ptr->coef,ptr->expX,ptr-expY);
        ptr=ptr->link;
        if(ptr!=NULL)
            printf(" + ");
        else
            printf("\n");
    }
}/*End of display()*/

void poly_add(struct node *p1,struct node *p2)
{
    struct node *start3;
    start3=NULL;
   
    while(p1!=NULL && p2!=NULL)
    {
        if(p1->expX > p2->expX)
        {
            start3=insert(start3,p1->coef,p1->expX,p1->expY);
            p1=p1->link;
        }
        else if(p2->expX > p1->expX)
        {
            start3=insert(start3,p2->coef,p2->expX,p2->expY);
            p2=p2->link;
        }
        else if(p1->expX==p2->expX)
        {
            start3=insert(start3,p1->coef+p2->coef,p1->expX,p1->expY);
            p1=p1->link;
            p2=p2->link;
        }
    }
    /*if poly2 has finished and elements left in poly1*/
    while(p1!=NULL)
    {
        start3=insert(start3,p1->coef,p1->expX,p1->expY);
        p1=p1->link;
    }
    /*if poly1 has finished and elements left in poly2*/
    while(p2!=NULL)
    {
        start3=insert(start3,p2->coef,p2->expX,p2->expY);
        p2=p2->link;
    }
    printf("Added polynomial is : ");
    display(start3);
}/*End of poly_add() */

void poly_mult(struct node *p1, struct node *p2)
{
    struct node *start3;
    struct node *p2_beg = p2;
    start3=NULL;
    if(p1==NULL || p2==NULL)
    {
        printf("Multiplied polynomial is zero polynomial\n");
        return;
    }
    while(p1!=NULL)
    {
        p2=p2_beg;
        while(p2!=NULL)
        {
            start3=insert_s(start3,p1->coef*p2->coef,p1->expX+p2->expX,p1->expY+p2->expY);
            p2=p2->link;   
        }
        p1=p1->link;
    }   
    printf("Multiplied polynomial is : ");
    display(start3);
}/*End of poly_mult()*/        
