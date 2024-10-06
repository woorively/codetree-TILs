import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            String cmd = sc.next();

            if (cmd.equals("push")) {
                int a = sc.nextInt();
                pq.add(-a);
            } else if (cmd.equals("pop")) {
                System.out.println(-pq.poll());
            } else if (cmd.equals("size")) {
                System.out.println(pq.size());
            } else if (cmd.equals("empty")) {  
                System.out.println(pq.isEmpty() ? 1 : 0);
            } else if (cmd.equals("top")) {
                System.out.println(-pq.peek());
            }
        }
    }
}