#include<stdio.h>

int main()
{
    int MAX_SIZE ;
    char text [MAX_SIZE];
    char * str=text;
    int count = 0;

    printf("Enter a string:");
    gets(text);

    while(*(str++)) count++;
        printf("Length: %s = %d",text,count);
    return 0;
}
