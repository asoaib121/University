#include <Stdio.h>

void SelectionSort(int arr[],int n){
for (int i=0;i<n-1;i++){
    int temp=i;
    for (int j=i+1;j<n;j++){
        if(arr[temp]>arr[j]){
            temp =j;
        }
        if(temp!=0){
             int b=arr[temp];
             arr[temp]=arr[i];
             arr[i]=b;
        }
    }
}

}

int main()
{

    int n;
    printf("Enter the Array Size: ");
    scanf("%d",&n);

    int Arr[n];
    printf("Enter the Array value: ");
    for(int k=0; k<n; k++)
    {
        scanf("%d",&Arr[k]);
    }
    printf("\n");
    printf("Display the Array value: ");
    for(int k=0; k<n; k++)
    {
        printf("%d ",Arr[k]);
    }
    printf("\n");
    SelectionSort(Arr,n);
    printf("Selection Sorting Value is: ");
    for(int m=0; m<n; m++)
    {
        printf("%d ",Arr[m]);
    }
return 0;
}
