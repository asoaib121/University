#include <stdio.h>
int main()
{
    int n,posi,val;
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

    printf("Enter the insertion position: ");
    scanf("%d",&posi);


    printf("Enter the value: ");
    scanf("%d",&val);

    for(int i=n-1; i>=posi; i--)
    {
        arr[i+1]=arr[i];
    }
    arr[posi]=val;
    n++;

    printf("display the final array value: ");
    for(int i=0; i<n; i++)
    {
        printf("%d ",arr[i]);
    }
    return 0;
}
