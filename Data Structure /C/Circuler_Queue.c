#include <stdio.h>
#include <stdbool.h>
#define size 20

int front=-1,rear=-1;
//the function is check queue is full or not
bool isFull()
{
    if(front==(rear+1)%size)
        return true;
    else return false;
}
//the function is check queue is Empty or not
bool isEmpty()
{
    if(front==-1)
        return true;
    else return false;
}
//this function insert value in queue
void enqueue(int Q[],int value)
{
    if(isFull())
    {
        printf("Queue is full");
        return;
    }
    else if(isEmpty())
        front=rear=0;
    else
        rear=(rear+1)%size;
    Q[rear]=value;
}

int getfront(int Q[])
{
    return Q[front];
}
//the function remove value in queue
void dequeue(int Q[])
{
    if(isEmpty())
    {
        printf("Queue is Empty");
        return;
    }
    else if(front>rear)
        front=rear=-1;
    else
        front=(front+1)%size;
}

void display(int Q[])
{
    if(isEmpty())
    {
        printf("Queue is Empty\n");
        return;
    }
    for(int i=front; i<=rear; i=(i+1)%size)
    {
        printf("%d",Q[i]);
        printf("\n");

    }
    printf("\n");
}

int main()
{
    int Q[size];
    enqueue(Q,12);
    enqueue(Q,23);
    enqueue(Q,84);
    display(Q);
    dequeue(Q);
    display(Q);

    return 0;
}
