#include<stdio.h>
#include<malloc.h>
struct node
 {
     int info;
     struct node *link;
  };
  struct node *start,*curr,*ptr,*temp;
  struct node *n;
  void create()
     {
     int x;
     char ch;
     do
      {
        int a;
	printf("\n Enter data : ");
	scanf("%d",&a);
        n=(struct node*)malloc(sizeof(struct node));
	n->info=a;
      if(start==NULL)
         {
	   start=n;
	   curr=n;
         }
	else
	 {
	curr->link=n;
	curr=n;
         }
        printf("\n Wanna add more : ");
        scanf("%c",&x);
	scanf("%c",&ch);
      }
   while(ch=='y');
}
  void display()
   {   
	ptr=start;
	printf("\nThe link list is : ");
             while(ptr!=NULL)
		{
		  printf("%d",ptr->info);
		  ptr=ptr->link;
		  printf("\n");
           }
        }
     void del()
	  {
	    ptr=start;
	    while(ptr->link->link!=NULL)
		{
		temp=ptr->link;
		 ptr->link=ptr->link->link;
		 ptr=ptr->link;
		free(temp);
		}
	     ptr->link=NULL;
  	}
   int main()
	{
	 int a;
         choice:
	 printf("\n1.create 2.display 3.delete even nodes 4.Exit");
         printf("\nEnter your choice : ");
	 scanf("%d",&a);
	  {
         switch(a)
	      {
     		case 1:create();
		        display();
			goto choice;
			;
		case 2:display();
			goto choice;
		        ;
		case 3:del();
			display();
			goto choice;
		case 4:exit(0);
                   }
           return 0;
    }
}

