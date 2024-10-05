import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        TreeSet<Integer> ts = new TreeSet<>();

        for (int i=0; i<n; i++) {
            ts.add(sc.nextInt());
        }

        for (int i=0; i<k; i++) {
            System.out.print(ts.last() + " ");
            ts.remove(ts.last());
        }
    }
}