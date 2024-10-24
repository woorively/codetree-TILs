import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int diff = Integer.MAX_VALUE;
        int ans1 = 0;
        int ans2 = -1;
        for (int i=0; i<n; i++) {
            int num = sc.nextInt();

            if (Math.abs(num - 100) <= diff) {
                ans1 = Math.abs(num - 100) == diff ? Math.min(ans1, num) : num;
                diff = Math.abs(num - 100);
            }

            if (num >= 100) {
                if (ans2 == -1) {
                    ans2 = num;
                } else {
                    ans2 = Math.min(ans2, num);
                }
            }
        }

        System.out.println(ans1 + " " + ans2);
    }
}