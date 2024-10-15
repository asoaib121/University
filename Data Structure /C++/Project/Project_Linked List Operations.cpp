#include <iostream>
#include <unistd.h>
using namespace std;
void scrollCaption()
{
    cout<<"\n\n\n\n                    \t\t";

    cout <<"W";
    usleep(100000);
    cout <<"e";
    usleep(100000);
    cout <<"l";
    usleep(100000);
    cout <<"c";
    usleep(100000);
    cout <<"o";
    usleep(100000);
    cout <<"m";
    usleep(100000);
    cout <<"e";
    usleep(100000);
    cout <<" ";
    usleep(100000);
    cout <<"T";
    usleep(100000);
    cout <<"o";
    cout <<" ";
    usleep(100000);
    cout<<"L";
    usleep(100000);
    cout<<"i";
    usleep(100000);
    cout<<"n";
    usleep(100000);
    cout<<"k";
    usleep(100000);
    cout<<"e";
    usleep(100000);
    cout<<"d";
    usleep(100000);
    cout<<" ";
    usleep(100000);
    cout<<"L";
    usleep(100000);
    cout<<"i";
    usleep(100000);
    cout<<"s";
    usleep(100000);
    cout<<"t";
    usleep(100000);
    cout<<" ";
    usleep(100000);
    cout<<"O";
    usleep(100000);
    cout<<"p";
    usleep(100000);
    cout<<"e";
    usleep(100000);
    cout<<"r";
    usleep(100000);
    cout<<"a";
    usleep(100000);
    cout<<"t";
    usleep(100000);
    cout<<"i";
    usleep(100000);
    cout<<"o";
    usleep(100000);
    cout<<"n";
    usleep(100000);
    cout<<"s";
    cout <<" ";
    usleep(100000);
    cout<<"P";
    usleep(100000);
    cout<<"r";
    usleep(100000);
    cout<<"o";
    usleep(100000);
    cout<<"j";
    usleep(100000);
    cout<<"e";
    usleep(100000);
    cout<<"c";
    usleep(100000);
    cout<<"t";

    cout<<"\n\n\n\n\t\t\t\tPress Enter  to continue.......\n";
    getchar();
}
struct Node
{
    int value;
    Node* tail;
};
struct Node* head = NULL;
void first_insert(int a)
{
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->value = a;
    newNode->tail = head;
    head = newNode;
    cout<<"_______Insert successfull_______"<<endl;
}
void last_insert(int a)
{
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->value = a;
    newNode->tail = NULL;
    if (!head)
    {
        head = newNode;
        return;
    }
    Node* temp = head;
    while (temp->tail)
    {
        temp = temp->tail;
    }
    temp->tail = newNode;
    cout<<"_______Insert successfull_______"<<endl;
}
void insertAtPosition(int a, int pos)
{
    if (pos < 1)
    {
        cout << "Position should be >= 1." << endl;
        return;
    }
    if (pos == 1)
    {
        first_insert(a);
        return;
    }
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->value = a;
    Node* temp = head;
    for (int i = 1; i < pos - 1; ++i)
    {
        if (temp == NULL)
        {
            cout << "Position out of bounds." << endl;
            return;
        }
        temp = temp->tail;
    }
    newNode->tail = temp->tail;
    temp->tail = newNode;
    cout<<"_______Insert successfull_______"<<endl;
}
void First_delete()
{
    if (!head)
    {
        cout << "The List is Empty!" << endl;
        return;
    }
    Node* temp = head;
    head = head->tail;
    delete temp;
    cout<<"_______Delete successfull_______"<<endl;
}
void Last_delete()
{
    if (!head)
    {
        cout << "The List is Empty!" << endl;
        return;
    }
    if (!head->tail)
    {
        delete head;
        head = NULL;
        return;
    }
    Node* temp = head;
    while (temp->tail->tail)
    {
        temp = temp->tail;
    }
    delete temp->tail;
    temp->tail = NULL;
    cout<<"_______Delete successfull_______"<<endl;
}
void DeleteAtPosition(int pos)
{
    if (pos < 1)
    {
        cout << "Position should be >= 1." << endl;
        return;

    }
    if (pos == 1)
    {
        First_delete();
        return;
    }
    Node* temp = head;
    for (int i = 1; i < pos - 1; ++i)
    {
        if (!temp || !temp->tail)
        {
            cout << "Position out of bounds." << endl;
            return;
        }
        temp = temp->tail;
    }
    Node* eraseNode = temp->tail;
    temp->tail = eraseNode->tail;
    delete eraseNode;
    cout<<"_______Delete successfull_______"<<endl;
}
void Display()
{
    if (!head)
    {
        cout << "________The List is Empty________" << endl;
        return;
    }
    Node* temp = head;
    while (temp)
    {
        cout << temp->value << " ---> ";
        temp = temp->tail;
    }
    cout << "NULL!" << endl;
}
int SearchValue(int key)
{
    Node* temp = head;
    while (temp != NULL)
    {
        if (temp->value == key)
        {
            return true;
        }
        temp = temp->tail;
    }
    return false;
}
int main()
{
     scrollCaption();
    int option, value, pos;
    while (1)
    {
        cout << "_______________MENU_______________"<<endl;
        cout<<"1)Insert at the Beginning."<<endl;
        cout<<"2)Insert at the End."<<endl;
        cout<<"3)Insert at the Specific Position."<<endl;
        cout<<"4)Delete at the Beginning."<<endl;
        cout<<"5)Delete at the End."<<endl;

        cout<<"6)Delete at the Specific Position."<<endl;
        cout<<"7)Print the Linklist all Data."<<endl;
        cout<<"8)Search a Data."<<endl;
        cout<<"9)Exit."<<endl;
        cout<<"Enter your choice: ";
        cin >> option;
        switch (option)
        {
        case 1:
            cout<<"Enter value to insert at first: ";
            cin>>value;
            first_insert(value);
            break;
        case 2:
            cout<<"Enter value to insert at last: ";
            cin>>value;
            last_insert(value);
            break;
        case 3:
            cout<<"Enter value to insert: ";
            cin>>value;
            cout<<"Enter position: ";
            cin>>pos;
            insertAtPosition(value, pos);
            break;
        case 4:
            First_delete();
            break;
        case 5:
            Last_delete();
            break;
        case 6:
            cout<<"Enter position to delete: ";
            cin>>pos;
            DeleteAtPosition(pos);
            break;
        case 7:
            Display();
            break;
        case 8:
            cout<<"Enter value to search: ";
            cin>>value;
            if(SearchValue(value))
            {
                cout<<value<<" found in the list."<<endl;
            }
            else
            {
                cout<<value<<" not found."<<endl;
            }
            break;
        case 9:
            exit(0);
        default:

            cout << "Invalid option!" << endl;
        }
    }
    return 0;
}
