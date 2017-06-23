package Array_Programs;

class InsSortD
{
   public static void main()
   {
       int a[]={1,334,54,76,23,897,545,12,4,7,98,45,345,45,100};
       int i,j, value;
       for(i=1;i<a.length;i++)
       {
           j=i;
           value=a[i];
           while(j>0&&a[j-1]<value)
           {
               a[j]=a[j-1];
               j--;
            }
            a[j]=value;
        }
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
    }
  }
}