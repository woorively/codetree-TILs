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
      
        for(int i = 1; i < n; i++)
            dp[i][0] = Math.max(dp[i-1][0], dp[i][0]);
    
        for(int j = 1; j < n; j++)
            dp[0][j] = Math.max(dp[0][j-1], dp[0][j]);

        for (int i=1; i<n; i++) {
            for (int j=1; j<n; j++) {
                dp[i][j] = Math.max(Math.min(dp[i-1][j], dp[i][j-1]), dp[i][j]);
            }
        }

        System.out.println(dp[n-1][n-1]);

    }
}