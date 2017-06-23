#include<stdio.h>
struct student
{
 char name[15];
 int roll;
 char branch[10];
 int mrks1,mrks2,mrks3,tot;
};

void sorting( struct student b[],int p)
{
  struct student temp;
  int i,j;
  for(i=0;i<5;i++)
  {
    b[i].tot=b[i].mrks1+b[i].mrks2+b[i].mrks3;
   }
   for(i=1;i<p;i++){
    for(j=0;j<p-1;j++)
    {
      temp=b[j];
      b[j]=b[j+1];
      b[j+1]=temp;
     }
    }
}
  
  

void main()
{
 struct student a[5];
 int i,j=1; 
 for(i=0;i<5;i++)
 {
  printf("enter name for student %d",j);
  fflush(stdin);
  scanf("%s",a[i].name);
  printf("enter the roll no. for student %d",j);
  scanf("%d",&a[i].roll);
  printf("enter the branch of student %d",j);
  scanf("%s",a[i].branch);
  printf("enter marks of 1st sub for student %d",j);
  scanf("%d",&a[i].mrks1);
  printf("enter marks of 2nd sub for student %d",j);
  scanf("%d",&a[i].mrks2);
  printf("enter marks of 3rd sub for student %d",j);
  scanf("%d",&a[i].mrks3);
  j++;
 }
 sorting(a,5);
 for(i=0;i<5;i++)
 {
  printf("Details of student %d\n",(i+1));
  printf("name of student            : %s\n",a[i].name );
  printf("roll no. of student        : %d\n",a[i].roll);
  printf("branch of student          : %s\n",a[i].branch);
  printf("marks in sub 1 of student  : %d\n",a[i].mrks1);
  printf("marks in sub 1 of student  : %d\n",a[i].mrks2);
  printf("marks in sub 1 of student  : %d\n",a[i].mrks3);
  }
 }
 
  
  
  
