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
struct Node *remove_node(struct Node *head,struct Node *node)
{
    if( node== head)
    {
        head=node->next;
        free(node);
        return head;
    }

    struct  Node *current_node=head;
    while(current_node != NULL)
    {
        if(current_node->next==node)
        {
            break;
        }

        current_node=current_node->next;
    }
    if(current_node==NULL)
    {
        return head;
    }

    current_node->next=node->next;
    free(node);
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

    struct Node* node_to_remove=head->next->next;
    head=remove_node(head,node_to_remove);

    display(head);
}
