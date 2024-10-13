#include <iostream>
using namespace std;

struct Node {
    int data;
    struct Node *next;
};

struct Node* newNode() {
    struct Node* newNode = (struct Node*)malloc (sizeof(struct Node));
    cout << "Enter a value: ";
    cin >> newNode->data;
    return newNode;
}

struct Node* insert_node(struct Node *head) {
    struct Node *node = newNode();

    if (head == NULL) {
        head = node;
        return head;
    }

    struct Node* current_node = head;
    while (current_node->next != NULL) {
        current_node = current_node->next;
    }
    current_node->next = node;
    getchar();
    return head;

}

void display(struct Node *head) {
    while (head != NULL) {
        cout << head->data << " ";
        head = head->next;
    }
    cout << endl;
}

int main() {
    struct Node* head = NULL;
    head = insert_node(head);
    head = insert_node(head);
    head = insert_node(head);
    display(head);

    head=insert_node(head);
    display(head);

    return 0;
}
