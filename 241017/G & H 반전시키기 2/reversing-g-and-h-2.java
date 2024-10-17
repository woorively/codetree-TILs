import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] gh = new char[n];

        String str = sc.next();
        String targetStr = sc.next();
        for (int i=0; i<n; i++) {
            gh[i] = str.charAt(i);
        }

        int cnt = 0;
        for (int i=n-1; i>=0; i--) {
            if (gh[i] != targetStr.charAt(i)) {
                // 거기서부터 다 바꿔주고
                for (int j=i; j>=0; j--) {
                    gh[j] = gh[j] == 'G' ? 'H' : 'G';
                }

                // 횟수 올리기
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}