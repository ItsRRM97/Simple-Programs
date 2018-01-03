#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    long int ar[n];
    int i,j;
    long sum=0;;
    for(i=1;i<=n;i++)
    {
        cin>>ar[i];
    }
    i=1;
    while(i<=3)
    {
        for(j=i;j<=n;j=j+3)
        {
            sum=sum+ar[j];
        }
        cout<<sum<<" ";
        sum=0;
        i++;
    }
    return 0;
}

