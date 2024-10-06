import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            int x = sc.nextInt();

            if (x == 0){
                if (pq.isEmpty()) pq.add(0);
                System.out.println(-pq.poll());
            } else {
                pq.add(-x);
            }
        }
    }
}