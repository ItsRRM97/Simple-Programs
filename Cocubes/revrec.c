//WAP to print the reverse of a number using recursion

#include <stdio.h>
#include <math.h>

int reverse(int num, int rev, int len) {
    while(len>0) {
        int dig = num % 10;
        rev = rev + dig*pow(10,--len);
        num = num/10;
        //do not use expressions in recursion :#
        reverse(num, rev, len);
    }
    return rev;
}

int main()
{
    int num = 148923;
    int rev = 0;
    int len = 6;
    int result = reverse(num, rev, len);
    printf("%d", result);
    return 0;
}
