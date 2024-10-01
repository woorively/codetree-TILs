import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String[] arr = new String[n+1];
        HashMap<String, Integer> map = new HashMap<>();

        for (int i=1; i<=n; i++) {
            String str = sc.next();
            arr[i] = str;
            map.put(str, i);
        }

        for (int i=0; i<m; i++) {
            String inputStr = sc.next();

            if (map.containsKey(inputStr)) {
                System.out.println(map.get(inputStr));
            } else {
                System.out.println(arr[Integer.parseInt(inputStr)]);
            }
        }
    }
}