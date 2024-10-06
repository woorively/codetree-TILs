import java.util.*;

class Pair implements Comparable<Pair>{
    int x, y;

    public Pair (int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pair p) {
        if ((this.x + this.y) != (p.x + p.y))
            return this.x + this.y - p.x - p.y;

        else if (this.x != p.x) {
            return this.x - p.x;
        } else {
            return this.y - p.y;
        }
        
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i=0; i<n; i++) {
            pq.add(new Pair(sc.nextInt(), sc.nextInt()));
        }

        for (int i=0; i<m; i++) {
            Pair pr = pq.poll();
            pq.add(new Pair(pr.x + 2, pr.y + 2));
        }

        Pair thisPair = pq.peek();
        System.out.println(thisPair.x + " " + thisPair.y);
    }
}