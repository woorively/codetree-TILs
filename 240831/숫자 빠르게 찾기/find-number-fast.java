import java.util.Scanner;

public class Main {
    static int n, target, idx, left, right;
    static int[] nums;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        int m = s.nextInt();
        
        nums = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = s.nextInt();
        }

        for (int i=0; i<m; i++) {
            target = s.nextInt();
            idx = -1;
            left = 0;
            right = n-1;

            binarySearch();
            System.out.println(idx);
        }
    }

    static void binarySearch() {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                idx = mid + 1;
                return;
            }

            if (nums[mid] > target) {
                right = mid-1;
            } else {
                left = mid + 1;
            }
        }
        return;
    }
}