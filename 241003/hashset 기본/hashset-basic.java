import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashSet<Integer> hs = new HashSet<>();
        for (int i=0; i<n; i++) {
            String cmd = sc.next();
            int x = sc.nextInt();
            if (cmd.equals("add")) {
                hs.add(x);
            } else if (cmd.equals("remove")) {
                hs.remove(x);
            } else {
                if (hs.contains(x)) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }
        }
    }
}