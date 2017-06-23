#include<stdio.h>
struct employee
{
 char name[15];
 int ecode;
 char dsgn[10];
 int sal;
};
void main()
{
 int i,j=1;
 int n;
 printf("\nEnter No.of employees");
 scanf("%d",&n);
 struct employee *r=(struct employee*)malloc(n*sizeof(struct employee));
 for(i=0;i<n;i++)
 {
  printf("enter name for employee %d",j);
  fflush(stdin);
  scanf("%s",r[i].name);
  printf("enter the employee code %d",j);
  scanf("%d",&r[i].ecode);
  printf("enter the designation initials %d",j);
  scanf("%s",r[i].dsgn);
  printf("enter salary %d",j);
  scanf("%d",&r[i].sal);  
  j++;
 }
 for(i=0;i<n;i++)
 {
  printf("Details of employee %d\n",(i+1));
  printf("name of employee     : %s\n",r[i].name );
  printf("employee code        : %d\n",r[i].ecode);
  printf("designation          : %s\n",r[i].dsgn);
  printf("salary               :%d",r[i].sal);
  }
 }
