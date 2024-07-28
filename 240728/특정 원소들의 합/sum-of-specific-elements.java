import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[4][4];
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for (int i=0; i<4; i++){
            for (int j=0; j<=i; j++){
                ans += grid[i][j];
            }
        }
        System.out.println(ans);
    }
}