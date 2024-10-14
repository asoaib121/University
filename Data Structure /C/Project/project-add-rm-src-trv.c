#include<stdio.h>

void Inserted(int arr[], int size, int posi, int value)
{
    for(int i=size-1; i>=posi; i--)
        arr[i+1]=arr[i];

    arr[posi]=value;
    size++;

    printf("Display the inserted array value:");
    for(int i=0; i<size; i++)
        printf("%d ",arr[i]);

    printf("\n");
}
void Deleted (int arr[],int size,int posi)
{
   for (int i=posi; i<=size-1; i++)
        arr[i] = arr[i+1];

    size--;

    printf("Display the deleted array: ");
    for (int i=0; i<=size; i++)
        printf("%d ",arr[i]);

     printf("\n");
}

void Search(int arr[], int size, int s) {
    int beg = 0, end = size - 1, mid;
    mid = (beg + end) / 2;

    while (arr[mid] != s && beg <= end) {
        if (s < arr[mid]) {
            end = mid - 1;
        } else if (s > arr[mid]) {
            beg = mid + 1;
        }
        mid = (beg + end) / 2;
    }

    if (arr[mid]==s) {
        printf("%d is the location of item %d\n",mid,s);
    } else {
        printf("Item not found\n");
    }
}
void traverseLinkedList(int data[], int size) {
    for (int i = 0; i < size; i++) {
        printf("%d ", data[i]);
    }

    printf("\n");
}
int main()
{
    int i,size,posi,value,s;
    printf("Enter the array size:");

   scanf("%d",&size);

    int arr[size];

    printf("Enter the array:");
    for(i=0; i<size; i++)
        scanf("%d",&arr[i]);

    printf("Display the array:");
    for(i=0; i<size; i++)
        printf("%d ",arr[i]);

     printf("\n");
    printf("Enter the insertion position:");
    scanf("%d",&posi);

    printf("Enter the value: ");
    scanf("%d",&value);
    Inserted(arr, size, posi, value);

    printf("Enter the deletion position:");
    scanf("%d",&posi);
    Deleted(arr, size, posi);



     printf("Enter the search item: ");
    scanf("%d",&s);

    Search(arr, size,s);

    printf("Linked list elements: ");
    traverseLinkedList(arr, size);

    return 0;
}


