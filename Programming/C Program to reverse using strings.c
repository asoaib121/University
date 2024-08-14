#include <stdio.h>
#include<string.h>
#define MAX_SIZE 100
int main()
{
    char reverse[MAX_SIZE];
    printf("Enter any string:");
    gets(reverse);

    printf("Enter current string:%s\n ",reverse);

    strrev(reverse);

    printf("Enter reverse string:%s\n",reverse);
    return 0;
}
