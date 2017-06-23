#include<stdio.h>
#include<stdlib.h>
int main()
	{
	int c1,r1,i,j,k;
	printf("\n Enter the row size for matrix: ");
	scanf("%d",&r1);
	printf("\n Enter the column size for matrix: ");
	scanf("%d",&c1);
	int **mat1;
	int **mat2;
	mat1=(int *) calloc(sizeof(int),r1);
	mat2=(int *) calloc(sizeof(int),r1);
	for (i=0;i<r1;i++)
		mat1[i]=(int *) calloc(sizeof(int),c1);
	for (i=0;i<c1;i++)
		mat2[i]=(int *) calloc(sizeof(int),r1);
	printf("\n Enter elements of matrix: ");
	for (i=0;i<r1;i++)
		{
		for (j=0;j<c1;j++)
			{
			scanf("\n%d",&mat1[i][j]);
			}
		}      
	for (i=0;i<c1;i++)
		{
		for (j=0;j<r1;j++)
			{
			mat2[i][j]=mat1[j][i];
			}
		}
	for (i=0;i<c1;i++)
		{
		for (j=0;j<r1;j++)
			{
			printf("\t%d",mat2[i][j]);
			}
		printf("\n");
		}
	return(0);
	}
