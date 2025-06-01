package Bfs;

import java.util.*;

class Edge implements Comparable<Eddgee> {
    int u, v, w;
    Edge(int u, int v, int w) { this.u = u; this.v = v; this.w = w; }
    public int compareTo(Eddgee e) { return this.w - e.w; }
}

class DSU {
    int[] parent;
    DSU(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
    }
    int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }
    boolean union(int x, int y) {
        int px = find(x), py = find(y);
        if (px == py) return false;
        parent[py] = px;
        return true;
    }
}

public class KruskalsMst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        List<Eddgee> edges = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(), v = sc.nextInt(), w = sc.nextInt();
            edges.add(new Eddgee(u, v, w));
        }

        Collections.sort(edges);
        DSU dsu = new DSU(n);
        int mstWeight = 0;

        for (Eddgee e : edges) {
            if (dsu.union(e.u, e.v)) {
                mstWeight += e.w;
            }
        }

        System.out.println("Total Weight of MST: " + mstWeight);
    }
}
