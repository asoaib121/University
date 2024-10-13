#include <iostream>
using namespace std;

int stack[10],top=-1;

void push(int val)
{
    if(top>=10-1)
        cout<<"stack is overflow "<<endl;

    else
    {
        top++;
        stack[top]=val;
    }
}

void pop()
{
    if(top<=-1)
        cout<<"Stack is underflow "<<endl;

    else
    {
        cout<<"pop element is: "<<stack[top]<<endl;
        top--;

    }
}

void display()
{
    if(top<=-1)
    {
        cout<<"stack is empty";
    }
    else
    {   cout<<"stack element: ";
        for(int i=top; i>=0; i--)
        cout<<stack[i]<<" ";
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

do{
    cout<<"Enter your choice: ";
    cin>>ch;

    switch(ch){
    case 1:{
    cout<<"enter the value to push: ";
    cin>>val;
    push(val);
    break;
    }
    case 2:{
    pop();
    break;
    }
    case 3:{
    display();
    break;
    }
    case 4:{
    //cout<<"Exit";
    exit(0);
    break;
    }
    default:{
        cout<<"Invalid choice";
    }
    }
}while(ch!=4);

return 0;
}
