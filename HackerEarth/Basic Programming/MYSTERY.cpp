#include<iostream>
using namespace std;

//finding the binary equivalent and counting the no.of 1's in the binary equivalent
long long binarycount(long long n){
  long long count =0;
  while(n){
    n = n&(n-1);
    count++;
  }
  return count;
}
int main()
{
    long long num;
    while(!cin.eof()) //checking the next number if it is there
    {
        cin>>num;
        cout<<binarycount(num)<<endl;
    }
    return 0;   
}
