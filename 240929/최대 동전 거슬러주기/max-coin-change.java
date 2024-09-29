import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] coins = new int[n];
        for (int i=0; i<n; i++) {
        	coins[i] = sc.nextInt();
        }
		
		int[] dp = new int[m+1];
		Arrays.fill(dp, Integer.MIN_VALUE);
		
		dp[0] = 0; // 0원 동전의 수 
		
		for (int i=0; i<=m; i++) {
			for (int coin : coins) {
				if (i < coin || dp[i-coin] == Integer.MIN_VALUE) 
					continue;
				dp[i] = Math.max(dp[i], dp[i-coin] + 1);
			}
		}
		
		if (dp[m] == Integer.MIN_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(dp[m]);
		}
		
	}
}