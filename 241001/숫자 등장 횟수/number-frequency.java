import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<n; i++) {
            int num = sc.nextInt();

            if (map.containsKey(num)) {
                int cnt = map.get(num);
                map.put(num, cnt + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (int i=0; i<m; i++) {
            int inputNum = sc.nextInt();
            
            if (map.containsKey(inputNum)) {
                System.out.print(map.get(inputNum) + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
    }
}