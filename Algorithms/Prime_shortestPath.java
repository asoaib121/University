package Bfs;

import java.util.*;

//PrimDijkstraCombo
public class Prime_shortestPath {
    static int primMST(List<List<int[]>> graph, int n) {
        boolean[] visited = new boolean[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{0, 0});
        int totalWeight = 0;

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int u = curr[0], w = curr[1];
            if (visited[u]) continue;
            visited[u] = true;
            totalWeight += w;

            for (int[] neighbor : graph.get(u)) {
                if (!visited[neighbor[0]])
                    pq.add(new int[]{neighbor[0], neighbor[1]});
            }
        }

        return totalWeight;
    }

    static int[] dijkstra(List<List<int[]>> graph, int n) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{0, 0});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int u = curr[0];

            for (int[] neighbor : graph.get(u)) {
                int v = neighbor[0], w = neighbor[1];
                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    pq.add(new int[]{v, dist[v]});
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(), v = sc.nextInt(), w = sc.nextInt();
            graph.get(u).add(new int[]{v, w});
            graph.get(v).add(new int[]{u, w});
        }

        System.out.println("MST Total Weight (Prim): " + primMST(graph, n));

        int[] dist = dijkstra(graph, n);
        System.out.print("Shortest Distances from node 0: ");
        for (int d : dist) System.out.print(d + " ");
        System.out.println();
    }
}

