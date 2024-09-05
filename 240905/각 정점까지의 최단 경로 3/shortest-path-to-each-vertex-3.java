import java.util.Scanner;
import java.util.PriorityQueue;

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
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];
        dist = new int[n + 1];
        
        for (int i = 1; i <= m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            graph[x][y] = z;
        }

        for (int i = 1; i <= n; i++) {
            dist[i] = INF;
        }

        dist[1] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        pq.offer(new int[]{1, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int d = current[1];

            if (visited[node]) continue;
            visited[node] = true;

            for (int next = 1; next <= n; next++) {
                if (graph[node][next] > 0) {
                    int newDist = dist[node] + graph[node][next];
                    if (newDist < dist[next]) {
                        dist[next] = newDist;
                        pq.offer(new int[]{next, newDist});
                    }
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (dist[i] == INF) {
                System.out.println(-1);
            } else {
                System.out.println(dist[i]);
            }
        }
    }
}