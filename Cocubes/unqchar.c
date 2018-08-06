// WAP to print all the unique characters in a string

#include <stdio.h>
#include <string.h>

int main() {
    char str[1000] = "I am a fucking good buoy niggah";
    int arr[200];
    int i; int len;
    //finding length of string
    for(len = 0; str[len] != '\0'; ++len);
    for(i = 0; i < len; i++) {
        arr[str[i]]=0;
    }
    for(i = 0; i < len; i++) {
        if(arr[str[i]]!=1) {
            arr[str[i]]==1;
            printf("%c ",str[i]);
        }
    }
}