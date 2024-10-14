#include <stdio.h>
int linear_search(int arr[],int n,int target)
{
    for(int i=0; i<n; i++)
    {
        if(arr[i]==target)
        {
            return i;
        }
    }
    return -1;
}


int main()
{
    int n,target;
    printf("Enter the array size: ");
    scanf("%d",&n);

    int arr[n];
    printf("Enter the array value: ");
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
     printf("Enter the target value: ");
     scanf("%d",&target);


    int result=linear_search(arr,n,target);

    if(result != -1)
    {
        printf("%d  is the location of index  %d",target,result);
    }
    else
    {
        printf("element not found ");
    }

return 0;
}
