#include <stdio.h>

struct employee

{
	
char name[50];
	
int id, rop, nohw, gp, np, ot, eh, td;
};
void main()
{
	struct employee s[3];
	int i, j;
	printf ("Enter employee info\n");
	for (i=0;i<3;i++)
	{
		printf ("%d. employee details:\nEnter his name, id, rate of pay(in Rs./hr.), no. of hours worked, extra hours in order\n", i+1);
		scanf ("%s%d%d%d%d", s[i].name, &s[i].id, &s[i].rop, &s[i].nohw, &s[i].eh);
	}
	for (i=0;i<3;i++)
	{
		s[i].ot=s[i].eh*2*s[i].rop;
		s[i].gp=s[i].nohw*s[i].rop+s[i].ot;
		if (s[i].gp<=1000)
		s[i].td=50;
		else s[i].td=100;
		s[i].np=s[i].gp-s[i].td;
	}
	printf ("The Gross Pay and Net Pay Of the Employees are as follows:\n");
	for (i=0;i<3;i++)
	printf ("%d. employee\nGross Pay:-%d\nNet Pay:-%d\n", i+1, s[i].gp, s[i].np);
}
