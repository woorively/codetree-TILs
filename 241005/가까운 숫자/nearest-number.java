import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(0);

        int minDist = Integer.MAX_VALUE;
        for (int i=0; i<n; i++) {
            int num = sc.nextInt();

            ts.add(num);
            if (ts.higher(num) != null) {
                minDist = Math.min(minDist, ts.higher(num) - num);
            }
            minDist = Math.min(minDist, num - ts.lower(num));

            System.out.println(minDist);
        }
    }
}