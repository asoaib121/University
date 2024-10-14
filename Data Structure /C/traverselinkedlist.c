#include <stdio.h>

void traverseLinkedList(int data[], int size) {
    for (int i = 0; i < size; i++) {
        printf("%d ", data[i]);
    }

    printf("\n");
}

int main() {
    int size;
    printf("Enter the size of the linked list: ");
    scanf("%d", &size);

    int data[size];

    printf("Enter the elements of the linked list: ");
    for (int i = 0; i < size; i++) {
        scanf("%d", &data[i]);
    }

    printf("Linked list elements: ");
    traverseLinkedList(data, size);

    return 0;
}
