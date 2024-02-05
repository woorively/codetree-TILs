import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, n;

        a = sc.nextInt();
        n = sc.nextInt();

        // 출력
        for (int i = 0; i < n; i++){
            a = a + n;
            System.out.println(a);
        };
    }
}