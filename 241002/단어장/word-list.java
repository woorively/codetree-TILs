import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TreeMap<String, Integer> tm = new TreeMap<>();
        for (int i=0; i<n; i++) {
            String word = sc.next();

            if (tm.containsKey(word)) {
                tm.put(word, tm.get(word) + 1);
            } else {
                tm.put(word, 1);
            }
        }

        Iterator<Entry<String, Integer>> it = tm.entrySet().iterator();
        while(it.hasNext()) {
            Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}