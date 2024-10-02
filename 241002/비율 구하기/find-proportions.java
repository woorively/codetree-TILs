import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeMap<String, Integer> tm = new TreeMap<>();

        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            String str = sc.next();

            if (tm.containsKey(str)) {
                tm.put(str, tm.get(str)+1);
            } else {
                tm.put(str, 1);
            }
        }

        Iterator<Entry<String, Integer>> it = tm.entrySet().iterator();
        while(it.hasNext()) {
            Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + " " + String.format("%.4f", (double)entry.getValue()/n*100));
        }
    }
}