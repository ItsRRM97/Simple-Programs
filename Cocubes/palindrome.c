#include <stdio.h>
#include <math.h>

int main()
{
    /* code */
    int n = 12321;
    int temp = n;
    int nr = 0; int i=5;
    int dig; int p;
    while(i>0) {
        dig = temp%10;
        nr = nr + (int)dig*pow(10,i-1);
        //printf("\n%d",nr);
        temp = temp/10;
        i--;
    }
    if(nr == n) {
        printf("\nPalindrome");
    }
    else {
        printf("\nNot a Palindrome");
    }
    return 0;
}
