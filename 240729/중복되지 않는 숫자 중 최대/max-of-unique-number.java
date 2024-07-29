import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] cnt = new int[1001];
        for (int i=0; i<n; i++){
            cnt[sc.nextInt()]++;
        }

        int ans = -1;

        for (int i=n-1; i>=0; i--){
            if (cnt[i] == 1) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}