import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i=0; i<n; i++) {
            String cmd = sc.next();

            if (cmd.equals("add")) {
                int k = sc.nextInt();
                int v = sc.nextInt();
                m.put(k, v);
            } else {
                int k = sc.nextInt();

                if (cmd.equals("find")) {
                    if (m.containsKey(k)) {
                        System.out.println(m.get(k));
                    } else {
                        System.out.println("None");
                    }
                } else {
                    m.remove(k);
                }
            }
        }
    }
}