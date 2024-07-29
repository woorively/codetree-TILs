import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
		int b = sc.nextInt();

        int ans = 0;
        int[] cnt = new int[11];
        while (a > 1) {
            cnt[a%b]++;
            a /= b;
        }

        for (int c : cnt) {
            ans += (c*c);
        }

        System.out.println(ans);
        
    }
}