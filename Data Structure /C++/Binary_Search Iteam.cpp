#include <iostream>
using namespace std;
int main()
{
    int i,s_item,size;
    cout<<"Enter the array size: ";
    cin>>size;
    int arr[size];

    cout<<"Enter the arrays values: ";
    for(i=0; i<size; i++)
        cin>>arr[i];

    cout<<"Display the arrays values: ";
    for(i=0; i<size; i++)
        cout<<arr[i]<<" ";

    cout<<"\nEnter the search item: ";
    cin>>s_item;

    int beg=0,end=size-1,mid;
    mid=(beg+end)/2;

    while(arr[mid]!=s_item && beg<=end)
    {
        if(s_item<arr[mid])
            end=mid-1;

        if(s_item>arr[mid])
            beg=mid+1;

        mid=(beg+end)/2;
    }
    if(arr[mid]==s_item)
        cout<<mid<<" is the location of item "<<s_item;
}
