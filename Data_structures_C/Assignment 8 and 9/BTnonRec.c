/*
 * C Program to Traverse the Tree Non-Recursively
 */
#include <stdio.h>
#include <stdlib.h>
 
struct node
{
    int a;
    struct node *left;
    struct node *right;
};
 
void generate(struct node **, int);
int search(struct node *, int);
void delete(struct node **);
 
int main()
{
    struct node *head = NULL;
    int choice = 0, num, flag = 0, key;
 
    do
    {
        printf("\nEnter your choice:\n1. Insert\n2. Search\n3. Exit\nChoice: ");
        scanf("%d", &choice);
        switch(choice)
        {
        case 1: 
            printf("Enter element to insert: ");
            scanf("%d", &num);
            generate(&head, num);
            break;
        case 2: 
            printf("Enter key to search: ");
            scanf("%d", &key);
            flag = search(head, key);
            if (flag)
            {
                printf("Key found in tree\n");
            }
            else
            {
                printf("Key not found\n");
            }
            break;
        case 3: 
            delete(&head);
            printf("Memory Cleared\nPROGRAM TERMINATED\n");
            break;
        default: printf("Not a valid input, try again\n");
        }
    } while (choice != 3);
    return 0;
}
 
void generate(struct node **head, int num)
{
    struct node *temp = *head, *prev = *head;
 
    if (*head == NULL)
    {
        *head = (struct node *)malloc(sizeof(struct node));
        (*head)->a = num;
        (*head)->left = (*head)->right = NULL;
    }
    else
    {
        while (temp != NULL)
        {
            if (num > temp->a)
            {
                prev = temp;
                temp = temp->right;
            }
            else
            {
                prev = temp;
                temp = temp->left;
            }
        }
        temp = (struct node *)malloc(sizeof(struct node));
        temp->a = num;
        if (num >= prev->a)
        {
            prev->right = temp;
        }
        else
        {
            prev->left = temp;
        }
    }
}
 
int search(struct node *head, int key)
{
    while (head != NULL)
    {
        if (key > head->a)
        {
            head = head->right;
        }
        else if (key < head->a)
        {
            head = head->left;
        }
        else
        {
            return 1;
        }
    }
	return 0;
}
 
void delete(struct node **head)
{
    if (*head != NULL)
    {
        if ((*head)->left)
        {
            delete(&(*head)->left);
        }
        if ((*head)->right)
        {
            delete(&(*head)->right);
        }
        free(*head);
    }
}

void non_in(node *r)
 {
 int top=0;
 node *s[20],*pt=r;
 s[0]=NULL;
 while(pt != NULL)
  {
  s[++top] = pt;
  pt = pt->left;
  }
 pt = s[top--];
 while(pt != NULL)
  {
  printf("%d\t",pt->data);
  if(pt->right != NULL)
   {
   pt = pt->right;
   while(pt != NULL)
    {
    s[++top] = pt;
    pt = pt->left;
    }
   }
   pt = s[top--];
  }
 }
 
 void non_pre(node *r)
 {
 int top=0;
 node *s[20],*pt=r;
 s[0]=NULL;
 while(pt != NULL)
  {
  printf("%d\t",pt->data);
  if(pt->right != NULL)
   s[++top] = pt->right;
  if(pt->left != NULL)
   pt = pt->left;
  else
   pt = s[top--];
  }
 }
 
 void non_post(node *root)
 {
 node *stack[100];
 int top=-1;
 node *temp=root;
 while(temp!=NULL)
  {
  while(temp!= NULL)
   {
   top++;
   stack[top] = temp;
   temp = temp->left;
   }
  label:temp =stack[top];
  top--;
  if(temp->flag==1)
   {
   printf("%d\t",temp->data);
   break;
   }
  else
   {
   temp->flag=1;
   top++;
   stack[top] = temp;
   temp=temp->right;
   }
  }
  if(top>=0)
   goto label;
 }

