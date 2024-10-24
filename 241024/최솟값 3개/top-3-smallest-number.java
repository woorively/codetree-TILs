import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int i=0; i<n; i++) {
            pq.add((long)sc.nextInt());

            if (pq.size() >= 3) {
                Long num1 = pq.poll();
                Long num2 = pq.poll();
                Long num3 = pq.poll();
                System.out.println(num1 * num2 * num3);

                pq.add(num1);
                pq.add(num2);
                pq.add(num3);
                
            } else {
                System.out.println(-1);
            }
        }
    }
}