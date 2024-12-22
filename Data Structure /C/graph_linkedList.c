#include <stdio.h>
#include <stdlib.h>
#define size 20


struct Node
{
    int vertex;
    struct Node* next;
};

//create single node
struct Node* CreateNode(int vertex)
{
    struct Node* newnode=(struct Node*)malloc(sizeof(struct Node));
    newnode->vertex=vertex;
    newnode->next=NULL;
    return newnode;
}

struct graph
{
    int num_vertex;
    struct Node** Adj_list;
};

//create array graph
struct graph* Creategraph(int nov)
{
    struct graph* Graph=(struct graph*)malloc(sizeof(struct graph));
    Graph->num_vertex=nov;
    Graph->Adj_list=(struct Node**)malloc(nov* sizeof(struct Node));
    for(int i=0; i<nov; i++)
    {
        Graph->Adj_list[i]=NULL;
        return Graph;
    }
}

//add graph value
void AddEdge (struct graph* Graph, int i, int j) {
    struct Node* nn = CreateNode (j);
    nn->next = Graph->Adj_list[i];
    Graph->Adj_list[i] = nn;

    nn = CreateNode (i);
    nn->next = Graph->Adj_list[j];
    Graph->Adj_list[j] = nn;
}

//display graph value
void PrintGraph (struct graph* Graph) {
    if (Graph == NULL) {
        printf ("Graph is empty\n");
        return;
    }
    
    for (int i = 0; i < Graph->num_vertex; i++) {
        printf ("Vertex %d: ", i);
        struct Node* temp = Graph->Adj_list[i];
        while (temp != NULL) {
            printf ("%d ", temp->vertex);
            temp = temp->next;
        }
        printf ("\n");
    }
}

int main () {
    int nov = 5;
    struct graph* Graph = Creategraph (nov);
    AddEdge (Graph, 0, 1);
    AddEdge (Graph, 0, 2);
    AddEdge (Graph, 0, 3);
    AddEdge (Graph, 1, 3);
    AddEdge (Graph, 2, 3);
    AddEdge (Graph, 2, 4);
    AddEdge (Graph, 3, 4);
    PrintGraph (Graph);
    return 0;
}
