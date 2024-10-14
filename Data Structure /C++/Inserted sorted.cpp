#include <iostream>
using namespace std;

void insertionSort(int arr[], int n) {
    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }

        arr[j + 1] = key;
    }
}

int main() {
    int i,n;
cout<<"Enter the arrays size: ";
cin>>n;
int arr[n];

cout<<"Enter the arrays values: ";
for(i=0;i<n;i++)
    cin>>arr[i];

cout<<"display the array values: ";
for(i=0;i<n;i++)
    cout<<arr[i]<<" ";

    cout << endl;

    insertionSort(arr, n);

    cout << "Sorted array: ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}
