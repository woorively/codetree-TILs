import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static int n, m;
    static ArrayList<Integer> result;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        result = new ArrayList<>();

        n = s.nextInt();
        m = s.nextInt();
        
        combination(1, 0);
    }

    static void combination(int idx, int sidx) {
        if (sidx == m) {
            for (int i=0; i<m; i++){
                System.out.print(result.get(i) + " ");
            }
            System.out.println();
            return;
        }

        for (int i=idx; i<=n; i++){
            result.add(i);
            combination(i+1, sidx+1);
            result.remove(result.size()-1);
        }
    }
}