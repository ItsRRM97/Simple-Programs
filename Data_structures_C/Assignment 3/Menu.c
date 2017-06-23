#include<stdio.h>

void bsearch(int a[100], int n, int item)
{
int i,j,mid,top,bottom;
         bottom=1;top=n;
        do
          {
            mid=(bottom+top)/2;
            if(item<a[mid])
              top=mid-1;
           else if(item>a[mid])
            bottom=mid+1;
              }
               while(item!=a[mid]&& bottom<= top);
                if(item==a[mid])
         {
             printf("binary search sucessful\n");
             printf("\n %d found in position:%d\n",item,mid+1);
              }
           else
           {
              printf("search failed\n %d not found\n",item);
              }
}

void sort(int a[100], int n)
{
int i,j,temp;
         for(i=0;i<n;i++);
           {
             for(j=j+1;j<n;j++)
              {
                if(a[i]>a[j])
                    {
                      temp =a[i];
                      a[i]=a[j];
                      a[j]=temp;
                      }
                  }
             }
              printf("the sorted array is:\n");
               for(i=0;i<n;i++)
                printf("%d",a[i]);
            }
void insert(int a[100], int n, int item, int k)
{
int i;
for(i=n-1;i>=k;i--)
{
a[i+1]=a[i];
}
a[k]=item;
n=n+1;
}

void delete(int a[100], int n, int k)
{
int i;
for(i=k;i<n-1;i++)
{
a[i]=a[i+1];
}
n--;
}

int main()
{
int i;
int num;
int size;
int ch;
int pos;
int ar[100];
printf("\nEnter Size of the Array");
scanf("%d",&size);
printf("\nEnter Array Elements");
for(i=0;i<size;i++)
{
printf("\n No.%d : ",(i+1));
scanf("%d",&ar[i]);
}
printf("\nChoose operation you want to peform on the array");
printf("\nEnter 1 to perform Binary Search");
printf("\nEnter 2 to peform Bubble Sort");
printf("\nEnter 3 to insert an element at the beginning of the array");
printf("\nEnter 4 to insert an element at the end of the array");
printf("\nEnter 5 to insert an element at any position of the array");
printf("\nEnter 6 to delete an element at beginning of the array");
printf("\nEnter 7 to delete an element at the end of the array");
printf("\nEnter 8 to delete an element at an given position");
printf("\n");
printf("\nEnter Your Choice");
scanf("%d",&ch);
switch(ch)
{
case 1: sort(ar,size); printf("\nEnter No to search"); scanf("%d",&num); bsearch(ar,size,num); break;
case 2: sort(ar,size); break;
case 3: printf("\nEnter No to insert at first"); scanf("%d",&num); insert(ar, size, num, 0); break;
case 4: printf("\nEnter No to insert at end"); scanf("%d",&num); insert(ar, size, num, size-1); break;
case 5: 
{
printf("\nEnter No to insert at posn"); 
scanf("%d",&num); 
printf("Enter Position you want to insert at");
scanf("%d",&pos);
insert(ar, size, num, pos-1); 
break;
}
case 6: delete(ar, size, 0); break;
case 7: delete(ar, size, size-1); break;
case 8: 
{
printf("Enter Position you want to insert at");
scanf("%d",&pos);
delete(ar, size, pos-1); 
break;
}
default: printf("\nWrong Choice");
}
}

