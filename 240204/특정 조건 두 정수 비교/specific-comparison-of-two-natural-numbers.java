import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a, b;
        
        // 입력
        a = sc.nextInt();
        b = sc.nextInt();

        // 출력
        System.out.print(a < b ? 1 : 0);
        System.out.print(" ");
        System.out.print(a == b ? 1 : 0);
    }
}