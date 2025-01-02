#include <stdio.h>
#include <stdlib.h>

struct Node
{

    int value;
    struct Node* left;
    struct Node* right;
};

struct Node* createnode (int value)
{
    struct Node* nn=(struct Node*)malloc(sizeof(struct Node));
    nn-> value=value;
    nn->left=NULL;
    nn->right=NULL;

    return nn;
}

struct Node* insert(struct Node* root,int value)
{
    if(root==NULL)
        return createnode(value);

    if(value < root->value)
        root->left=insert(root->left,value);
    else if(value > root-> value)
        root->right=insert(root->right,value);

    return root;

}

void inordertravase(struct Node* root)
{
    if (root != NULL)
    {
        inordertravase(root->left);
        printf("%d  ",root->value);
        inordertravase(root->right);
    }
}
int main() {
struct Node* root=NULL;
root=insert(root,12);
root=insert(root,14);
root=insert(root,18);
root=insert(root,34);
root=insert(root,23);
root=insert(root,95);
root=insert(root,84);
root=insert(root,74);
root=insert(root,35);

inordertravase(root);
printf("\n");

return 0;
}
