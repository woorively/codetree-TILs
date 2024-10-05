import java.util.*;

class Pair implements Comparable<Pair> {
    int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pair p) {
        if (this.x != p.x) 
            return this.x - p.x;
        else 
            return this.y - p.y;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc. nextInt();

        TreeSet<Pair> ts = new TreeSet<>();
        for (int i=0; i<n; i++) {
            ts.add(new Pair(sc.nextInt(), sc.nextInt()));
        }

        for (int i=0; i<m; i++) {
            int num = sc.nextInt();

            if (ts.ceiling(new Pair(num, 0)) != null) {
                Pair thisPair = ts.ceiling(new Pair(num, 0));
                System.out.println(thisPair.x + " " + thisPair.y);
                ts.remove(thisPair);
                continue;
            }
            System.out.println(-1 + " " + -1);
        }

    }
}