package Array_Programs;

// not getting the desired output... some sort of logical error....was there now its removed.!!!! Selection Sorting in Descending Order
class SSortD
{
    public static void main()
        {
        int a[]={1,334,54,76,23,897,545,12,12,7,98,145,345,45,100};
        int l=a.length;
        int i,j; int temp=0,max=0,index=0;
        for(i=l-1;i>=0;i--)
        {
            max=a[i];  index=i;
            for(j=l-1;j>i;j--)
            {
                if(a[j]>=max)
                {
                    max=a[j];
                    index=j;
                }
            temp=a[i];
            a[i]=a[index];
            a[index]=temp;
        }
        }
        System.out.println("Descending Order");
        for(i=0;i<l;i++)
        {
        System.out.println(a[i]);
    }
}
}
            
