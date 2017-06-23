#include<stdio.h>

int mat[10][10];
int row,col; //dimensions of original matrix

int check_sp_mat() // reads the sparce matrix and converts it to three tupple format
{
	int r,c; //dimensions of original matrix
	int i,j,z=0,nz=0;	
	printf("\nEnter r and c : ");
	scanf("%d %d",&row,&col);
	printf("\nEnter the data \n");
	for(i=0;i < row;i++)
	{
		for(j=0;j < col;j++)
		{
			scanf("%d",&mat[i][j]);
			if(mat[i][j]==0)
			{
				z++;
			}
			else
			{
				nz++;
			}
		} // for
	}
	if(z>nz)
	{
		printf("\nIt is a Sparse Matrix");
	}
	else
	{
		printf("\nIt is not a Sparse Matrix");
		}
} // check

int convert_sp_mat(int m[10][10], int sp[10][3], int r, int c) // reads the sparce matrix and converts it to three tupple format
{
	int i,j,k;
	k=1;
	for(i=0;i < r;i++)
	{
		for(j=0;j < c;j++)
		{
			
			if( m[i][j] != 0 )
			{
				sp[k][0] = i;
				sp[k][1] = j;
				sp[k][2] = m[i][j];
				k++;
			} // if
		} // for
	}
	sp[0][0] = r;
	sp[0][1] = c;
	sp[0][2] = k-1;
	return;
} // read_sp_mat

// do dry run you will understand
int print_sp_mat(int sp[10][3]) // converts the three tupple matrix to sparse and prints them
{
	int r,c,i,j,tot_val,k;
	
	r = sp[0][0];
	c = sp[0][1];
	tot_val = sp[0][2];
	
	for(i=0;i<r;i++)
	{
		printf("\n");
		for(j=0;j<c;j++)
		{
			for(k=1;k<=tot_val;k++)
			{
				if( sp[k][0] == i && sp[k][1] == j ) 
				break;
			}
			if( k > tot_val)
				printf("%d",0);
			else
				printf("%d",sp[k][2]);
		} // for
	} // for
	return;
} //print_sp_mat

void transpose(int sp1[10][3],int sp2[10][3]) // sp2 is empty sparse matrix
{
    int i,j,k,r,c,tot;
    //here the transpose has c rows, r col and same tot no of non zero elements
    c=sp2[0][0]=sp1[0][1];
    r=sp2[0][1]=sp1[0][0];
    tot=sp2[0][2]=sp1[0][2];
    k=1;
    for(i=0;i<c;i++)
        for(j=1;j<=tot;j++)
            //if a column number of current triple==i then insert the current triple in sp2
            if(i==sp1[j][1])
            {
                sp2[k][0]=i;
                sp2[k][1]=sp1[j][0];
                sp2[k][2]=sp1[j][2];
                k++;
            }
}

void main()
{
	int sp1[10][3],sp2[10][3]; 
	// taking sparse matrix as input
	printf("\nEnter first sparse matrix");
	check_sp_mat();
	convert_sp_mat(mat,sp1,row,col);
	transpose(sp1,sp2);
	printf("\nOriginal sparse matrix is");
	print_sp_mat(sp1);
	printf("\nTransposed sparse matrix is");
	print_sp_mat(sp2);
	}	 // main
