import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<Integer, Long> map = new HashMap<>();

        Long ans = 0l;
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            Long y = sc.nextLong();
            
            if (map.containsKey(x)) {
                if (y <= map.get(x)) {
                    ans -= map.get(x);
                    ans += y;
                    map.put(x, y);
                } 
            } else {
                map.put(x, y);
                ans += y;
            }
        }

        System.out.println(ans);
    }
}