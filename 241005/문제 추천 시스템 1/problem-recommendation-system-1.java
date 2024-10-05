import java.util.*;

class Problem implements Comparable<Problem> {
    int level, number;

    public Problem(int level, int number) {
        this.level = level;
        this.number = number;
    }

    @Override
    public int compareTo(Problem p) {
        if (this.level != p.level) 
            return this.level - p.level;
        else
            return this.number - p.number;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        TreeSet<Problem> ts = new TreeSet<>();

        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int p = sc.nextInt();
            int l = sc.nextInt();
            ts.add(new Problem(l, p));
        }

        int m = sc.nextInt();
        for (int i=0; i<m; i++) {
            String cmd = sc.next();

            if (cmd.equals("rc")) {
                int x = sc.nextInt();

                if (x == 1) {
                    System.out.println(ts.last().number);
                } else {
                    System.out.println(ts.first().number);
                }
            } else {
                int P = sc.nextInt();
                int L = sc.nextInt();

                Problem thisP = new Problem(L, P);
                if (cmd.equals("ad")) {
                    ts.add(thisP);
                } else {
                    ts.remove(thisP);
                }
            } 
        }
    }
}