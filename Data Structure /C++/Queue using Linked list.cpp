#include <iostream>
using namespace std;
#define size 5
int queue[size],front=-1,rear=-1;

void enqueue(int value){
if(rear==size-1) {
    cout<<"The Queue is Overflow"<<endl;
   }else{
   if(front== -1)
      front=0;
      rear++;
      queue[rear]=value;
      cout<<"The value is Inserted,,,"<<queue[rear]<<endl;
   }
}

void dequeue() {
if(front==-1)
    cout<<"The Queue is Underflow"<<endl;
else{
    cout<<"The value is deleted.."<<queue[front]<<endl;
    front++;
}
if(front>>rear)
    front =rear=-1;
}

void display () {
    if(rear == -1)
        cout<<"The queue is empty"<<endl;
    else{
        cout<<"The Queue element are: ";
        for (int i=front; i<=rear;i++)
            cout<<queue[i]<<" ";
        cout<<endl;
    }
}
int main(){
int ch,value;
   cout<<"1)Equeue"<<endl;
   cout<<"2)Dequeue"<<endl;
   cout<<"3)Display queue"<<endl;
   cout<<"4)Exit"<<endl;

   do{
    cout<<"Enter your choice: ";
    cin>>ch;

    switch(ch){
case 1:
    cout<<"Enter the value to equeue: ";
    cin>>value;
    enqueue(value);
    break;

case 2:
    cout<<"Enter the value to Dequeue: ";

    dequeue();
    break;
case 3:
    display();
    break;
case 4:
    exit(0);
    break;
default:
    cout<<"Invalid choice";
    }
   }while(ch!=4);
   return 0;
}
