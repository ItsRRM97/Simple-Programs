//LCM using Recursion

#include<stdio.h>

int lcm(int a, int b, int c) {
    while(1) {
        if((a*c)%b==0) {
            return a*c;
        }
        else {
            c++;
            lcm(a,b,c);
        }
    }
    return a;
}

int main()
{
    /* code */
    int a = 5;
    int b = 12;
    int larger = (a>=b)?a:b;
    int smaller = (a<b)?a:b;
    int c = 1;
    int result = lcm(larger,smaller,c);
    printf("%d",result);
    return 0;
}
