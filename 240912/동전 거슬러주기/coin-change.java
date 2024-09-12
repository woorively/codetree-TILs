import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 동전의 수
        int m = sc.nextInt(); // 금액

        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt(); // 동전의 값을 입력받음
        }

        int[] dp = new int[m + 1];
        Arrays.fill(dp, Integer.MAX_VALUE); // 최대값으로 초기화
        dp[0] = 0; // 금액 0을 만드는 데 필요한 동전 수는 0

        for (int i = 1; i <= m; i++) {
            for (int coin : coins) {
                if (i >= coin && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        if (dp[m] == Integer.MAX_VALUE) {
            System.out.println(-1); // 금액을 만들 수 없는 경우
        } else {
            System.out.println(dp[m]); // 최소 동전 수 출력
        }
    }
}