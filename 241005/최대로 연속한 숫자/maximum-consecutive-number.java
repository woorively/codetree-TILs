import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        TreeSet<Integer> ts = new TreeSet<>();
        for (int i=0; i<=n; i++) {
            ts.add(i);
        }

        for (int i=0; i<m; i++) {
            int num = sc.nextInt();

            ts.remove(num);

            int maxLength = 1;
            int length = 1;
            int nextNum = ts.first();
            for (int j=1; j<ts.size(); j++) {
                if (ts.higher(nextNum) == nextNum + 1) {
                    length++;
                } else {
                    length = 1;
                }
                
                maxLength = Math.max(maxLength, length);
                nextNum = ts.higher(nextNum);
            }
            System.out.println(maxLength);
        }
    }
}