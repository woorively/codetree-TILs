import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] dp = new int[n+1];

        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 7;
        for (int i=3; i<n+1; i++){
            dp[i] = (dp[i-1] * 3 + dp[i-2] - dp[i-3]) % 1000000007;
        }

        System.out.println(dp[n]);
    }
}