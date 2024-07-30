import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] nums = new int[n][m];

        int num = 1;
        for (int k=0; k<= n+m-2; k++){
            for (int i=0; i<n; i++){
                for (int j=0; j<m; j++){
                    if (i + j == k)
                        nums[i][j] = num++;
                }
            }
        }

        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }
}