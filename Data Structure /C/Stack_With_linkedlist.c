#include<stdio.h>
#include<stdlib.h>
struct Node
{
    int data;
    struct Node*next;
};

struct Node *newNode()
{
    struct Node *newNode=(struct Node*)malloc(sizeof(struct Node));

        printf("enter a value: ");
        scanf("%d",&(newNode->data));
     newNode->next=NULL;
        return newNode;

}

struct Node* push(struct Node* head)
{
    struct Node* node=newNode();

    if(head==NULL)
    {
        head=node;
        return head;
    }
    struct Node* temp=head;
    while(temp->next !=NULL)
    {
        temp=temp->next;
    }
    temp->next=node;
    return head;
}

struct Node* pop (struct Node* head) {

    if (head == NULL) {
        printf ("Underflow\n");
        return NULL;
    }
    else if (head->next == NULL) {
        struct Node* current = head;
        head = NULL;
        free (current);
        return head;
    }
    else {
        struct Node* temp = head;
        while (temp -> next -> next != NULL)
            temp = temp->next;

        struct Node* current = temp->next;
        temp->next = NULL;
        free (current);
    }

    return head;
}

void display(struct Node* head)
{
    printf("display code is: ");
    while(head != NULL)
    {
        printf(" %d ",head->data);
        head=head->next;

    }
    printf("\n");
}

int main()
{
    struct Node* head=NULL;

    head=push(head);
    head=push(head);
    head=push(head);
    head=push(head);
    display(head);

    head=pop(head);
    head=pop(head);
    display(head);

    return 0;



}
