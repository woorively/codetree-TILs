import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i=0; i<n; i++) {
            pq.add(sc.nextInt());

            if (pq.size() < 3) {
                System.out.println(-1);
                continue;
            }

            int n1 = pq.poll();
            int n2 = pq.poll();
            int n3 = pq.poll();
            
            pq.add(n1);
            pq.add(n2);
            pq.add(n3);
            
            System.out.println(n1 * n2 * n3);
        }
    }
}