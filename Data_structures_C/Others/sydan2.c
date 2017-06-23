#include <stdio.h>

struct lib

{
	
char name[50], auth[50], sub[50];
	
int id;

};

void main()

{
	
struct lib s[5];
	
int i, j;
	
printf ("Enter details for Library info\n");
	
for (i=0;i<5;i++)
	
{
		
printf ("%d. book details\nEnter the book's name, author, ID and subject in order\n", i+1);
		
scanf("%s",s[i].name);
		
scanf("%s",s[i].auth);
		
scanf ("%d",&s[i].id);
		
scanf("%s",s[i].sub);
		
	
}
	
printf ("The library details are as follows:\n");
	
for (i=0;i<5;i++)
	
{
		
printf ("%d. book\nName:-%s\nAuthor:-%s\nId:-%d\nSubject:-%s\n", i+1, s[i].name, s[i].auth, s[i].id, s[i].sub);
		
	
}
}
