class C7Q7
{
  public static void main()
  {
      int a[]={1,2,3,4,5,6,7,6,5,4};
      int b[]={1,2,3,2,1}; int c[]=new int[7]; int d=0;
      int i; int x=0; int o=0; int j;
      for(i=0;i<10;i++)
      {
          x=a[i];
          for(j=0;j<10;j++)
          {
              if(x==a[j])
              {
                  d++;
                }
            }
            if(d==1)
            {
               System.out.println(x);
            }
            d=0;
        }
      
    }
}