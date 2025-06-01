package Bfs;

import java.util.*;
//Check Bipartite Graph using BFS
public class BipartiteGraph {
    static boolean bfs(int start, int[] color, List<List<Integer>> graph) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            for (int neighbor : graph.get(node)) {
                if (color[neighbor] == -1) {
                    color[neighbor] = 1 - color[node];
                    q.add(neighbor);
                } else if (color[neighbor] == color[node]) {
                    return false;
                }
            }
        }
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

        int[] color = new int[n];
        Arrays.fill(color, -1);

        boolean isBipartite = true;
        for (int i = 0; i < n; i++) {
            if (color[i] == -1 && !bfs(i, color, graph)) {
                isBipartite = false;
                break;
            }
        }

        System.out.println(isBipartite ? "YES" : "NO");
    }
}

