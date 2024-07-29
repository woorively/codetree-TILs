import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prices = new int[n];

        for (int i=0; i<n; i++){
            prices[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if (prices[j] > prices[i]) {
                    ans = Math.max(ans, prices[j] - prices[i]);
                }
            }
        }

        System.out.println(ans);
    }
}