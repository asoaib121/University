#include<iostream>
using namespace std;

int main(){
    int i,size,posi,value;
    cout<<"Enter the array size:";
    cin>>size;
    int arr[size];

    cout<<"Enter the array:";
    for(i=0; i<size; i++)
        cin>>arr[i];

    cout<<"Display the array:";
    for(i=0; i<size; i++)
        cout<<arr[i]<<" ";

    cout<<endl;
    cout<<"Enter the insertion position:";
    cin>>posi;

    cout<<"Enter the value: ";
    cin>>value;

     for(i=size-1; i>=posi; i--)
        arr[i+1]=arr[i];

    arr[posi]=value;
    size++;

    cout<<"Display the inserted array value:";
    for(i=0; i<size; i++)
        cout<<arr[i]<<" ";

    cout << endl;
}


