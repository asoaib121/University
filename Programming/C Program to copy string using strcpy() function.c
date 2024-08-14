#include<stdio.h>
#include<string.h>

int main()
{
    int MAX_SIZE ;
    char text1[MAX_SIZE],text2[MAX_SIZE];

    printf("Enter any size: ");
    gets(text1);

    strcpy(text2, text1);

    printf("Enter 1st size: %s\n",text1);
    printf("Enter 2nd size: %s\n",text2);
    return 0;
}
