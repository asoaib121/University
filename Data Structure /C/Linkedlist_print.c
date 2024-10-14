#include <stdio.h>
struct Node
{
    int data;
    struct Node *next;
};

struct Node *newNode(int data)
{
    struct Node *newNode=(struct Node*)malloc(sizeof(struct Node));
    newNode->data= data;
    newNode->next=NULL;
    return newNode;
}

void printNode(struct Node* head)
{
    while (head!=NULL)
    {
        printf("%d ",head->data);
        head=head->next;
    }
    printf("\n");
}

int main()
{
    struct Node *head=newNode (1);
    head->next=newNode (2);
    head->next->next=newNode (3);
    head->next->next->next =newNode (4);
    head->next->next->next->next=newNode (5);

    printNode(head);

    return 0;
}
