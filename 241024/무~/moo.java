import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = "moo";
        int oCnt = 3;
        while (str.length() <= n) {
            String tmp = str + "m";
            for (int i=0; i<oCnt; i++) {
                tmp += "o";
            }
            oCnt++;
            tmp += str;
            str = tmp;
        }

        System.out.println(str.charAt(n+1));
        
    }
}