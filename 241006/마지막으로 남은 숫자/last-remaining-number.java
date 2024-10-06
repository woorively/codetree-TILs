import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i=0; i<n; i++) {
            pq.add(-sc.nextInt());
        }

        while(pq.size() >= 2) {
            int n1 = -pq.poll();
            int n2 = -pq.poll();
            
            if (n1 == n2) continue;

            pq.add(-Math.abs(n1-n2));
        }

        if (pq.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(-pq.peek());
        }
    }
}