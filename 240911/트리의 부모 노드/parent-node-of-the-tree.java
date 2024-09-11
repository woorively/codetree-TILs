import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n+2];
        for (int i=1; i<n; i++) {
            int pNode = sc.nextInt();
            int cNode = sc.nextInt();
            p[cNode] = pNode;
        }

        for (int i=2; i<=n; i++) {
            System.out.println(p[i]);
        }
    }
}