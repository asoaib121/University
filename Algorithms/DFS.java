package Bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DFS {
    int v; //Initialize Number of vertices
    LinkedList<Integer>[] adj; //Adjacency List (int adj[][] it is possible)

    //Constructor to inilialize the graph
    DFS(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    //add method.add two edge
    void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u); // Undirected graph
    }

    void DFSTraversal(int src){
       boolean[] visit = new boolean[v]; //Found visited node
        DFS(src,visit);
    }

    private void DFS(int src, boolean[]visit){

      //  Stack<Integer> q = new Stack<>();
       visit[src]=true;
        System.out.println(src);
        for(int i: adj[src]){
            if(!visit[i]){
                DFS(i,visit);
            }
        }
    }

    public static void main(String[] args) {
        DFS graph = new DFS(20); // Create a graph with 5 vertices

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 4);
        graph.addEdge(1, 0);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 0);
        graph.addEdge(2, 1);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);
        graph.addEdge(3, 2);
        graph.addEdge(3, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);
        graph.addEdge(4, 3);
        graph.addEdge(4, 5);
        graph.addEdge(5,4);

        System.out.println("DFS Traversal starting from vertex 0:");
        graph.DFSTraversal(0); // Perform DFS starting from vertex 0
    }
}

