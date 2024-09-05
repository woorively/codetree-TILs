import java.util.Scanner;

class Edge {
    int x, y, z;

    public Edge(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

public class Main {
    static int[][] graph;
    static boolean[] visited;
    static int[] dist;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        graph = new int[n+1][n+1];
        visited = new boolean[n+1];
        dist = new int[n+1];
        // 주어진 간선 정보 (x, y, z)
        // x -> y로 향하는 간선이 있으며, 가중치는 z 
        Edge[] edges = new Edge[m+1];

        for (int i=1; i<=m; i++) {
            // int x = edges[i].x;
            // int y = edges[i].y;
            // int z = edges[i].z;
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            graph[x][y] = z;
            edges[i] = new Edge(x, y, z);
        }

        for (int i=1; i<=n; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        dist[1] = 0;

        for (int i=1; i<=n; i++) {
            int minIdx = -1;
            for (int j=1; j<=n; j++) {
                if (visited[j]) continue;

                if (minIdx == -1 || dist[minIdx] > dist[j])
                    minIdx = j;
            }

            visited[minIdx] = true;
            for (int j=1; j<=n; j++) {
                if (graph[minIdx][j] == 0) continue;

                dist[j] = Math.min(dist[j], dist[minIdx] + graph[minIdx][j]);
            }
        }

        for (int i=2; i<=n; i++) {
            if (dist[i] == Integer.MAX_VALUE || dist[i] < 0) System.out.println(-1);
            else System.out.println(dist[i]);
        }

    }
    
}