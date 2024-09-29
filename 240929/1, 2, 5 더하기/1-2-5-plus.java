import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
        int[] arr = new int[] {1, 2, 5};
		
		int[] dp = new int[n+1];
		dp[0] = 1;
		
		for (int i=1; i<=n; i++) {
			for (int num: arr) {
				if (i-num >= 0) {
					dp[i] += dp[i-num];
				}
			}
			dp[i] %= 10007;
		}
		
		System.out.println(dp[n]);
	}
}