#include<stdio.h>
struct bill
{
char name[20];
int num;
int units;
};
int main()
{
int n,i;
printf("\n Enter no of payee?");
scanf("%d",&n);
struct bill f[n];
for(i=0;i<n;i++)
{
	printf("\n Enter Customer Name:");
	scanf("%s",&f[i].name);
	printf("\n Enter Customer Number:");
	scanf("%d",&f[i].num);
	printf("\n Enter Units: ");
	scanf("%d",&f[i].units);
	printf("\n Bill : Rs.%f",f[i].units*0.8+250);
}
return 0;
}
