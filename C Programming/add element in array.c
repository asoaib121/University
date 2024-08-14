#include <stdio.h>
int main()
{
    int n,i;
    scanf("%d",&n);
    int ar[n+1];
    for(int i=0;i<n;i++);
    {
        scanf("%d",&ar[i]);
    }
    int pos,index;
    scanf("%d %d",&pos,&index);
    for(int i=n;i>=pos+1;i--)
    {
        ar[i]=ar[i-1];
    }
    ar[pos]=index;
    for(int i=0;i<=n;i++)
    {
      printf("%d  ",ar[i]);
    }
    return 0;
}
