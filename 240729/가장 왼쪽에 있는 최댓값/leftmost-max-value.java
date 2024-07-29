import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int idx = n;
        
        while(idx != 0){
            int max = 0;
            int maxIdx = 0;
            for (int i=idx-1; i>=0; i--){
                if (nums[i] >= max) {
                    max = nums[i];
                    maxIdx = i;
                }
                
            }
            System.out.print(maxIdx + 1 + " ");
            idx = maxIdx;
        }
    }
}