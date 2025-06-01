package versity_problems;

import java.util.*;

public class Problem_1 {
    static int queue[] = new int[10];
    static int font = -1, rear = -1;

    static void dfsTopologicalSort(int v, int[][] mat, int[] visit, Stack<Integer> stack) {
        visit[v] = 1;

        for (int c = 0; c < mat.length; c++) {
            if (mat[v][c] == 1 && visit[c] != 1) {
                dfsTopologicalSort(c, mat, visit, stack);
            }
        }
        stack.push(v);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[10][10];
        int node = 8, edge = 9, p1, p2;
        int visit[] = new int[10];
        Stack<Integer> stack = new Stack<>();

        System.out.println("Enter " + edge + " pair of nodes(edge): ");
        for (int i = 0; i < edge; i++) {
            p1 = (int) sc.next().charAt(0) - 'A';
            p2 = (int) sc.next().charAt(0) - 'A';
            mat[p1][p2] = mat[p2][p1] = 1;
        }

        System.out.println("Enter the starting vertex for Topological Sort:");
        int src = (int) sc.next().charAt(0) - 'A';

        dfsTopologicalSort(src, mat, visit, stack);

        System.out.println("Topological Sort Order:");
        while (!stack.isEmpty()) {
            System.out.print((char) (stack.pop() + 'A') + " ");
        }
    }
}
