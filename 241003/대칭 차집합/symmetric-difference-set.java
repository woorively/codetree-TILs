import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        HashSet<Integer> hs = new HashSet<>();

        for (int i=0; i<n; i++) {
            hs.add(sc.nextInt());
        }

        int[] arr = new int[m];
        for (int i=0; i<m; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i=0; i<m; i++) {
            if (hs.contains(arr[i])) cnt++;
        }

        System.out.println(n + m - cnt*2);
    }
}