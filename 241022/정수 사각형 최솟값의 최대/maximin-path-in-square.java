import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n][n];

        int minMin = 101;
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                dp[i][j] = sc.nextInt();
                set.add(dp[i][j]);
                minMin = Math.min(minMin, dp[i][j]);
            }
        }

        int minMax = 0;        
        for (int i=1; i<n; i++) {
            for (int j=1; j<n; j++) {
                int min = Math.min(dp[i-1][j], dp[i][j-1]);
                minMax = Math.max(minMax, min);
            }
        }

        if (n == 1) {
            minMax = dp[0][0];
        }

        if (set.size() == 2) {
            minMax = minMin;
        }
        System.out.println(minMax);

    }
}