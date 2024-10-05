import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        TreeSet<Integer> ts = new TreeSet<>();
        int minDiff = Integer.MAX_VALUE;
        for (int i=0; i<n; i++) {
            int num = sc.nextInt();
            ts.add(num);

            if (ts.ceiling(num+m) != null) {
                minDiff = Math.min(minDiff, ts.ceiling(num+m) - num);
            }
            
            if (ts.floor(num-m) != null) {
                minDiff = Math.min(minDiff, num - ts.floor(num-m));
            }
        }

        if (minDiff == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(minDiff);
        }
    }
}