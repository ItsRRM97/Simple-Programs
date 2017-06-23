#include<stdio.h>
#include<stdlib.h>
int main()
	{
	int r,c,i,j;
	printf("\n Enter the row size: ");
	scanf("%d",&r);
	printf("\n Enter the column size: ");
	scanf("%d",&c);
	int **mat1;
	int **mat2;
	int **mat3;
	mat1=(int *) calloc(sizeof(int),r);
	mat2=(int *) calloc(sizeof(int),r);
	mat3=(int *) calloc(sizeof(int),r);	
	for (i=0;i<r;i++)
		{
		mat1[i]=(int *) calloc(sizeof(int),c);
		mat2[i]=(int *) calloc(sizeof(int),c);
		mat3[i]=(int *) calloc(sizeof(int),c);
		}
	printf("\n Enter elements of matrix 1: ");
	for (i=0;i<r;i++)
		{
		for (j=0;j<c;j++)
			{
			scanf("\n%d",&mat1[i][j]);
			}
		}
	printf("\n Enter elements of matrix 2: ");
	for (i=0;i<r;i++)
		{
		for (j=0;j<c;j++)
			{
			scanf("\n%d",&mat2[i][j]);
			}
		}
	for (i=0;i<r;i++)
		{
		for (j=0;j<c;j++)
			{
			mat3[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
	printf("\n The sum is: ");
	for (i=0;i<r;i++)
		{
		for (j=0;j<c;j++)
			{
			printf("\n%d",mat3[i][j]);
			}
		}
	printf("\n");
	return(0);
	}
