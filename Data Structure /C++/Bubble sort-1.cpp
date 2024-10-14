#include<iostream>
using namespace std;

int main() {

int i,size,pos,small;
cout<<"Enter the arrays size: ";
cin>>size;
int arr[size];

cout<<"Enter the arrays values: ";
for(i=0;i<size;i++)
    cin>>arr[i];

cout<<"display the array values: ";
for(i=0;i<size;i++)
    cout<<arr[i]<<" ";


    for(pos=0;pos<size-1;pos++){
        small=pos;
        for(i=pos+1;i<size;i++){
            if(arr[small]>arr[i])
                small=i;
        }
        swap(arr[pos],arr[small]);
    }
    cout<<"\n array values after sorting: ";
    for(i=0;i<size;i++)
        cout<<arr[i]<<" ";
}
