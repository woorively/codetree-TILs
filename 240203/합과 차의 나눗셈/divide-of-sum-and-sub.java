import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%.2f", (double)(a + b) / (a - b));
    }
}