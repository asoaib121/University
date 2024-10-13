#include<iostream>
using namespace std;

struct Node
{
    int data;
    struct Node* next;
};

struct Node *newNode(int data)
{
    struct Node *newNode=(struct Node*)malloc(sizeof(struct Node));
    newNode->data=data;
    newNode->next=NULL;
    return newNode;

}

struct Node* delete_node(struct Node* head,struct Node* node)
{
    if (node==head)
    {
        head=head->next;
        free(node);
        return head;
    }

    struct Node* current_node=head;
    while (current_node != NULL)
    {
        if(current_node->next==node)
        {
            break;
        }
        current_node=current_node->next;
    }
    if(current_node==NULL)
        return head;


    current_node->next=node->next;
    free(node);
    return head;
}

void display(struct Node*head)
{
    while (head!=NULL)
    {
        cout<<head->data<<" ";
        head=head->next;
    }
    cout<<endl;
}

int main()
{
    struct Node *head=newNode(1);
    head->next=newNode(2);
    head->next->next=newNode (3);
    head->next->next->next =newNode (4);
    head->next->next->next->next=newNode (5);
    head->next->next->next->next->next=newNode (6);
    display(head);

    struct Node*remove_node=head->next->next;
    head=delete_node(head,remove_node);
    display(head);
    return 0;
}
