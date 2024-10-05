import java.util.*;

class Pair implements Comparable<Pair> {
    int x, y;

    public Pair(int x, int y) {
        this.x=x;
        this.y=y;
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
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        TreeSet<Pair> ts = new TreeSet<>();
        for (int i=0; i<n; i++) {
            ts.add(new Pair(sc.nextInt(), sc.nextInt()));
        }

        for (int i=0; i<m; i++) {
            int nx = sc.nextInt();
            int ny = sc.nextInt();

            if (ts.ceiling(new Pair(nx, ny)) != null) {
                Pair thisPair = ts.ceiling(new Pair(nx, ny));
                System.out.println(thisPair.x + " " + thisPair.y);
                continue;
            }
            System.out.println(-1 + " " + -1);
        }

    }
}