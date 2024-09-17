import java.util.*;

public class Main {
    static int n;
    static int[][] grid;
    static int[] dxs = {0, 0, 1, -1};
    static int[] dys = {1, -1, 0, 0};

    static boolean inRange(int r, int c) {
        return 0 <= r && r < n && 0 <= c && c < n;
    }

    static boolean canMove(int r, int c, int maxNum) {
        for (int d = 0; d < 4; d++) {
            int nx = r + dxs[d];
            int ny = c + dys[d];

            if (inRange(nx, ny) && grid[nx][ny] < maxNum)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int k = sc.nextInt();

        grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int r = sc.nextInt() - 1;
        int c = sc.nextInt() - 1;

        // 시작 위치와 숫자를 큐에 추가
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r, c, grid[r][c]});

        // 반복횟수 k만큼 탐색
        for (int step = 0; step < k; step++) {
            boolean moved = false;
            boolean[][] visited = new boolean[n][n];
            int nextR = r, nextC = c, nextMax = grid[r][c];
            
            while (!q.isEmpty()) {
                int[] curr = q.poll();
                int currR = curr[0];
                int currC = curr[1];
                int currMax = curr[2];

                if (visited[currR][currC]) continue;
                visited[currR][currC] = true;

                // 최대값 업데이트
                if (currMax > nextMax) {
                    nextMax = currMax;
                    nextR = currR;
                    nextC = currC;
                }

                // 상하좌우 이동
                for (int d = 0; d < 4; d++) {
                    int nx = currR + dxs[d];
                    int ny = currC + dys[d];

                    if (inRange(nx, ny) && !visited[nx][ny] && grid[nx][ny] < currMax) {
                        q.add(new int[]{nx, ny, grid[nx][ny]});
                        moved = true;
                    }
                }
            }

            if (!moved) break; // 이동할 위치가 없으면 종료
            r = nextR;
            c = nextC;
            q.add(new int[]{r, c, nextMax});
        }

        // 1 기반 인덱스 출력
        System.out.println((r + 1) + " " + (c + 1));
    }
}