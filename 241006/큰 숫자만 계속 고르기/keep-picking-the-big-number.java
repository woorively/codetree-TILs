import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0; i<n; i++) {
            pq.add(-sc.nextInt());
        }

        for (int i=0; i<m; i++) {
            pq.add(-(-pq.poll() - 1));
        }

        System.out.println(-pq.peek());
    }
}