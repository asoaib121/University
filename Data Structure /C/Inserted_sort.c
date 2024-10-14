#include <stdio.h>
void InsertedSort (int n,int arr[])
{

    for(int i=1; i<n; i++)
    {
        int temp=arr[i];
        int b=i-1;
        while (b>=0 && arr[b]>temp)
        {

            arr[b+1]=arr[b];
            b--;
        }
        arr[b+1]=temp;
    }

}


int main()
{
    int n;
    printf("Enter the array size:");
    scanf("%d",&n);

    int arr[n];
    printf("Enter the array value: ");
    for (int i=0; i<n; i++)
    {
        scanf("%d",&arr[i]);
    }

    printf("Display the array value: ");
    for (int j=0; j<n; j++)
    {
        printf("%d ",arr[j]);
    }

    printf("\n");


    InsertedSort(n,arr);
    printf("Display the Insertion Sorted value: ");
    for (int m=0; m<n; m++)
    {
        printf("%d ",arr[m]);
    }

return 0;
}
