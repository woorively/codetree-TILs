import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static int n, minDiff;
    static int[] nums;
    static boolean[] used;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        minDiff = Integer.MAX_VALUE;
        used = new boolean[2 * n];
        nums = new int[2 * n];

        for (int i=0; i<2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        combination(0, 0);
        System.out.println(minDiff);
    }

    static void combination(int idx, int sidx) {
        if (sidx == n) {
            calc();
            return;
        }

        for (int i=idx; i<2*n; i++) {
            used[i] = true;
            // System.out.println(Arrays.toString(used));
            combination(i+1, sidx+1);
            used[i] = false;
        }

    }

    static void calc() {
        int sum1 = 0;
        int sum2 = 0;

        for (int i=0; i<2 * n; i++) {
            if (!used[i]) {
                sum2 += nums[i];
            } else {
                sum1 += nums[i];
            }
        }
        minDiff = Math.min(Math.abs(sum1 - sum2), minDiff);
    }
}