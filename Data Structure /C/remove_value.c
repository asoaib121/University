#include<stdio.h>
int main()
{
    int n,posi;

    printf("Enter a array size: ");
    scanf("%d",&n);

    int arr[n];
    printf("Enter a array value: ");
    for(int i=0; i<n; i++)
    {
        scanf("%d",&arr[i]);
    }

    printf("Display the array value: ");
    for(int i=0; i<n; i++)
    {
        printf("%d ",arr[i]);
    }
printf("\n");
    printf("Enter the remove position: ");
    scanf("%d",&posi);

    for(int i=posi; i<=n-1; i++)
    {
        arr[i]=arr[i+1];
    }
    n--;
    printf("Display the final array value: ");
    for(int i=0; i<n; i++)
    {
        printf("%d ",arr[i]);
    }
    return 0;
}
