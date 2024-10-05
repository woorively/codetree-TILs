import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        TreeSet ts = new TreeSet<>();

        for (int i=0; i<n; i++) {
            String cmd = sc.next();

            if (cmd.equals("largest")) {
                if (ts.size() == 0) {
                    System.out.println("None");
                    continue;
                }
                System.out.println(ts.last());
            } else if (cmd.equals("smallest")) {
                if (ts.size() == 0) {
                    System.out.println("None");
                    continue;
                }
                System.out.println(ts.first());
            } else {
                int x = sc.nextInt();

                if (cmd.equals("add")) {
                    ts.add(x);
                } else if (cmd.equals("remove")) {
                    ts.remove(x);
                } else if (cmd.equals("find")) {
                    if (ts.contains(x)) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                } else if (cmd.equals("lower_bound")) {
                    if (ts.ceiling(x) == null) {
                        System.out.println("None");
                        continue;
                    }
                    System.out.println(ts.ceiling(x));
                } else {
                    if (ts.higher(x) == null) {
                        System.out.println("None");
                        continue;
                    }
                    System.out.println(ts.higher(x));
                }
            }
        }
    }
}