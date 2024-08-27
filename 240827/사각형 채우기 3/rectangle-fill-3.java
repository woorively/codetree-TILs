import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        long[] dp = new long[n+1];

        dp[0] = 1;
        dp[1] = 2;
        
        for (int i=2; i<n+1; i++){
            if (i==2)
                dp[2] = 7;
            else
                dp[i] = (dp[i-1] * 3 + dp[i-2] - dp[i-3]) % 1000000007;
        }

        System.out.println(dp[n]);
    }
}