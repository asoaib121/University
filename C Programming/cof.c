#include <stdio.h>
int main()
{
    int n;
    printf("Enter a number:");
    scanf("%d",&n);
    if(1999 > n)
    {
        printf("Incorrect");
    }
    else if (1999 < n)
    {
        printf("Incorrect");
    } else {
        printf("correct");

    }

    return 0;
}

