#include<stdio.h>
int main()
{
    int n,k=1;
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    {
        //line select
        for(int j=n;j>=k;j--)
        {
            //logic
            printf("%d ",j);
        }
        k++;
        printf("\n");
    }
    return 0;
}
