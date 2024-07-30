import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

        int[][] nums = new int[n][n];

        int num = 1;
        boolean up = true;
        for (int i=n-1; i>=0; i--){
            if (up) {
                for (int j=n-1; j>=0; j--)
                    nums[j][i] = num++;
                up = false;
            } else {
                for (int j=0; j<n; j++)
                    nums[j][i] = num++;
                up = true;
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