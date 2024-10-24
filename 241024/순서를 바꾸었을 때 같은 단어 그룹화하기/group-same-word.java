import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();

        int ans = 1;
        for (int i=0; i<n; i++) {
            String word = sc.next();
            char[] wordArr = new char[word.length()];
            for (int j=0; j<word.length(); j++) {
                wordArr[j] = word.charAt(j);
            }

            Arrays.sort(wordArr);

            String newWord = new String(wordArr);

            if (map.containsKey(newWord)) {
                map.put(newWord, map.get(newWord) + 1);
                ans = Math.max(map.get(newWord), ans);
            } else {
                map.put(newWord, 1);
            }
        }

        System.out.println(ans);
    }
}