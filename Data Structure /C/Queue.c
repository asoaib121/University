#include <stdio.h>
#include <stdbool.h>
#define size 20

int rear=-1,front=-1;

//check Queue is Empty or not
bool isEmpty()
{
    if (front==-1) return true;
    else return false;
}

//check Queue is Full
bool isFull()
{
    if (rear==size-1) return true;
    else return false;
}

//this function work insert value in queue
void enqueue(int Q[],int element)
{

    if(isFull()) {
        printf("Queue is Full");
        return;}
    else if(isEmpty())
        front=rear=0;
    else
        rear ++;
    Q[rear]=element;
}

int getFront(int Q[]){
return Q[front];
}

//this function work remove value in Queue
void dequeue(){
if(isEmpty()) {
    printf("Queue is Empty"); //check queue is Empty or not
    return;}
else if(front>rear)
    front=rear=-1;
else
    front++; /*front++ .then remove Queue first value. we know Queue rules (First in First out) */
}

void display(int Q[]){
if(isEmpty()) {
    printf("Queue is Empty");
    return; }

    for(int i=front;i<=rear;i++){
        printf("%d",Q[i]);
        printf("\n");
    }

}
int main(){
    int Q[size];
    enqueue(Q,23);
    enqueue(Q,87);
    enqueue(Q,76);
    display(Q);
    printf("\n");
    dequeue(Q);
    display(Q);
    return 0;

}
