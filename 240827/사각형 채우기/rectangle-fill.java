import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int ans = 0;
        int n = s.nextInt();
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for (int i=1; i <= n; i++){
            if (i==1 || i==2 || i==3){
                dp[i]=i;
            } else {
                dp[i] = (dp[i-1] + dp[i-2]) % 10007;
            }
        }

        System.out.println(dp[n]);
    }
}