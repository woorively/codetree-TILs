import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        // 출력
        if (a > 0) {
            for (int i = 0; i < b; i++){
                System.out.print(a);
            };
        }
    }
}