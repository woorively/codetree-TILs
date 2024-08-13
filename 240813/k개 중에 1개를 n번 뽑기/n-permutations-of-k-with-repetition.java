import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> ans = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int n = s.nextInt();

        choose(0, k, n);
    }

    public static void choose(int num, int k, int n) {
        if (num == n){
            for (int i=0; i<ans.size(); i++){
                System.out.print(ans.get(i) + " ");
            }
            System.out.println();
            return;
        }

        for (int i=1; i<=k; i++){
            ans.add(i);
            choose(num + 1, k, n);
            ans.remove(ans.size() - 1);
        }
    }
}