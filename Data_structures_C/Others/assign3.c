#include<stdio.h>
#include<stdlib.h>
int main()
	{
	int c1,r1,c2,r2,i,j,k;
	printf("\n Enter the row size for matrix 1: ");
	scanf("%d",&r1);
	printf("\n Enter the column size for matrix 1: ");
	scanf("%d",&c1);
	printf("\n Enter the row size for matrix 2: ");
	scanf("%d",&r2);
	printf("\n Enter the column size for matrix 2: ");
	scanf("%d",&c2);
	int **mat1;
	int **mat2;
	int **mat3;
	mat1=(int *) calloc(sizeof(int),r1);
	for (i=0;i<r1;i++)
		mat1[i]=(int *) calloc(sizeof(int),c1);
	mat2=(int *) calloc(sizeof(int),r2);
	for (i=0;i<r2;i++)
		mat2[i]=(int *) calloc(sizeof(int),c2);
	mat3=(int *) calloc(sizeof(int),c2);
	for (i=0;i<c2;i++)
		mat3[i]=(int *) calloc(sizeof(int),r1);
	printf("\n Enter elements of matrix 1: ");
	for (i=0;i<r1;i++)
		{
		for (j=0;j<c1;j++)
			{
			scanf("\n%d",&mat1[i][j]);
			}
		}
	printf("\n Enter elements of matrix 2: ");
	for (i=0;i<r2;i++)
		{
		for (j=0;j<c2;j++)
			{
			scanf("\n%d",&mat2[i][j]);
			}
		}        
	for (i=0;i<c2;i++)
		{
		for (j=0;j<r1;j++)
			{
			for (k=0;k<r2;k++)
			mat3[i][j]=mat3[i][j]+mat1[i][k]*mat2[k][j];
			}
		}
	printf("\n The multiplication is: ");
	for (i=0;i<c2;i++)
		{
		for (j=0;j<r1;j++)
			{
			printf("\n%d",mat3[i][j]);
			}
		}
	printf("\n\n");
	return(0);
	}
