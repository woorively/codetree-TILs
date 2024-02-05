import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, cnt;
        cnt = 0;

        for (int i = 0; i < 5; i++){
            a = sc.nextInt();
            if (a % 2 == 0)
                cnt += 1;
        };
        System.out.print(cnt);
    }
}