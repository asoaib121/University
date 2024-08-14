#include<stdio.h>
#include<string.h>
int main()
{
    char a[100],b[100];
    scanf("%s %s",&a,&b);
    int v=strcmp(a,b);
    if(v<0)
    {
        printf("a is small");
    }
    else if(v>0)
    {
        printf("b is small");
    }
    else
    {
        printf("Both are same");
    }
    return 0;
}
