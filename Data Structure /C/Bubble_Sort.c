#include <stdio.h>
void Bubble_sort(int Arr[],int n)
{

    for(int j=1; j<=n; j++)
    {
        for(int i=0; i<n-j ; i++)
        {
            if(Arr[i]>Arr[i+1])
            {
               int  temp=Arr[i];
                Arr[i]=Arr[i+1];
                Arr[i+1]=temp;
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
    Bubble_sort(Arr,n);
    printf("Bubble Sorting Value is: ");
    for(int m=0; m<n; m++)
    {
        printf("%d ",Arr[m]);
    }
return 0;
}
