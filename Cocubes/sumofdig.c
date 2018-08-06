#include<stdio.h>

int main() {
    int n = 193742; int dig; int sum = 0;
    while (n>0) {
        dig=n%10;
        sum = sum + dig;
        n=n/10;
    }
    printf("%d",sum);
}