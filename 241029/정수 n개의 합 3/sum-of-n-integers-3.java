import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[][] arr = new int[n+1][n+1];

        for (int i=1; i<n+1; i++) {
            for (int j=1; j<n+1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 누적합 구하기
        for (int i=1; i<n+1; i++) {
            for (int j=1; j<n+1; j++) {
                arr[i][j] += (arr[i-1][j] + arr[i][j-1] - arr[i-1][j-1]);
            }
        }

        // 격자 잡아서 최댓값 구하기
        int maxSum = 0;
        for (int i=1; i<=n+1-k; i++) {
            for (int j=1; j<n+1-k; j++) {
                int sum = arr[i+k][j+k] - arr[i][j+k] - arr[i+k][j] + arr[i][j];
                maxSum = Math.max(sum, maxSum);
            }
        }

        System.out.println(maxSum);
    }
}