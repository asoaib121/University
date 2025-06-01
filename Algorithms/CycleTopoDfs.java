package Bfs;
//DFS + Topological Sort + Cycle Check
import java.util.*;

public class CycleTopoDFS {
    static boolean dfs(int node, List<List<Integer>> graph, int[] visited, Stack<Integer> stack) {
        visited[node] = 1; // visiting
        for (int neighbor : graph.get(node)) {
            if (visited[neighbor] == 1) return true; // cycle
            if (visited[neighbor] == 0 && dfs(neighbor, graph, visited, stack)) return true;
        }
        visited[node] = 2; // visited
        stack.push(node);
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
        }

        int[] visited = new int[n];
        Stack<Integer> stack = new Stack<>();
        boolean hasCycle = false;
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                if (dfs(i, graph, visited, stack)) {
                    hasCycle = true;
                    break;
                }
            }
        }

        System.out.println("Cycle detected: " + (hasCycle ? "YES" : "NO"));
        if (!hasCycle) {
            System.out.print("Topological order: ");
            while (!stack.isEmpty()) System.out.print(stack.pop() + " ");
        }
    }
}

