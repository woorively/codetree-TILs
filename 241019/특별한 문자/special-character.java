import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        HashMap<Character, Integer> hm = new HashMap<>();
        List<Character> lst = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (hm.containsKey(ch)) {
                // 이미 존재하는 문자
                if (hm.get(ch) == 1) {
                    lst.remove((Character) ch); // 캐스팅하여 Character 타입으로 제거
                }
                hm.put(ch, hm.get(ch) + 1);
            } else {
                // 새로운 문자
                hm.put(ch, 1);
                lst.add(ch);
            }
        }
        
        if (lst.size() >= 1) {
            System.out.println(lst.get(0));
        } else {
            System.out.println("None");
        }
    }
}