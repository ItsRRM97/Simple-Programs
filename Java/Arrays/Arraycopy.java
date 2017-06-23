package Array_Programs;

import java.io.*;
class Arraycopy
{
public static void main()
{
int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
int b[]= new int[10];
System.arraycopy(a,0,b,0,10);
for(int i=0;i<10;i++)
{
System.out.println(b[i]);
}
}
}
