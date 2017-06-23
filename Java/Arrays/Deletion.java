// deletion demonstration
class Deletion
{
public static void main()
{
int a[]={1,2,3,4,5,6,7,8,9,10};
int del=5;
int i; int id=0;
for(i=0;i<10;i++)
{
if(a[i]==del)
{
id=i;
}
}
for(i=id;i<9;i++)
{
a[i]=a[i+1];
}
for(i=0;i<9;i++)
{
System.out.println(a[i]);
}
}
}


