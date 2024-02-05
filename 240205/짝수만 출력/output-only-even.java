import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        // 출력
        while (a <= b) {
            if (a % 2 == 0)
                System.out.print(a + " ");
            a += 1;
        }
    }
}