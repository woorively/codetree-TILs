import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        Double a, b;

        // 입력
        a = sc.nextDouble();
        b = sc.nextDouble();

        // 출력
        System.out.printf("%.2f", a + b);
    }
}