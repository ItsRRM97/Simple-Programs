#include <stdio.h>

int main()

{
	
int a[5],i, j;
	
printf ("Enter 5 integer element for array\n");
	
for (i=0;i<5;i++)
	
scanf ("%d", &a[i]);
	
printf ("The elements of the array are as follows\n");
	
for (i=0;i<5;i++)
	
printf ("%d\n", a[i]);
	
printf ("Enter the position of element to be deleted\n");
	
scanf ("%d", &j);
	
a[j-1]=0;
	
printf ("Now the array is\n");
	
for (i=0;i<5;i++)
	
printf ("%d\n", a[i]);
	
return 0;	

}
