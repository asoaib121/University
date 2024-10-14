#include <stdio.h>
struct Node
{
    int data;
    struct Node *next;
};

struct Node *newNode(int data)
{
    struct Node *newNode =(struct Node*)malloc(sizeof(struct Node));
    newNode->data=data;
    newNode->next=NULL;
    return newNode;
}

struct Node *addNode(struct Node *head,int item)
{
    struct Node *node=newNode(item);

    if(head==NULL)
        return node;


    struct Node *current_node=head;
    while(current_node->next !=NULL)
    {


            current_node=current_node->next;
    }
        current_node->next=node;
        return head;
}



void display(struct Node *head)
{
    while (head !=NULL)
    {
        printf("%d ",head->data);
        head=head->next;
    }
    printf("\n");
}

int main()
{
    struct Node *head=newNode(1);
    head->next=newNode(2);
    head->next->next=newNode (3);
    head->next->next->next =newNode (4);
    head->next->next->next->next=newNode (5);
    head->next->next->next->next->next=newNode (6);

    // struct Node* node_to_add=head->next->next;
    head=addNode(head,7);

    display(head);
}
