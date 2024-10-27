import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = 0;

        if (n >= 5) {
            ans += n/5;
            n %= 5;
            // System.out.println(n + " " + ans);
        } 

        if (n >= 2) {
            ans += n/2;
            n %= 2;
            // System.out.println(n + " " + ans);
        }

        if (n >= 1) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}