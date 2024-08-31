import java.util.Scanner;

public class Main {
    static int k, n;
    static int[] selected;
    static boolean[] isSelected;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        k = s.nextInt();
        n = s.nextInt();
        selected = new int[n];
        isSelected = new boolean[n];
        perm(0);
    }

    static void perm(int idx) {
        if (idx == n) {
            for (int i=0; i<n; i++){
                System.out.print(selected[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i=1; i<=k; i++) {
            selected[idx] = i;
            isSelected[idx] = true;
            perm(idx+1);
            isSelected[idx] = false;
        }
    }
}