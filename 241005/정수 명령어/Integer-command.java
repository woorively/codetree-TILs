import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        TreeSet ts = new TreeSet<>();
        for (int tc=0; tc<t; tc++) {
            int k = sc.nextInt();

            for (int i=0; i<k; i++) {
                char cmd = sc.next().charAt(0);

                if (cmd == 'I') {
                    int n = sc.nextInt();
                    ts.add(n);
                } else {
                    int num = sc.nextInt();

                    if (ts.isEmpty()) continue;
                    
                    if (num == 1) {
                        ts.remove(ts.last());
                    } else {
                        ts.remove(ts.first());
                    }
                }
            }

            if (ts.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                System.out.println(ts.last() + " " + ts.first());
            }
        }
    }
}