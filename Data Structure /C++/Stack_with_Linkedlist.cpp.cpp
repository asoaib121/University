
#include <iostream>
using namespace std;

struct Node
{
    int data;
    struct Node*next;
};
struct Node *top=NULL;
void push(int val)
{
    struct Node *newnode=(struct Node*)malloc(sizeof(struct Node*));
    newnode->data=val;
    newnode->next=top;
    top=newnode;

}

void pop()
{
    if(top==NULL)
        cout<<"Stack is underflow"<<endl;

    else
    {
        cout<<"the poped element is: "<<top->data<<endl;
        top=top->next;
    }
}

void display()
{
    struct Node* temp;
    if(top==NULL)
        cout<<"stack is empty";
    else
    {
        temp=top;
        while(top!=NULL)
        {
            cout<<temp->data<<" ";
            temp=temp->next;
        }
        cout<<endl;
    }
}

int main()
{
    int ch,val;
    cout<<"1)push"<<endl;
    cout<<"2)pop"<<endl;
    cout<<"3)display"<<endl;
    cout<<"4)Exit"<<endl;

    do
    {
        cout<<"Enter your choice: ";
        cin>>ch;

        switch(ch)
        {
        case 1:
        {
            cout<<"enter the value to push: ";
            cin>>val;
            push(val);
            break;
        }
        case 2:
        {
            pop();
            break;
        }
        case 3:
        {
            display();

        }
        case 4:
        {
            cout<<"Exit";
            //exit(0);
            break;
        }
        default:
        {
            cout<<"Invalid choice";
        }
        }
    }
    while(ch!=4);

    return 0;
}
