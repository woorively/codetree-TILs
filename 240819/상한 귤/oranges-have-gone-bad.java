import java.io.*;
import java.util.*;

public class Main {
    static int[][] board;
    static boolean[][] visited;
    static final int[] dirR = {0, 0, -1, 1};
    static final int[] dirC = {-1, 1, 0, 0};
    static Queue<int[]> queue;
    
    public static void main(String args[]) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = 1;
        
        for(int i = 0; i < test_case; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb;
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            board = new int[N][N];
            int[][] startArray = new int[K][2];
            int startArraySize = 0;
            visited = new boolean[N][N];
            queue = new LinkedList<>();
            
            for(int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                
                for(int k = 0; k < N; k++) {
                    int value = Integer.parseInt(st.nextToken());
                    
                    if(value == 2) {
                        startArray[startArraySize][0] = j;
                        startArray[startArraySize++][1] = k;                        
                    }
                    
                    board[j][k] = value == 0 ? -1 : value == 2 ? 0 : Integer.MAX_VALUE;
                }
            }
            
            for(int j = 0; j < startArraySize; j++) {
                int[] startIndex = {startArray[j][0], startArray[j][1], 0};
                visited = new boolean[N][N];
                visited[startIndex[0]][startIndex[1]] = true;
                queue.offer(startIndex);
                bfs();
            }
            
            for(int j = 0; j < N; j++) {
                for(int k = 0; k < N; k++) {
                    if(visited[j][k] == false && board[j][k] == Integer.MAX_VALUE) {
                        board[j][k] = -2;
                    }
                }
            }

            for(int j = 0; j < N; j++) {
                sb = new StringBuilder();
                for(int k = 0; k < N; k++) {
                    sb.append(board[j][k]).append(" ");
                }
                System.out.println(sb);
            }
        }
    }    
    
    static void bfs() {
        while(!queue.isEmpty()) {
            int[] pollItem = queue.poll();
            
            for(int i = 0; i < dirR.length; i++) {
                int nextR = pollItem[0] + dirR[i];
                int nextC = pollItem[1] + dirC[i];
                int nextCount = pollItem[2] + 1;
                if(nextR >= 0 && nextC >= 0 && nextR < board.length && nextC < board.length && !visited[nextR][nextC] && board[nextR][nextC] != -1 && board[nextR][nextC] != 0) {
                    int[] item = {nextR, nextC, nextCount};
                    
                    queue.offer(item);
                    visited[nextR][nextC] = true;
                    board[nextR][nextC] = Math.min(board[nextR][nextC], nextCount);
                }
            }
        }
    }
}