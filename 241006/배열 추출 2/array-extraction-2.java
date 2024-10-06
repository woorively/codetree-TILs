import java.util.*;

class Pair implements Comparable<Pair> {
    int Num, absNum;

    public Pair(int Num, int absNum) {
        this.Num = Num;
        this.absNum = absNum;
    }

    @Override
    public int compareTo(Pair p) {
        if (this.absNum != p.absNum) return this.absNum - p.absNum;
        else return this.Num - p.Num;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();

            if (x == 0) {
                if (pq.isEmpty()) System.out.println(0);
                else System.out.println(pq.poll().Num);
            } else {
                pq.add(new Pair(x, Math.abs(x)));
            }
        }
    }
}