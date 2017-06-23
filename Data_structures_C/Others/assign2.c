#include<stdio.h>
#include<stdlib.h>
int main()
	{
	int c,r,i,j;
	printf("\n Enter the row size: ");
	scanf("%d",&r);
	printf("\n Enter the column size: ");
	scanf("%d",&c);
	int **arr;
	arr=(int *) calloc(sizeof(int),r);
	for (i=0;i<r;i++)
		arr[i]=(int *) calloc(sizeof(int),c);
	printf("\n Enter elements: ");
	for (i=0;i<r;i++)
		{
		for (j=0;j<c;j++)
			{
			scanf("\n%d",&arr[i][j]);
			}
		}
	printf("\n The elements are: \n");
	for (i=0;i<r;i++)
		{
		for (j=0;j<c;j++)
			{
			printf("\t %d",arr[i][j]);
			}
		}
	return(0);	
	}
