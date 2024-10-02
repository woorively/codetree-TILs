import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> tm = new TreeMap<>();

        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            int x = sc.nextInt();

            if (!tm.containsKey(x)) {
                tm.put(x, i);
            }
        } 

        Iterator<Entry<Integer, Integer>> it = tm.entrySet().iterator();

        while(it.hasNext()) {
            Entry<Integer, Integer> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}