import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        TreeSet<Integer> ts = new TreeSet<>();
        for (int i=1; i<=m; i++) {
            ts.add(i);
        }

        for (int i=0; i<n; i++) {
            int num = sc.nextInt();
            ts.remove(num);
            System.out.println(ts.last());
        }
    }
}