package Bfs;
import java.util.*;

    class Eddgee implements Comparable<Eddgee> {
        int src, dest, weight;

        public Eddgee(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }

        @Override
        public int compareTo(Eddgee other) {
            return this.weight - other.weight;
        }
    }

public class Kruskals {
        int V; // Number of vertices
        List<Eddgee> edges; // List of all edges

        public Kruskals(int v) {
            V = v;
            edges = new ArrayList<>();
        }

        void addEdge(int src, int dest, int weight) {
            edges.add(new Eddgee(src, dest, weight));
        }

        // Find set of an element i
        int find(int[] parent, int i) {
            if (parent[i] == i)
                return i;
            return find(parent, parent[i]);
        }

        // Union of two sets
        void union(int[] parent, int[] rank, int x, int y) {
            int xroot = find(parent, x);
            int yroot = find(parent, y);

            if (rank[xroot] < rank[yroot])
                parent[xroot] = yroot;
            else if (rank[xroot] > rank[yroot])
                parent[yroot] = xroot;
            else {
                parent[yroot] = xroot;
                rank[xroot]++;
            }
        }

        void kruskalMST() {
            List<Eddgee> result = new ArrayList<>();
            int i = 0; // Index for sorted edges
            int e = 0; // Index for result[]

            // Sort all edges in non-decreasing order
            Collections.sort(edges);

            int[] parent = new int[V];
            int[] rank = new int[V];

            // Initialize parent and rank arrays
            for (int v = 0; v < V; v++) {
                parent[v] = v;
                rank[v] = 0;
            }

            while (e < V - 1 && i < edges.size()) {
                Eddgee nextEdge = edges.get(i++);

                int x = find(parent, nextEdge.src);
                int y = find(parent, nextEdge.dest);

                // If including this edge doesn't cause cycle
                if (x != y) {
                    result.add(nextEdge);
                    e++;
                    union(parent, rank, x, y);
                }
            }

            // Print the MST
            System.out.println("Edges in the MST:");
            int totalWeight = 0;
            for (Eddgee edge : result) {
                System.out.println(edge.src + " -- " + edge.dest + " == " + edge.weight);
                totalWeight += edge.weight;
            }
            System.out.println("Total weight of MST: " + totalWeight);
        }

        public static void main(String[] args) {
            int V = 4; // Number of vertices
            Kruskals graph = new Kruskals(V);

            // Add edges
            graph.addEdge(0, 1, 10);
            graph.addEdge(0, 2, 6);
            graph.addEdge(0, 3, 5);
            graph.addEdge(1, 3, 15);
            graph.addEdge(2, 3, 4);

            graph.kruskalMST();
        }
    }
