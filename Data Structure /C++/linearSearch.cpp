#include <iostream>

using namespace std;

int linearSearch(int arr[], int n, int target)
{
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == target)
        {
            return i;
        }
    }
    return -1;
}

int main()
{
    int n,target;
    cout << "Enter the array size: ";
    cin >> n;

    int arr[n];
    cout << "Enter the arrays values: ";
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    cout<<"Display the arrays values: ";
    for(int i=0; i<n; i++)
        cout<<arr[i]<<" ";

    cout <<endl;
    cout << "Enter the search item: ";
    cin >> target;

    int result = linearSearch(arr, n, target);

    if (result != -1)
    {
        cout <<target<< " is the location of item " << result << endl;
    }
    else
    {
        cout << "element not found" << endl;
    }

    return 0;
}
