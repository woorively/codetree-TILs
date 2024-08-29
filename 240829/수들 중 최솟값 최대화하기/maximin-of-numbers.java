import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n, minMaxNum = -1;
    static int[] nums;
    static int[][] map;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        map = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                map[i][j] = s.nextInt();
            }
        }

        nums = new int[n];
        fill(0);
        System.out.println(minMaxNum);
    }

    static void fill(int idx) {
        if (idx == n) {
            minMaxNum = Math.max(minMaxNum, mini());
//            System.out.println(Arrays.toString(nums));
            return;
        }
            

        for (int i=0; i<n; i++){
            nums[idx] = i;
            if (check(idx)) {
                fill(idx+1);
            }
        }
    }

    static int mini() {
        int mNum = map[0][nums[0]];
        for (int i=1; i<n; i++){
            mNum = Math.min(map[i][nums[i]], mNum);
        }

        return mNum;
    }

    static boolean check(int idx){
        for (int i=0; i<idx; i++){
            if (nums[idx] == nums[i])
                return false;
        }
        return true;
    }
}