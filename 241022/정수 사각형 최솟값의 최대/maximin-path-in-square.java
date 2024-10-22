import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n][n];

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                dp[i][j] = sc.nextInt();
            }
        }

        int minMax = 0;        
        for (int i=1; i<n; i++) {
            for (int j=1; j<n; j++) {
                int min = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[0][0]);
                minMax = Math.max(minMax, min);
            }
        }

        if (n == 1) {
            minMax = dp[0][0];
        }

        System.out.println(minMax);

    }
}