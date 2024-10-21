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

        for (int i=n-2; i>=0; i--) {
            dp[0][i] += dp[0][i+1];
        }

        for (int i=1; i<n; i++) {
            dp[i][n-1] += dp[i-1][n-1];
        }

        for (int i=1; i<n; i++) {
            for (int j=n-2; j>=0; j--) {
                dp[i][j] = Math.min(dp[i][j] + dp[i-1][j], dp[i][j] + dp[i][j+1]);
            }
        }

        // System.out.println(Arrays.deepToString(dp));
        System.out.println(dp[n-1][0]);

    }
}