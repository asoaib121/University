#include <stdio.h>

void binarySearch(int arr[], int size, int s_item) {
    int beg = 0, end = size - 1, mid;
    mid = (beg + end) / 2;

    while (arr[mid] != s_item && beg <= end) {
        if (s_item < arr[mid]) {
            end = mid - 1;
        } else if (s_item > arr[mid]) {
            beg = mid + 1;
        }
        mid = (beg + end) / 2;
    }

    if (arr[mid] == s_item) {
        printf("%d is the location of item %d\n", mid, s_item);
    } else {
        printf("Item not found\n");
    }
}

int main() {
    int i, size, s_item;
    printf("Enter the array size: ");
    scanf("%d", &size);
    int arr[size];

    printf("Enter the array values: ");
    for (i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Display the array values: ");
    for (i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    printf("Enter the search item: ");
    scanf("%d", &s_item);

    binarySearch(arr, size, s_item);

    return 0;
}
