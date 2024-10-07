import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] prefixSum = new int[n+1];

        prefixSum[0] = 0;
        for (int i=1; i<=n; i++) {
            prefixSum[i] += sc.nextInt() + prefixSum[i-1];
        }

        int ans = Integer.MIN_VALUE;

        for (int i=k+1; i<=n; i++) {
            int sum = prefixSum[i] - prefixSum[i-k];

            ans = Math.max(sum, ans);
        }
        System.out.println(ans);
    }
}