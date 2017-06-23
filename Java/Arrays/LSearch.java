package Array_Programs;

// to search an element and print it including its position
class LSearch
{
    public static void main(int z)
    {
        int ar[]={12,23,34,45,56,67,78,89,90,9,98,87,76,65,54,43,32,1};
        int i,pos=0;
        for(i=0;i<ar.length;i++)
        {
            if(ar[i]==z)
            {
             pos=i+1;
            }
        }
        if(pos==0)
        {
            System.out.println("Not Found");
        }
        else
        {
           System.out.println("Found at "+pos+"th");
           System.out.println(z);
        }       
} 
}           
        