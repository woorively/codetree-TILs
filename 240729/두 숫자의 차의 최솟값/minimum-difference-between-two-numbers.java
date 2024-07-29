import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        int ans = 100;

        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i == j)
                    continue;
                ans = Math.min(ans, Math.abs(nums[i] - nums[j]));
            }
        }
        System.out.println(ans);
    }
}