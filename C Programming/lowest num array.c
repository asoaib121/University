#include <stdio.h>
#include <limits.h>

int main()
{
    int n,i;
    scanf("%d",&n);
    int ar[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&ar[i]);
    }
    int mn=INT_MAX,pos;
    for (int i=0;i<n;i++)
    {
        if(ar[i]<mn)
        {
            mn=ar[i];
            pos=i+1;
        }

    }
    printf("minimum number:%d\n",mn);
        printf("position:%d",pos);

    return 0;
}
