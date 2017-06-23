package Array_Programs;

// bubble sort ascending
class BSortA
{
    public static void main()
    {
       int a[]={1,334,54,76,23,897,545,12,4,7,98,45,345,45,100};
       int l=a.length;
       int i,j;
       int temp=0;
       for(i=0;i<l;i++)    // no. of passes
       {
           for(j=0;j<l-1;j++)   // no. of elements
           {
               if(a[j]>a[j+1])
               {
                   temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
                }
            }
        }
        for(i=0;i<l;i++)
        {
            System.out.println(a[i]);
        }
    }
}

                   
