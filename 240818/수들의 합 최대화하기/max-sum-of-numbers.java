import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int n;
    public static int ans = 0;
    public static int[][] map;
    public static boolean[] visited;
    public static ArrayList<Integer> location = new ArrayList<>();


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        visited  = new boolean[n];
        map = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                map[i][j] = s.nextInt();
            }
        }
        choose(0);
        System.out.print(ans);
    }

    public static int sum(){
        int total = 0;
        for (int i=0; i<n; i++){
            int r = i;
            int c = location.get(i);
            
            total += map[r][c];
        }

        return total;
    }

    public static void choose(int currNum){
        if (currNum == n){
            ans = Math.max(ans, sum());
            return;
        }

        for (int i=0; i < n; i++){
            if (visited[i])
                continue;

            visited[i] = true;
            location.add(i);

            choose(currNum + 1);

            location.remove(location.size() - 1);
            visited[i] = false;
        }
    }
}