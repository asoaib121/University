#include<iostream>
using namespace std;

void Deleted (int arr[],int &size,int posi)
{
   for (int i=posi; i<size-1; i++)
        arr[i] = arr[i+1];

    size--;

    cout << "Display the deleted array: ";
    for (int i=0; i<size; i++)
        cout << arr[i] << " ";

    cout << endl;
}
int main()
{
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

    cout<<"Enter the deletion position:";
    cin>>posi;
    Deleted(arr, size, posi);
    return 0;
}

