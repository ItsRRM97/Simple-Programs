package Array_Programs;

//Selection Sorting demo in ascending order
class SSortA
{
    public static void main()
    {
        int a[]={1,334,54,76,23,897,545,12,4,7,98,45,345,45,100};
        int l=a.length;
        int i,j; int temp=0,min=0,index=0;
        for(i=0;i<l-1;i++)
        {
            min=a[i]; index=i;
            for(j=i+1;j<l;j++)
            {
                if(a[j]<=min)
                {
                    min=a[j];
                    index=j;
                }
            }
            temp=a[i];
            a[i]=a[index];
            a[index]=temp;
        }
        System.out.println("Ascending Order");
        for(i=0;i<l;i++)
        {
        System.out.println(a[i]);
    }
}
}

        