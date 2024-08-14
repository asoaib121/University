#include<stdio.h>
int main()
{
    int MAX_SIZE=100;
    int i,j;
    char text1[MAX_SIZE],text2[MAX_SIZE];

    printf("Enter a 1st num: ");
    gets(text1);

    printf("Enter a 2nd num: ");
    gets(text2);

    i = -1;
    while(text1[++i])

        j = 0;
    while(text1[i++] = text2[j++]);

    printf("Concatenated = %s ",text1);
    return 0;
}
