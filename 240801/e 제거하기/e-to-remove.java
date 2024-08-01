import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int idx = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'e') {
                idx = i;
                break;
            }
        }
        System.out.print(str.substring(0, idx) + str.substring(idx+1, str.length()));
    }
}