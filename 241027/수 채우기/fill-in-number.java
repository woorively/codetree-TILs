import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 합계 금액
        int ans = -1;

        for (int i = n / 5; i >= 0; i--) { // 5원 동전 최대 개수로 시작해서 감소
            int remainder = n - (i * 5);
            if (remainder % 2 == 0) { // 나머지가 2원으로 나누어떨어지면
                ans = i + (remainder / 2); // 5원 동전 개수 + 2원 동전 개수
                break; 
            }
        }

        System.out.println(ans);
    }
}