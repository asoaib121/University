#include<stdio.h>
#include<string.h>

int main()
{
    char s[1001],m[1001];
    scanf("%s %s",&s,&m);
    int lenS=strlen(s);
    int lenM=strlen(m);
    printf("%d %d\n",lenS,lenM);
    return 0;
}
