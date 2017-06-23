#include<stdio.h>

struct time

{
	
int t1, t2, t;

};

void main()

{
	
struct time s[5];
	
int i;
	
printf ("Enter time in hours five times for set t1\n");
	for (i=0;i<5;i++)
	
scanf ("%d", &s[i].t1);
	printf ("Enter time in minutes five times for set t2\n");
	
for (i=0;i<5;i++)
	
scanf ("%d", &s[i].t2);
	for (i=0;i<5;i++)
	
s[i].t=s[i].t1*3600+s[i].t2*60;
	printf ("The time inseconds for set t are as follows\n");
	
for (i=0;i<5;i++)
	
printf ("%d\n", s[i].t);
}
