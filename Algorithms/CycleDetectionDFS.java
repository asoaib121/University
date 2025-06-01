package Bfs;

import java.util.*;
//Detect Cycle in Undirected Graph using DFS
public class CycleDetectionDFS {
    static boolean dfs(int node, int parent, boolean[] visited, List<List<Integer>> graph) {
        visited[node] = true;
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, node, visited, graph)) return true;
            } else if (neighbor != parent) {
                return true; // cycle found
            }
        }
        return false;
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

        boolean[] visited = new boolean[n];
        boolean hasCycle = false;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, visited, graph)) {
                    hasCycle = true;
                    break;
                }
            }
        }
        System.out.println(hasCycle ? "YES" : "NO");
    }
}

