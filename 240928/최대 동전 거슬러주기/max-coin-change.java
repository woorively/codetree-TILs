import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] coins = new int[n];
		int[] dp = new int[m+1];
		Arrays.fill(dp, Integer.MIN_VALUE);
		
		for (int i=0; i<n; i++) {
			coins[i] = sc.nextInt();
		}
		
		dp[0] = 0;
		
		for (int i=1; i<=m; i++) {
			for (int coin : coins) {
				if (i-coin >= 0 && dp[i-coin] != Integer.MIN_VALUE) {
					dp[i] = Math.max(dp[i], dp[i-coin] + 1);
				}
			}
		}

		if (dp[m] == Integer.MIN_VALUE) {
			System.out.print(-1);
		} else {
			System.out.print(dp[m]);
		}
		
	}
}