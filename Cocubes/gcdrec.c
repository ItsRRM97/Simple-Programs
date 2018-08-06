//find the gcd using recursion

#include <stdio.h>

int gcd(int a, int b) {
     while (a != b)
    {
        if (a > b)
        {
            return gcd(a - b, b);
        }
        else
        {
            return gcd(a, b - a);
        }
    }
    return a;
}

int main()
{
    /* code */
    int a = 16, b = 12;
    int gcdnum;
    gcdnum = gcd(a,b);
    printf("%d",gcdnum);
    return 0;
}