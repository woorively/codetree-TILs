import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        b = sc.nextInt();
        a = sc.nextInt();

        // 출력
        while (b >= a) {
            if (b % 2 == 0)
                System.out.print(b + " ");
            b -= 1;
        }
    }
}