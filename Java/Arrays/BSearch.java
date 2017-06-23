package Array_Programs;

 // Binary Searching Demonstration of 15 elements
class BSearch
{
     public static void main(int num)
     {
         int a[]={1,2,3,4,5,6,7,8,9,10,12,14,16,18,20,30};
         int l=a.length;
         int lb=0; int ub=l-1; int pos=-1; int mid=0;
         while((lb<=ub)&&(pos==-1))
         {
             mid=(lb+ub)/2;
             if(num==a[mid])
             {
                 pos=mid+1;
                }
                else if(num>a[mid])
                {
                    lb=mid+1;
                }
                else
                {
                    ub=mid-1;
                }
            }
            if(pos==-1)
            {
                System.out.println("Not found");
            }
            else
            {
                System.out.println("Found at "+pos);
            }
        }
    }
            