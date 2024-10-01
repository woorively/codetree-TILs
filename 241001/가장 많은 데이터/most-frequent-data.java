import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();

        int maxCnt = 1;
        for (int i=0; i<n; i++) {
            String str = sc.next();

            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);

                maxCnt = Math.max(maxCnt, map.get(str));
            } else {
                map.put(str, 1);
            }
        }

        System.out.println(maxCnt);
    }
}