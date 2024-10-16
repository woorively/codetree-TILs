import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String inputStr = sc.next();
        String targetStr = sc.next();

        int cnt;
        boolean isSame = false;

        if (inputStr.charAt(0) == targetStr.charAt(0)) {
            isSame = true;
        }

        if (isSame) {
            cnt = 0;
        } else {
            cnt = 1;
        }

        for (int i=1; i<n; i++) {
            if (inputStr.charAt(i) != targetStr.charAt(i) && isSame == true) {
                isSame = false;
                cnt++;
            } else if (inputStr.charAt(i) == targetStr.charAt(i))
                isSame = true;
        }
        
        System.out.println(cnt);
    }
}