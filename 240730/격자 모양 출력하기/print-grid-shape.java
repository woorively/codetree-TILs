import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] nums = new int[n][n];

        for (int t=0; t<m; t++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            nums[r-1][c-1] = r*c;
        }

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}