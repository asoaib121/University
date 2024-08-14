#include<stdio.h>
int main()
{
    char a[100],b[100];
    scanf("%s %s",&a,&b);
    int i=0;
    while(1)
    {
        if(a[i]=='\0' && b[i]=='\0')
        {
            printf("Both are same");
            break ;
        }
        else if(a[i]=='\0')
        {
            printf("a is small");
            break ;
        }
        else if(b[i]=='\0')
        {
            printf("b is small");
            break ;
        }
        if(a[i]==b[i])
        {
            i++;
        }
        else if(a[i]<b[i])
        {
            printf("a is small");
            break ;
        }
        else
        {
            printf("b is small");
            break ;
        }
    }
    return 0 ;
}
