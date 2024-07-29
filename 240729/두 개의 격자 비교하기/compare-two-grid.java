import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] grid = new int[n][m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        int[][] grid2 = new int[n][m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                grid2[i][j] = sc.nextInt();
            }
        }


        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (grid[i][j] == grid2[i][j])
                    System.out.print(0 + " ");
                else
                    System.out.print(1 + " ");
            }
            System.out.println();
        }

    }
}