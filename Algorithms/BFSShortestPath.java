package Bfs;

import java.util.*;
//BFS for Shortest Path in Unweighted Graph
public class BFSShortestPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int[] dist = new int[n];
        Arrays.fill(dist, -1); // -1 means not visited
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        dist[0] = 0;

        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : graph.get(u)) {
                if (dist[v] == -1) {
                    dist[v] = dist[u] + 1;
                    q.add(v);
                }
            }
        }

        System.out.print("Shortest distances from node 0: ");
        for (int d : dist) System.out.print(d + " ");
        System.out.println();
    }
}

