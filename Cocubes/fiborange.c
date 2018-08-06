//WAP to print fibonacci series between a given range.

#include<stdio.h>

int main()
{
    /* code */
    int a = 0, b = 1;
    int i, j;
    int sum = 0;
    int lb=100, ub=14735246;
    while(1) {
        sum = a + b;
        a = b;
        b = sum;
        if(sum > 100 && sum < 14735246) {
            printf("\n%d",sum);
        }
        else if(sum<=100) {
            continue;
        }
        else {
            break;
        }
    }
    return 0;
}
