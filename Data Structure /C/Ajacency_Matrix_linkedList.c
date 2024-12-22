#include <stdio.h>
#define size 10


struct Node
{
    int vertex;
    struct Node* next;
};

//create single node
struct Node* CreateNode(int vertex)
{
    struct Node* newnode=(Node*)malloc(sizeof(struct Node));
    newnode->vertex=vertex;
    newnode->next=NULL;
    return newnode;
}

struct graph
{
    int num_vertex;
    struct node** Adj_list;
};

//create array graph
struct graph* Creategraph(int nov)
{
    struct graph* Graph=(graph*)malloc(sizeof(struct graph));
    Graph->num_vertex=nov;
    Graph->Adj_list=(Node**)malloc(nov* sizeof(struct Node));
    for(int i=0; i<nov; i++)
    {
        graph->Adj_list[i]=NULL;
        return graph;
    }
}

void AddEdge (struct graph* Graph, int i, int j) {
    struct Node* nn = CreateNode (j);
    nn->next = Graph->Adj_list[i];
    Graph->Adj_list[i] = nn;

    nn = CreateNode (i);
    nn->next = Graph->Adj_list[j];
    Graph->Adj_list[j] = nn;
}
