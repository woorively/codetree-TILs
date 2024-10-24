import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();

        int ans = 0;
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
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