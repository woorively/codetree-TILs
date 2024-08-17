import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static int ans = 0;
    public static int bomb = 0;
    public static int n; 
    public static ArrayList<Integer> bNums = new ArrayList<>();
    public static int[][] grid;


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        grid = new int[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                grid[i][j] = s.nextInt();
                if (grid[i][j] == 1){
                    bomb++;
                    grid[i][j] = -1;
                }
            }
        }
        calc(0);
        System.out.print(ans);

    }

    public static boolean inRange(int r, int c){
        return 0 <= r && r < n && 0 <= c && c< n;
    }

    // 폭탄의 영역을 계산해주는 함수
    public static int countArea(){
        int total = 0;
        boolean[][] isVisited = new boolean[n][n];
        int idx = 0;

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (idx >= bomb)
                    return total;

                if (grid[i][j] == -1 && bNums.get(idx) == 1){
                    isVisited[i][j] = true;
                    total++;
                    for (int k=0; k<n; k++){
                        if (isVisited[k][j]){
                            continue;
                        }
                        isVisited[k][j] = true;
                        total++;
                    }
                    idx++;
                } else if (grid[i][j] == -1 && bNums.get(idx) == 2) {
                    isVisited[i][j] = true;
                    total++;

                    if (inRange(i+1, j) && !isVisited[i+1][j]) {
                        isVisited[i+1][j] = true;
                        total++;
                    } else if (inRange(i-1, j) && !isVisited[i-1][j]) {
                        isVisited[i-1][j] = true;
                        total++;
                    } else if (inRange(i, j+1) && !isVisited[i][j+1]) {
                        isVisited[i][j+1] = true;
                        total++;
                    } else if (inRange(i, j-1) && !isVisited[i][j-1]) {
                        isVisited[i][j-1] = true;
                        total++;
                    }
                    idx++;
                } else if (grid[i][j] == -1 && bNums.get(idx) == 3) {
                    isVisited[i][j] = true;
                    total++;

                    if (inRange(i+1, j+1) && !isVisited[i+1][j+1]) {
                        isVisited[i+1][j+1] = true;
                        total++;
                    } else if (inRange(i-1, j-1) && !isVisited[i-1][j-1]) {
                        isVisited[i-1][j-1] = true;
                        total++;
                    } else if (inRange(i-1, j+1) && !isVisited[i-1][j+1]) {
                        isVisited[i-1][j+1] = true;
                        total++;
                    } else if (inRange(i+1, j-1) && !isVisited[i+1][j-1]) {
                        isVisited[i+1][j-1] = true;
                        total++;
                    }
                    idx++;
                }
            }
        }

        return total;
    } 

    // 폭탄의 개수만큼 폭탄 종류를 담은 배열, 계산
    public static void calc(int cnt){
        if (cnt == bomb){
            ans = Math.max(ans, countArea());
            return;
        }

        for (int i=1; i<4; i++){
            bNums.add(i);
            calc(cnt+1);
            bNums.remove(bNums.size()-1);
        }
    }
}