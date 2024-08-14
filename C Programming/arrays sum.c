#include <stdio.h>
int main()
{
    int a;
    scanf("%d",&a);
    int ara[a];
    for(int i=0;i<a;i++)
    {
        scanf("%d",&ara[i]);
    }
    int sum=0;
    for(int i=0;i<a;i++)
    {
        sum=sum+ara[i];
    }
    printf("Answer:%d",sum);

    return 0;
}



