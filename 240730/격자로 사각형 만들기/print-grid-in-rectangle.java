import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[][] nums = new int[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i==0 || j==0)
                    nums[i][j] = 1;
                else {
                    nums[i][j] = nums[i-1][j] + nums[i][j-1] + nums[i-1][j-1];
                }
            }
        }

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}