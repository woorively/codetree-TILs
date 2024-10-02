import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        TreeMap<Integer, Integer> m = new TreeMap<>();

        for (int i=0; i<n; i++) {
            String cmd = sc.next();

            if (cmd.equals("add")) {
                int k = sc.nextInt();
                int v = sc.nextInt();
                
                m.put(k, v);

            } else if (cmd.equals("remove")) {
                int k = sc.nextInt();

                m.remove(k);
            } else if (cmd.equals("find")) {
                int k = sc.nextInt();

                if (m.containsKey(k)) {
                    System.out.println(m.get(k));
                } else {
                    System.out.println("None");
                }
            } else {
                if (m.isEmpty()) {
                    System.out.println("None");
                    continue;
                }
                
                Iterator<Entry<Integer, Integer>> it = m.entrySet().iterator();

                while(it.hasNext()) {
                    Entry<Integer, Integer> entry = it.next();
                    System.out.print(entry.getValue() + " ");
                }
                System.out.println();
            }
        }
    }
}