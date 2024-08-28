import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] dp = new int[n+2];

        // dp[0] = 0;
        dp[1] = 1;
        dp[2] = 3;
        for (int i=3; i<n+1; i++){
            dp[i] = dp[i-2] * 2 + dp[i-1];
        }
        System.out.println(dp[n]);
    }
}