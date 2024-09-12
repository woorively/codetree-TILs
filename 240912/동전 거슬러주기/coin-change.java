import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] coins = new int[n];
        int[] dp = new int[m+1];

        Arrays.fill(dp, -1);

        for (int i=1; i<=m; i++) {
            int maxCnt = 0;

            for (int j=0; j<coins.length; j++) {
                int coin = coins[j];

                if (i >= coin) {
                    maxCnt = Math.max(maxCnt, dp[i-coin]+1);
                }

                dp[i] = maxCnt;
            }
            
        }

        System.out.println(dp[n]);
    }
}