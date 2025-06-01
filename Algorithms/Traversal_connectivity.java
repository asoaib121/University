package Bfs;

import java.util.*;

//GraphConnected
public class Traversal_connectivity {
    static void dfs(int node, boolean[] visited, List<List<Integer>> graph, List<Integer> result) {
        visited[node] = true;
        result.add(node);
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) dfs(neighbor, visited, graph, result);
        }
    }

    static boolean isConnected(List<List<Integer>> graph, int n) {
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : graph.get(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.add(v);
                }
            }
        }

        for (boolean v : visited)
            if (!v) return false;
        return true;
    }

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

        System.out.println("Graph is Connected: " + (isConnected(graph, n) ? "YES" : "NO"));

        boolean[] visited = new boolean[n];
        List<Integer> dfsOrder = new ArrayList<>();
        dfs(0, visited, graph, dfsOrder);

        System.out.print("DFS Traversal from node 0: ");
        for (int node : dfsOrder)
            System.out.print(node + " ");
        System.out.println();
    }
}

