import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static int n;
    static ArrayList<Integer> result;
    static boolean[] isVisited;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        isVisited = new boolean[n+1];
        result = new ArrayList<>();
        perm(1);
    }

    static void perm(int idx) {
        if (idx == n+1) {
            for (int i=0; i<n; i++){
                System.out.print(result.get(i) + " ");
            }
            System.out.println();
            return;
        }

        for (int i=1; i<=n; i++) {
            if (!isVisited[i]) {
                result.add(i);
                isVisited[i] = true;
                perm(idx+1);
                result.remove(result.size()-1);
                isVisited[i] = false;                
            }
        }
    }
}