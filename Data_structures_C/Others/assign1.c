#include<stdio.h>
#include<stdlib.h>
int main()
	{
	int c,i;
	printf("\n Enter the size of the array: ");
	scanf("%d",&c);
	int *arr;
	arr=(int *) calloc(sizeof(int),c);
	printf("\n Enter elements: ");
	for (i=0;i<c;i++)
		scanf("\n%d",&arr[i]);
	printf("\n The elements are: ");
	for (i=0;i<c;i++)
		printf("\n%d",arr[i]);
	return(0);	
	}
