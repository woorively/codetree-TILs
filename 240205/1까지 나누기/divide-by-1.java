import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언
        int n;
        int cnt = 0;

        n = sc.nextInt();
        
        for(int i = 1; i <= 100; i++) {
            cnt += 1;
            n /= i;
            // System.out.println(n);
            if(n <= 1) {
                System.out.print(cnt);
                break;
            }
        }
    }
}