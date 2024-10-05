import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
           
        TreeSet ts = new TreeSet<>();
        for (int i=0; i<n; i++) {
            ts.add(sc.nextInt());
        }

        for (int i=0; i<m; i++) {
            int num = sc.nextInt();
            if (ts.ceiling(num) != null) {
                System.out.println(ts.ceiling(num));
                continue;
            } 
            System.out.println(-1);
        }
    }
}