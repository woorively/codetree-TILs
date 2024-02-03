import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a, b, c;
        
        // 입력
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int tot = a + b + c;

        // 출력
        System.out.printf("%d\n%d\n%d", tot, (int)(double)(tot) / 3, tot - (int)(double)(tot) / 3);
    }
}