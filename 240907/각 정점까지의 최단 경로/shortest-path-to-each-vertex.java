import java.util.*;

public class Main {

    static class Node {
        int v, w; // 정점, 가중
        
        public Node(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }
    
    static int n, m;
    static final int INF = Integer.MAX_VALUE;
    static int[] weights;
    static List<Node>[] graph;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        
        int k = sc.nextInt();
        
        graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < m; i++) {
            int from = sc.nextInt() - 1; // 1-based to 0-based index
            int to = sc.nextInt() - 1;   // 1-based to 0-based index
            int w = sc.nextInt();
            
            graph[from].add(new Node(to, w));
        }
        
        weights = new int[n];
        Arrays.fill(weights, INF); 
        
        dijkstra(k - 1); // 1-based to 0-based index
        
        for (int i = 0; i < n; i++) {
            if (weights[i] == INF) {
                System.out.println(-1);
            } else {
                System.out.println(weights[i]);
            }
        }
        
        sc.close();
    }
    
    static void dijkstra(int start) {
        weights[start] = 0; // 시작점의 가중치를 0으로 설정
        boolean[] visited = new boolean[n];
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.w));
        pq.add(new Node(start, 0));
        
        while (!pq.isEmpty()) {
            Node curr = pq.poll();
            
            if (visited[curr.v]) continue;
            visited[curr.v] = true;
            
            int w = weights[curr.v];
            
            for (Node child : graph[curr.v]) {
                int nextW = w + child.w;
                if (nextW < weights[child.v]) {
                    weights[child.v] = nextW; 
                    pq.add(new Node(child.v, nextW));
                }
            }
        }
    }
}