#include<iostream>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--)
    {
        int i; int pos; int nz=0; int no=0;
        long n; int n1=0; int n0=0;
        cin>>n; int swa = 0;
        int arr[n];
        for(i=0;i<n;i++) {
            cin>>arr[i];
            if(arr[i]==0) n0++;
            if(arr[i]==1) n1++;
        }
        for(i=0; i<n/2;i++) {
            if(arr[i]==0)
            {
                while(arr[i]!=arr[n-i])
                {
                    if(arr[i]==0 && arr[n-i]==1) { nz++; no++; }
                    if(nz==n0 || no==n1) { swa = 0; break; }
                }
                if (arr[i] == 1) {
                    arr[i] = 0; pos=n-i-1; while(arr[pos]!=0) { pos--; }
                    arr[pos] = 1; swa++;
                }
                else
                {
                    arr[n-i]=1; pos=i+1; while(arr[pos]!=1) { pos++; }
                    arr[pos] = 0; swa++;
                }
            }
            else
            {
                while(arr[i]!=arr[n-i])
                {
                    if(arr[i]==1 && arr[n-i]==0) { nz++; no++; }
                    if(nz==n0 || no==n1) { swa = 0; break; }
                }
                if (arr[i] == 0) {
                    arr[i] = 1; pos=n-i-1; while(arr[pos]!=1) { pos--; }
                    arr[pos] = 0; swa++;
                }
                else
                {
                    arr[n-i]=0; pos=i+1; while(arr[pos]!=0) { pos++; }
                    arr[pos] = 1; swa++;
                }
            }
        }
        cout<<swa<<endl;
    }
}
